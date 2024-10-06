# Write your MySQL query statement below

#https://leetcode.com/problems/average-time-of-process-per-machine/?envType=study-plan-v2&envId=top-sql-50

select a.machine_id, round(avg(b.timestamp-a.timestamp), 3) as processing_time
 from Activity a inner join Activity b 
where a.machine_id=b.machine_id and a.process_id=b.process_id 
and   a.activity_type='start' and b.activity_type='end'
group by a.machine_id

