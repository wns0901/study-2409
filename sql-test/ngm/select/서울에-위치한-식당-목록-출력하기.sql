SELECT a.REST_ID, -- 식당 ID
       REST_NAME, -- 식당 이름
       FOOD_TYPE, -- 음식 종류
       FAVORITES, -- 즐겨찾기수
       ADDRESS, -- 주소
       ROUND(AVG(REVIEW_SCORE),2) SCORE -- 리뷰점수 평균 조회
FROM REST_INFO a JOIN REST_REVIEW b
                      ON a.REST_ID = b.REST_ID
WHERE ADDRESS LIKE '서울%' -- 서울에 위치한 식당을 찾는 문장
GROUP BY REST_NAME -- GROUP BY 사용
ORDER BY SCORE DESC, a.FAVORITES DESC; -- SCORE 라는 것을 내림차 순으로 집계해야한다!