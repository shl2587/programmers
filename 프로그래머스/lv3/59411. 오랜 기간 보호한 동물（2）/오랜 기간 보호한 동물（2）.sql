-- 코드를 입력하세요
SELECT I.animal_id, I.name
    from animal_ins I
    join animal_outs O
    on I.animal_id = O.animal_id
    order by O.datetime - I.datetime desc
    fetch next 2 rows only;