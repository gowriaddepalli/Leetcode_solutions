# Write your MySQL query statement below
Update salary set sex = CASE sex
   WHEN 'm' then 'f'
   else 'm'
   end;
