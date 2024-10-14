SELECT p.PRODUCT_CODE, sum(os.SALES_AMOUNT) * p.PRICE SALES
from PRODUCT p
         join OFFLINE_SALE os on p.PRODUCT_ID = os.PRODUCT_ID
group by 1
order by 2 desc, 1;