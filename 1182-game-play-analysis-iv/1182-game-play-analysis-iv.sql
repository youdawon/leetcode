# Write your MySQL query statement below

SELECT 
    ROUND(
        COUNT(DISTINCT player_id) 
        / (SELECT COUNT(DISTINCT player_id) FROM Activity)
        , 2) AS fraction
FROM Activity
WHERE (player_id, DATE_SUB(event_date, interval 1 day)) in (
    SELECT 
        player_id, 
        MIN(event_date)
    FROM Activity
    GROUP BY player_id
);