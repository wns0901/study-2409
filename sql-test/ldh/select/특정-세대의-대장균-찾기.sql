SELECT e3.ID
FROM ecoli_data e1
         JOIN ecoli_data e2 ON e1.ID = e2.PARENT_ID
         JOIN ecoli_data e3 ON e2.ID = e3.PARENT_ID
WHERE e1.PARENT_ID IS NULL
ORDER BY e3.ID;