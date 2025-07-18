--liquibase formatted sql
--changeset mrkotyaka:2
INSERT INTO MAIN.CUSTOMERS (name, surname, age, phone_number)
VALUES
    ('alexey', 'ivanov', 30, '+79161234567'),
    ('ivan', 'petrov', 25, '+79161234568'),
    ('alexey', 'sidorov', 40, '+79161234569');

INSERT INTO MAIN.ORDERS (date, customer_id, product_name, amount)
VALUES
    ('2023-01-01', 1, 'smartphone', 50000.00),
    ('2023-01-15', 1, 'laptop', 100000.00),
    ('2023-02-01', 2, 'tablet', 30000.00),
    ('2023-02-15', 3, 'smartphone', 50000.00),
    ('2023-03-01', 3, 'headphones', 10000.00);
--rollback DELETE FROM ORDERS;
--rollback DELETE FROM CUSTOMERS;