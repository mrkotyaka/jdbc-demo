--liquibase formatted sql
--changeset mrkotyaka:1
CREATE TABLE MAIN.CUSTOMERS (
                                         id SERIAL PRIMARY KEY,
                                         name VARCHAR(255) NOT NULL,
                                         surname VARCHAR(255) NOT NULL,
                                         age INTEGER NOT NULL,
                                         phone_number VARCHAR(20)
);

CREATE TABLE MAIN.ORDERS (
                                      id SERIAL PRIMARY KEY,
                                      date DATE NOT NULL,
                                      customer_id INTEGER NOT NULL,
                                      product_name VARCHAR(255) NOT NULL,
                                      amount NUMERIC NOT NULL,
                                      CONSTRAINT fk_orders_customer FOREIGN KEY (customer_id) REFERENCES CUSTOMERS(id)
);
--rollback DROP TABLE ORDERS;
--rollback DROP TABLE CUSTOMERS;