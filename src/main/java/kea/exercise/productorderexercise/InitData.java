package kea.exercise.productorderexercise;

import kea.exercise.productorderexercise.models.Order;
import kea.exercise.productorderexercise.models.OrderLine;
import kea.exercise.productorderexercise.models.Product;
import kea.exercise.productorderexercise.repositories.OrderLineRepository;
import kea.exercise.productorderexercise.repositories.OrderRepository;
import kea.exercise.productorderexercise.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final OrderLineRepository orderLineRepository;
    private final OrderRepository orderRepository;

    public InitData(ProductRepository productRepository, OrderLineRepository orderLineRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
        this.orderRepository = orderRepository;
    }

    public void run(String... args) {
        System.out.println("InitData is running");
        Product product = new Product();
        product.setName("Frosne ærter");
        product.setDescription("Lækre ærter - lige til at tø op");
        product.setPrice(29.95);
        product.setEAN13("58412568546356532");

        productRepository.save(product);

        Product product2 = new Product();
        product2.setName("Frosne majs");
        product2.setDescription("Lækre majs - lige til at tø op");
        product2.setPrice(19.95);
        product2.setEAN13("51798347124914");

        productRepository.save(product2);

        Product product3 = new Product();
        product3.setName("Frosne bønner");
        product3.setDescription("Lækre bønner - lige til at tø op");
        product3.setPrice(39.95);
        product3.setEAN13("59817561295712");

        productRepository.save(product3);

        OrderLine line1 = new OrderLine();
        line1.setProduct(product);
        line1.setQuantity(6);
        //orderLineRepository.save(line1);

        OrderLine line2 = new OrderLine();
        line2.setProduct(product3);
        line2.setQuantity(4);
        //orderLineRepository.save(line2);

        OrderLine line3 = new OrderLine();
        line3.setProduct(product3);
        line3.setQuantity(2);
        //orderLineRepository.save(line3);

        Order order = new Order();
        order.setOrderLines(List.of(line1,line2));
        order.setOrderDate(LocalDate.now());
        orderRepository.save(order);

        OrderLine line4 = new OrderLine();
        line4.setProduct(product3);
        line4.setQuantity(11);

        OrderLine line5 = new OrderLine();
        line5.setProduct(product);
        line5.setQuantity(12);

        Order order2 = new Order();
        order2.setOrderLines(List.of(line4,line5));
        order2.setOrderDate(LocalDate.now());
        orderRepository.save(order2);
    }
}


