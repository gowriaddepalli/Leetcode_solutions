# Write your MySQL query statement below

Select class from (select class, count(Distinct student) as freq from courses group by class) as ctable where freq>=5;
