-- 	LEETCODE 1321
with 
  day_sum as (
    select sum(amount) as amount, visited_on
    from customer
    group by visited_on
  )
select d7.visited_on, 
d1.amount + d2.amount + d3.amount
+ d4.amount + d5.amount +d6.amount
+ d7.amount as amount, round((d1.amount + d2.amount + d3.amount + d4.amount + d5.amount + d6.amount + d7.amount) / 7, 2) as average_amount 
from 
day_sum d1,
day_sum d2,
day_sum d3,
day_sum d4,
day_sum d5,
day_sum d6,
day_sum d7
where date_add(d1.visited_on, interval 1 day) = d2.visited_on 
and date_add(d2.visited_on, interval 1 day) = d3.visited_on
and date_add(d3.visited_on, interval 1 day) = d4.visited_on
and date_add(d4.visited_on, interval 1 day) = d5.visited_on
and date_add(d5.visited_on, interval 1 day) = d6.visited_on
and date_add(d6.visited_on, interval 1 day) = d7.visited_on
;
