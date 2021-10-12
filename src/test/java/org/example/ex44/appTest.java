package org.example.ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    @DisplayName("testConvertToJava")
    void convertToJava() throws FileNotFoundException {

        Products products = app.convertToJava();

        assertEquals("Thing", products.getProducts()[1].getName());

    }

    @Test
    @DisplayName("testProductSearch")
    void productSearch() throws FileNotFoundException {

        //trouble with testing methods requiring user input

    }

    @Test
    @DisplayName("testCheckInventory")
    void checkInventory() throws FileNotFoundException {

        Products products = app.convertToJava();

        assertEquals(1, app.checkInventory("Thing", products));

    }

    @Test
    @DisplayName("testPrintOutput")
    void printOutput() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        app.printOutput(product);

    }
}