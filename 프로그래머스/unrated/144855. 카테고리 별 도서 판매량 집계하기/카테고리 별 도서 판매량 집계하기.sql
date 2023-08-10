-- 코드를 입력하세요
SELECT B.category, sum(S.sales) as total_sales
    from book B
    join book_sales S
    on B.book_id = S.book_id
    where to_char(S.sales_date, 'yyyy-MM-dd') like '2022-01%'
    group by B.category
    order by B.category