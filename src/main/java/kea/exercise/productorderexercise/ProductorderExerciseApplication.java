package kea.exercise.productorderexercise;

import kea.exercise.productorderexercise.repositories.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class ProductorderExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductorderExerciseApplication.class, args);
        System.out.println("Run some code here");

    }
}
