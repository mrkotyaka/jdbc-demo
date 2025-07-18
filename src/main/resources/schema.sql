CREATE TABLE IF NOT EXISTS main.CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR(255) NOT NULL,
    surname      VARCHAR(255) NOT NULL,
    age          INTEGER      NOT NULL,
    phone_number VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS main.ORDERS
(
    id           SERIAL PRIMARY KEY,
    date         DATE         NOT NULL,
    customer_id  INTEGER      NOT NULL,
    product_name VARCHAR(255) NOT NULL,
    amount       NUMERIC      NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES main.CUSTOMERS (id)
);

INSERT INTO main.CUSTOMERS (name, surname, age, phone_number)
VALUES ('alexey', 'ivanov', 30, '+79161234567'),
       ('ivan', 'petrov', 25, '+79161234568'),
       ('alexey', 'sidorov', 40, '+79161234569');

INSERT INTO main.ORDERS (date, customer_id, product_name, amount)
VALUES ('2023-01-01', 1, 'smartphone', 50000.00),
       ('2023-01-15', 1, 'laptop', 100000.00),
       ('2023-02-01', 2, 'tablet', 30000.00),
       ('2023-02-15', 3, 'smartphone', 50000.00),
       ('2023-03-01', 3, 'headphones', 10000.00);