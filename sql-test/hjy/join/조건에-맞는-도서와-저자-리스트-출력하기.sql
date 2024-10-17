-- 코드를 입력하세요
SELECT b.book_id, author_name, date_format(b.published_date,'%Y-%m-%d') published_date
from book b join author a
                 on b.author_id = a.author_id
where b.category like '경제'
group by book_id, author_name, category
order by 3