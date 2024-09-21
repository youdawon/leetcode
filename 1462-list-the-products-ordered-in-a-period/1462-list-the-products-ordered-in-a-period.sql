# Write your MySQL query statement below
SELECT 
    p.product_name, 
    SUM(o.unit) AS unit
FROM Orders o
JOIN Products p ON o.product_id = p.product_id
WHERE 
    DATE_FORMAT(order_date, '%Y-%m') = '2020-02'
GROUP BY o.product_id
HAVING SUM(o.unit) >= 100;