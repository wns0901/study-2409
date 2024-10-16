select Date_format(sales_date, '%Y-%m-%d') SALES_DATE,
       PRODUCT_ID,
       USER_ID,
       SALES_AMOUNT
from online_sale
where sales_date between '2022-03-01' and '2022-03-31'

union all

select Date_format(sales_date, '%Y-%m-%d') SALES_DATE,
       PRODUCT_ID,
       NULL as                             USER_ID,
       SALES_AMOUNT
from offline_sale
where sales_date between '2022-03-01' and '2022-03-31'

order by sales_date,
         product_id,
         user_id;