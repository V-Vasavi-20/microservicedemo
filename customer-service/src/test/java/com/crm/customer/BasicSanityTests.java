package com.crm.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BasicSanityTests {

    @Test
    void additionShouldWorkCorrectly() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void stringShouldNotBeEmpty() {
        String serviceName = "customer-service";
        assertTrue(serviceName.length() > 0);
    }
}
