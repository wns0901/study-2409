select i.NAME,
       i.DATETIME
from animal_ins i
         left join animal_outs o on i.animal_id = o.animal_id
WHERE o.ANIMAL_ID IS NULL
order by 2 limit 3;