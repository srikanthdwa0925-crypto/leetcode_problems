# Write your MySQL query statement below
SELECT employee.name as employee
FROM Employee employee
JOIN Employee manager
    ON employee.managerId = manager.id
WHERE employee.salary > manager.salary;