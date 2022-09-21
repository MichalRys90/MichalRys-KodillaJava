package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Chocolate");
        Product product2 = new Product("Coffee");
        Product product3 = new Product("Bike");
        Product product4 = new Product("Whisky");
        Item item1 = new Item(new BigDecimal(3), 50);
        Item item2 = new Item(new BigDecimal(12), 10);
        Item item3 = new Item(new BigDecimal(3500), 2);
        Item item4 = new Item(new BigDecimal(99), 100);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product4);
        Invoice invoice = new Invoice("10");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        invoiceDao.save(invoice);
        long id = invoice.getId();
        int listSize = invoice.getItems().size();

        //Then
        assertEquals(4, listSize);
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
