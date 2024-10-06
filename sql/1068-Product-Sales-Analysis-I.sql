# Write your MySQL query statement below


#https://leetcode.com/problems/product-sales-analysis-i/?envType=study-plan-v2&envId=top-sql-50

select product_name, year, price from Product p inner join Sales s on p.product_id=s.product_id;
