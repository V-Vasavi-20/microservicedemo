package com.crm.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(excludeAutoConfiguration = DataSourceAutoConfiguration.class)
class AuthServiceApplicationTests {

    @Test
    void contextLoads() {
    }
}
