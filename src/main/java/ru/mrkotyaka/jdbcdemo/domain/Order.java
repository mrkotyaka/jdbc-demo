package ru.mrkotyaka.jdbcdemo.domain;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime date;
    private Integer customer_id;
    private String product_name;
    private Integer amount;
    private Customer customer;

    public Order(Integer id, LocalDateTime date, Integer customer_id, String product_name, Integer amount, Customer customer) {
        this.id = id;
        this.date = date;
        this.customer_id = customer_id;
        this.product_name = product_name;
        this.amount = amount;
        this.customer = customer;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
