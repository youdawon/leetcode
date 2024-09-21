# Write your MySQL query statement below
SELECT 
    e.employee_id
FROM Employees e
LEFT JOIN Employees em ON e.manager_id = em.employee_id
WHERE e.salary < 30000 
AND em.employee_id IS NULL 
AND e.manager_id is NOT NULL
ORDER BY e.employee_id;