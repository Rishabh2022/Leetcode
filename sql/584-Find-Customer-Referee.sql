# Write your MySQL query statement below


#https://leetcode.com/problems/find-customer-referee/?envType=study-plan-v2&envId=top-sql-50

# we cannot check null by ==

select name from customer where referee_id <> 2 or referee_id is null
