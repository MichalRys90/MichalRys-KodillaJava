package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testCompanyFacade() {
        //Given
        Company company = new Company("Company1");
        Company company1 = new Company("Company2");
        Company company2 = new Company("Company3");

        //When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);

        long c = company.getId();
        long c1 = company1.getId();
        long c2 = company2.getId();

        List<Company> companies = facade.findForAnyCompanyName("m");

        //Then
        assertEquals(3, companies.size());

        //ClenUp
        companyDao.deleteById(c);
        companyDao.deleteById(c1);
        companyDao.deleteById(c2);
    }

    @Test
    void testEmployeeFacade() {
        //Given
        Employee employee = new Employee("firstname1", "lastname1");
        Employee employee1 = new Employee("firstname2", "lastname2");
        Employee employee2 = new Employee("firstname3", "lastname3");

        //When
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);

        long c = employee.getId();
        long c1 = employee1.getId();
        long c2 = employee2.getId();

        List<Employee> employees = facade.findForAnyString("name");

        //Then
        assertEquals(3, employees.size());

        //ClenUp
        employeeDao.deleteById(c);
        employeeDao.deleteById(c1);
        employeeDao.deleteById(c2);
    }
}
