package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeacherLoadBase {
    private static final Logger log = LoggerFactory.getLogger(UserLoadBase.class);

    @Bean
    CommandLineRunner initDatabaseTeacher(TeacherRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Teacher("Pedro", "pedro@gmail.com", "CCO")));
            log.info("Preloading" + repository.save(new Teacher("Fulano", "pedro2@gmail.com", "PPI")));
            log.info("Preloading" + repository.save(new Teacher("Pedro 3", "pedro3@gmail.com", "MCC")));
        };

    }
}
