-- 코드를 입력하세요
# SELECT p.product_code,
         # from product p  join offline_sale s
      # on p.product_id = s.product_id

select  p.product_code, sum(s.sales_amount)*p.price sales
from product p join offline_sale s
                    on p.product_id = s.product_id
group by p.product_id
order by 2 desc, 1