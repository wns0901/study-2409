SELECT a.BOOK_ID, b.AUTHOR_NAME, date_format(a.PUBLISHED_DATE, '%Y-%m-%d') PUBLISHED_DATE
FROM BOOK a, AUTHOR b
WHERE a.AUTHOR_ID = b.AUTHOR_ID -- AUTHOR테이블과 BOOK테이블의 AUTHOR_ID는 같다는 쿼리
  AND a.CATEGORY LIKE '경제' -- 경제 카테고리에 속하는 도서를 찾게하는 쿼리
ORDER BY a.PUBLISHED_DATE;