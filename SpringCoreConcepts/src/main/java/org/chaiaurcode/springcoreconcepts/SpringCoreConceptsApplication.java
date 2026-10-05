package org.chaiaurcode.springcoreconcepts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreConceptsApplication.class, args);
    }

    UserService userService;

    public SpringCoreConceptsApplication(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception{
        userService.saveUser("Hemant");
    };
}
