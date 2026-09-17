package com.crm.customer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(excludeAutoConfiguration = DataSourceAutoConfiguration.class)
class CustomerServiceApplicationTests {

    @Test
    void contextLoads() {
    }
}
