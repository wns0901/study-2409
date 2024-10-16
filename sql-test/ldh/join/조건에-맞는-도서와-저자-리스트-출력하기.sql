select BOOK_ID,
       AUTHOR_NAME,
       DATE_FORMAT(published_date, '%Y-%m-%d') as PUBLISHED_DATE
from book b
         left join author a on b.author_id = a.author_id
where category = '경제'
order by PUBLISHED_DATE;