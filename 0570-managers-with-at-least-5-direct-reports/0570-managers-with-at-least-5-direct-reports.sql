# Write your MySQL query statement below
Select e.name 
from Employee e 
join Employee m
on e.id = m.managerId
Group by e.id, e.name
Having count(m.id) >= 5;