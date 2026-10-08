# Write your MySQL query statement below
select w.id as Id
from weather w
join weather t
on w.recordDate=DATE_ADD(t.recordDate,INTERVAL 1 DAY)
where w.temperature>t.temperature;