select i.rest_id                     as REST_ID,
       i.rest_name                   as REST_NAME,
       i.food_type                   as FOOD_TYPE,
       i.favorites                   as FAVORITES,
       i.address                     as ADDRESS,
       round(avg(r.review_score), 2) as SCORE
from rest_info i
         join rest_Review r on i.rest_id = r.rest_id
where i.address like '서울%'
group by i.rest_id, i.rest_name, i.food_type, i.favorites, i.address
order by SCORE desc, i.favorites desc;