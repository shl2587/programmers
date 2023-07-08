-- 코드를 입력하세요
SELECT warehouse_id, warehouse_name, address, 
    if(freezer_yn is null, 'N', freezer_yn)
    from food_warehouse
    where address like '%경기%'
    order by warehouse_id;