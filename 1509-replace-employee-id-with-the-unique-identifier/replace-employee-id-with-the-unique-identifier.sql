# Write your MySQL query statement below
select e.unique_id,es.name
from employees es
left join employeeUni e
on es.id=e.id;