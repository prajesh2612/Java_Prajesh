# Write your MySQL query statement below
Select E.name as Employee from Employee E join Employee M where (E.managerID=M.id and E.salary>M.salary);
