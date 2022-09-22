package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        long softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        long dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        long greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    void TestQuery() {
        //Given
        Employee janNowak = new Employee("Jan", "Nowak");
        Employee adamNowak = new Employee("Adam", "Nowak");
        Employee michalRys = new Employee("Michal", "Rys");

        Company company = new Company("Company");
        Company company1 = new Company("Company1");
        Company company2 = new Company("Company2");

        janNowak.getCompanies().add(company);
        janNowak.getCompanies().add(company1);
        janNowak.getCompanies().add(company2);

        company.getEmployees().add(janNowak);
        company.getEmployees().add(adamNowak);
        company.getEmployees().add(michalRys);

        companyDao.save(company);
        employeeDao.save(janNowak);

        //When
        List<Employee> findByLastname = employeeDao.findByLastName("Nowak");
        List<Employee> findByLastname2 = employeeDao.findByLastName("Rys");
        List<Company> findByFirstThreeLetters = companyDao.findByTheFirstThreeLetters("Com");
        List<Company> findByFirstThreeLetters2 = companyDao.findByTheFirstThreeLetters("Comp");

        //Then
        assertEquals(2, findByLastname.size());
        assertEquals(3, findByFirstThreeLetters.size());
        assertEquals(1, findByLastname2.size());
        assertEquals(0, findByFirstThreeLetters2.size());

        //CleanUp
        try {
            companyDao.deleteAll();
            employeeDao.deleteAll();

        } catch (Exception e) {
            //do nothing
        }
    }
}