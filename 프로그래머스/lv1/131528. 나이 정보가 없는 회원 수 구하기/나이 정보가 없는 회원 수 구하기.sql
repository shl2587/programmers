-- 코드를 입력하세요
SELECT count(age is null) as users 
from user_info
where age is null
group by age;