# Write your MySQL query statement below
select d.name as Department, 
    e.name as Employee,
    e.salary as Salary

from Employee e
Join  Department d
    ON e.departmentId = d.id
where e.salary = (
    Select max(salary)
    from Employee
    where departmentId = e.departmentId
);