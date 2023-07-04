-- 코드를 입력하세요
SELECT b.book_id, a.author_name,
    to_char(published_date, 'YYYY-MM-DD')
from book b
join author a
on b.author_id = a.author_id
where category = '경제'
order by published_date;