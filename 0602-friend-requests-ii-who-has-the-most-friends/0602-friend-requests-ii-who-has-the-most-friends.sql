# Write your MySQL query statement below
SELECT 
    id, 
    sum(count) AS num
FROM (
    SELECT 
        requester_id AS id,
        count(requester_id) AS count
    FROM RequestAccepted
    GROUP BY requester_id
    UNION ALL
    SELECT 
        accepter_id AS id,
        count(accepter_id) AS count
    FROM RequestAccepted
    GROUP BY accepter_id
) r
GROUP BY id
ORDER BY num DESC 
LIMIT 1;