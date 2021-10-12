package org.example.ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    @DisplayName("testGetName")
    void getName() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals("iPad", product.getName());

    }

    @Test
    @DisplayName("testSetName")
    void setName() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals("iPad", product.getName());

    }

    @Test
    @DisplayName("testGetPrice")
    void getPrice() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals(25.00 , product.getPrice());

    }

    @Test
    @DisplayName("testSetPrice")
    void setPrice() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals(25.00 , product.getPrice());

    }

    @Test
    @DisplayName("testGetQuantity")
    void getQuantity() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals(10 , product.getQuantity());

    }

    @Test
    @DisplayName("testSetQuantity")
    void setQuantity() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        assertEquals(10 , product.getQuantity());

    }
}