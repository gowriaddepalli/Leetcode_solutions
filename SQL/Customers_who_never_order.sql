# Write your MySQL query statement below
Select name as Customers from Customers where id not in (Select CustomerId from Orders) 
