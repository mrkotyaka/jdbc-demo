package ru.mrkotyaka.jdbcdemo.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.mrkotyaka.jdbcdemo.model.Order;

import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Order> getProductName(String name) {
        Query query = em.createQuery("select o from Order o join Customer c on o.customer.id = c.id where c.name = :name");
        query.setParameter("name", name);
        return (List<Order>) query.getResultList();
    }
}
