package ru.mrkotyaka.jdbcdemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.mrkotyaka.jdbcdemo.model.Customer;
import ru.mrkotyaka.jdbcdemo.model.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {

    @PersistenceContext
    EntityManager em;

    public static void main(String[] args) {
        SpringApplication.run(JdbcDemoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Customer customer1 = Customer.builder()
                .name("ivan")
                .surname("ivanov")
                .age(25)
                .phoneNumber("+79161234568").build();
        em.persist(customer1);
        Customer customer = em.find(Customer.class, customer1.getId());

        List<Order> orders = new ArrayList<>();
        orders.add(Order.builder()
                .date(new Date())
                .customer(customer)
                .productName("laptop")
                .amount(100000).build());
        orders.add(Order.builder()
                .date(new Date())
                .customer(customer)
                .productName("smartphone")
                .amount(30000).build());
        orders.forEach(order -> em.persist(order));
    }
}
