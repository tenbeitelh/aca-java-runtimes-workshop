package io.containerapps.javaruntime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, properties = {
        "spring.datasource.url=jdbc:tc:postgresql:14-alpine://testcontainers/postgres",
        "spring.datasource.username=postgres",
        "spring.datasource.password=password"
})
public class SpringbootApplicationTests {

    @Test
    void contextLoads() {
    }

}