# Write your MySQL query statement below

SELECT 
    d.name AS Department, 
    e.name As Employee,
    e.salary AS Salary
FROM Employee e
JOIN Department d ON (e.departmentId = d.id)
WHERE (d.id, e.salary) in (
   SELECT 
   departmentId,
    max(salary) 
    FROM Employee
    GROUP BY departmentId
)

