# Write your MySQL query statement below

#https://leetcode.com/problems/percentage-of-users-attended-a-contest/description/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
select r.contest_id, round((count(distinct r.user_id)*100/(select count(*) from Users)),2) as percentage
from  Register as r
left join Users as u on u.user_id = r.user_id
group by contest_id
order by percentage desc, r.contest_id asc