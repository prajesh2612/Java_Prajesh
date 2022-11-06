# Write your MySQL query statement below
Select B.id from Weather A INNER JOIN Weather B where DATEDIFF(b.recordDate, a.recordDate)=1 and A.temperature<B.temperature;