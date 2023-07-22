-- 코드를 입력하세요
SELECT 
    mcdp_cd as "진료과 코드",
    count(APNT_YMD) as "5월예약건수"
    from appointment
    where to_char(apnt_ymd, 'yyyy-MM-dd') like '2022-05%'
    group by mcdp_cd
    order by count(APNT_YMD), mcdp_cd;