package com.classicmodels;

import com.classicmodels.pojo.EmployeeData;
import com.classicmodels.pojo.SaleStats;
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

            System.out.println("Fetching sales and total sale:");
            SaleStats sales = classicModelsService.fetchSalesAndTotalSale();
            System.out.println(sales);

          //  System.out.println("Fetching all employees:");
          //  List<EmployeeData> employees = classicModelsService.fetchAllEmployee();
           // System.out.println(employees);
            
            //classicModelsService.z();
        };
    }
}
