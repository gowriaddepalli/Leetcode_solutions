# Write your MySQL query statement below
Select Department.Name as Department,Employee.Name as Employee, Employee.Salary as Salary from Employee inner join Department on Employee.DepartmentId = Department.Id
where 
(Employee.DepartmentId , Salary) IN
    (   SELECT
            DepartmentId, MAX(Salary)
        FROM
            Employee
        GROUP BY  DepartmentId
	)
order by Employee.DepartmentId  desc;
