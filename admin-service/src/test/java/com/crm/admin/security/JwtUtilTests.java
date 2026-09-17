package com.crm.admin.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JwtUtilTests {

    private JwtUtil jwtUtil;

    @BeforeEach
    void setUp() {
        jwtUtil = new JwtUtil(
            "Y3JtU2VjcmV0S2V5Rm9yVGVuYW50Q3JtQXBwbGljYXRpb24yMDI2",
            28800000L
        );
    }

    @Test
    void generateToken_shouldProduceValidToken() {
        String token = jwtUtil.generateToken("vasavi", "ADMIN");
        assertTrue(jwtUtil.isValid(token));
    }

    @Test
    void extractUsername_shouldReturnCorrectUsername() {
        String token = jwtUtil.generateToken("vasavi", "ADMIN");
        assertEquals("vasavi", jwtUtil.extractUsername(token));
    }

    @Test
    void extractRole_shouldReturnCorrectRole() {
        String token = jwtUtil.generateToken("vasavi", "ADMIN");
        assertEquals("ADMIN", jwtUtil.extractRole(token));
    }

    @Test
    void isValid_shouldReturnFalseForGarbageToken() {
        assertFalse(jwtUtil.isValid("this.is.not.a.valid.token"));
    }
}
