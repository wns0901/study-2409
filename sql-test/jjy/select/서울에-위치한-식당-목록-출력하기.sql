SELECT ri.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, round(avg(REVIEW_SCORE), 2) SCORE
from REST_INFO ri
         join REST_REVIEW rr on rr.REST_ID = ri.REST_ID
where ADDRESS like '서울%'
group by REST_ID
order by SCORE desc, FAVORITES desc;