# Write your MySQL query statement below
SELECT 
    user_id,
    CONCAT(
        UPPER(SUBSTRING(name, 1, 1)), 
        LOWER(SUBSTRING(name, 2, LENGTH(name)))
        ) AS name
FROM Users
ORDER BY user_id ASC;