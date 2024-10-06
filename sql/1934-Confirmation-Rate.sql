# Write your MySQL query statement below

#https://leetcode.com/problems/confirmation-rate/description/?envType=study-plan-v2&envId=top-sql-50


# Write your MySQL query statement below
-- SELECT s.user_id,
--       ROUND((AVG(CASE
--           WHEN action='confirmed' THEN 1
--           ELSE 0
--           END)),2) AS confirmation_rate
-- FROM Signups s
-- LEFT JOIN Confirmations c ON s.user_id=c.user_id
-- GROUP BY user_id

SELECT s.user_id, ROUND(AVG(IF(c.action="confirmed",1,0)),2) AS confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c
ON s.user_id = c.user_id
GROUP BY s.user_id;
