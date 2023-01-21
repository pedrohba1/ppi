package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserLoadBase {
    private static final Logger log = LoggerFactory.getLogger(UserLoadBase.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
          log.info("Preloading" + repository.save(new User("Steave Jobs", "steave@apple.com")));
          log.info("Preloading" + repository.save(new User("Bill Gates", "bill@ms.com")));
          log.info("Preloading" + repository.save(new User("Elon Musk", "elon@tesla.com")));
        };
    }
}
