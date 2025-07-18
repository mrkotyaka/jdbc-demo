SELECT o.product_name
FROM main.ORDERS o
         JOIN main.CUSTOMERS c ON o.customer_id = c.id
WHERE c.name = :name
ORDER BY o.date DESC
LIMIT 1