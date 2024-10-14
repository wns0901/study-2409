select ID, (select count(ID) from ECOLI_DATA b where a.ID = b.PARENT_ID) CHILD_COUNT
from ECOLI_DATA a
order by ID;