-- 코드를 입력하세요
SELECT to_number(to_char(datetime, 'FMhh24')) as HOUR, count(*) as COUNT
    from animal_outs
    where to_number(to_char(datetime, 'FMhh24')) >= 9 and to_number(to_char(datetime, 'FMhh24')) < 20
    group by to_number(to_char(datetime, 'FMhh24'))
    order by to_number(to_char(datetime, 'FMhh24'));