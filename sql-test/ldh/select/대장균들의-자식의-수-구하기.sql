select e1.ID, count(e2.id) as CHILD_COUNT
from ecoli_data e1
         left join ecoli_data e2
                   on e1.id = e2.parent_id
group by e1.id
order by e1.id;