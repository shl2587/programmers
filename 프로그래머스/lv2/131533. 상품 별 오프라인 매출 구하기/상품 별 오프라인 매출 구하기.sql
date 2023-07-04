-- 코드를 입력하세요
SELECT product_code, sum(p.price * o.sales_amount) as total
from offline_sale o
join product p 
on p.product_id = o.product_id
group by product_code
order by total desc, product_code asc;