# Write your MySQL query statement below
SELECT 
    d.name AS Department,
    e.name AS Employee, 
    e.salary AS Salary
FROM Employee e
JOIN Department d ON (e.departmentId = d.id)
WHERE (e.id, e.salary) IN 
(
    SELECT 
        id, 
        MAX(salary) OVER (PARTITION BY departmentId ORDER BY salary DESC) AS salary
    FROM Employee
);