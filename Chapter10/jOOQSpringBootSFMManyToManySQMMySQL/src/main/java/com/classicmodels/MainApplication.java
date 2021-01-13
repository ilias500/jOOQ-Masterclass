package com.classicmodels;

import com.classicmodels.pojo.SimpleManager;
import com.classicmodels.service.ClassicModelsService;
import java.util.List;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final ClassicModelsService classicModelsService;

    public MainApplication(ClassicModelsService classicModelsService) {
        this.classicModelsService = classicModelsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            System.out.println("Sample: Fetch managers and offices:");
            List<SimpleManager> result = classicModelsService.fetchManagerAndOffice();
            System.out.println(result);

        };
    }
}
