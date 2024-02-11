package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProductTest {
    @Test
    void testFindCheapestProduct() {
        Product[] products = {
            new Product(1, "Laptop", 1200.99),
            new Product(2, "Smartphone", 699.99),
            new Product(3, "Tablet", 250.00),
            new Product(4, "Monitor", 300.00)
        };

        Product cheapest = App.findCheapestProduct(products);
        assertEquals(250.00, cheapest.price(), "The cheapest product should be the Tablet at $250.00");
    }

    @Test
    void testFindCheapestProductWithEmptyArray() {
        Product[] products = {};
        Product cheapest = App.findCheapestProduct(products);
        assertNull(cheapest, "The result should be null for an empty array");
    }

    @Test
    void testFindCheapestProductWithNullArray() {
        Product cheapest = App.findCheapestProduct(null);
        assertNull(cheapest, "The result should be null for a null input");
    }
}
