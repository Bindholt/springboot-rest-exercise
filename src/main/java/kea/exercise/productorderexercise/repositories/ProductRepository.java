package kea.exercise.productorderexercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import kea.exercise.productorderexercise.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
