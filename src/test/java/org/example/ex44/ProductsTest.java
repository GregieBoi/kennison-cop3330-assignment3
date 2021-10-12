package org.example.ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    @DisplayName("testGetProducts")
    void getProducts() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        Product[] prodArr = {product};

        Products products = new Products();
        products.setProducts(prodArr);

        assertEquals(product, products.getProducts()[0]);

    }

    @Test
    @DisplayName("testSetProducts")
    void setProducts() {

        Product product = new Product();
        product.setName("iPad");
        product.setPrice(25.00);
        product.setQuantity(10);

        Product[] prodArr = {product};

        Products products = new Products();
        products.setProducts(prodArr);

        assertEquals(product, products.getProducts()[0]);

    }
}