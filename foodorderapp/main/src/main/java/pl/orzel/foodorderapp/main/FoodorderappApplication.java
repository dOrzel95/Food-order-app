package pl.orzel.foodorderapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "pl.orzel.foodorderapp")
public class FoodorderappApplication {
    public static void main(String[] args) {

        SpringApplication.run(FoodorderappApplication.class, args);
    }
}