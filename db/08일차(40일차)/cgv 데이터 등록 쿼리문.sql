-- 아바타 영화를 등록하는 쿼리문 작성
insert trailer(tr_title, tr_file_name) value('avatar2', 'https://www.youtube.com/watch?v=kihrFxwdM'B4'');
insert movie(mo_title, mo_contents, mo_age, mo_run, mo_opening_date, mo_state, mo_tr_num) 
value('아바타-물의 길', '<아바타: 물의 길>은 판도라 행성에서 제이크 설리와 네이티리가 이룬 가족이 겪게 되는 무자비한 위협과 살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다. 월드와이드 역대 흥행 순위 1위를 기록한 전편 <아바타>에 이어 제임스 카메론 감독이 13년만에 선보이는 영화로, 샘 워싱턴, 조 샐다나, 시고니 위버, 스티븐 랭, 케이트 윈슬렛이 출연하고 존 랜도가 프로듀싱을 맡았다.'
, '12세 이상', 192, '2022.12.14', '상영중', (select tr_num from trailer where tr_title like 'avatar2'));

insert genre values('드라마'), ('판타지'), ('서부'),('공포'),('액션'), ('어드벤처'), ('SF'),('스릴러') ,('멜로/로맨스'), ('느와르'), ('컬트'),('다큐멘터리'),('코미디'), ('가족'), ('미스터리'),('전쟁'),('애니메이션'), ('범죄'), ('뮤지컬'),('무협'),('에로'), ('서스펜스'), ('서사'),('블랙코미디'),('실험');

insert movie_genre(mg_mo_num, mg_ge_name) values((select mo_num from movie where mo_title like '아바타-물의 길'), '액션'), (1, '어드벤처'), (1, 'SF'), (1, '스릴러');
insert movie_person(mp_name, mp_birth, mp_contry) values('제임스 카메론', '1954.08.16', '캐나다'), ( '조 샐다나', '1978.06.19', '미국'), ('샘 워싱턴', '1976.08.02', '영국'), ('시고니 위버', '1949.10.08','미국'), 
('우나 채플린', '1986.06.04', '미상'), ('지오바니 리비시', '1974.12.17', '미국'), ('스티븐 랭', '1952.07.11', '미국'), ('케이트 윈슬렛', '1975.10.05', '영국');

select * from movie_person;
insert movie_casting(mc_role, mc_mo_num, mc_mp_num) values('감독', 1, 17), ('배우', 1, 18), ('배우', 1, 19), ('배우', 1, 20), ('배우', 1, 21), ('배우', 1, 22), ('배우', 1, 23), ('배우', 1, 24);
insert trailer(tr_title, tr_file_name) value('환상적인 판도라 세계 영상', 'http://h.vod.cgv.co.kr:80/vodCGVa/86072/86072_210699_1200_128_960_540.mp4');
update movie 
	set mo_tr_num = 2
   	where mo_num =1;

delete from trailer where tr_num = 1;
insert into region value('경기'), ('인천'), ('강원'),('대전/충청'), ('대구'), ('부산/울산'),('경상'),('광주/전라/제주');

insert into theater(th_name, th_lot_address, th_address, th_trans_info, th_parking_info, th_number, th_total_cinema, th_total_seat, th_re_name)
value('CGV강남', '서울특별시 강남구 역삼동 814-6 스타플렉스', '서울특별시 강남구 강남대로 438 (역삼동)', '', '',  '1544-1122', 
6, 60, '서울 강남');
update theater
	set th_total_seat = 60
    where th_num = 1;

insert into cinema(ci_name, ci_seat, ci_type, ci_th_num)
values('1관 6층', 10, '3D', 1), ('2관 6층(laser)', 10, '2D', 1),
('3관 8층', 10, '3D', 1), ('4관[SCREENX] 10층', 10, 'SCREENX 2D', 1),
('5관 10층', 10, '2D', 1), ('6관 10층(LASER)', 10, '2D', 1);

insert into seat(se_name, se_state, se_ci_num, se_price) 
values('A1', '운영중', 1, 10000), ('A2', '운영중', 1, 10000), ('A3', '운영중', 1, 10000), ('A4', '운영중', 1, 10000),
('B1', '운영중', 1, 10000), ('B2', '운영중', 1, 10000), ('B3', '운영중', 1, 10000), ('B4', '운영중', 1, 10000),
('C1', '운영중', 1, 10000), ('C2', '운영중', 1, 10000),
('A1', '운영중', 2, 10000), ('A2', '운영중', 2, 10000), ('B1', '운영중', 2, 10000), ('B2', '운영중', 2, 10000),
('C1', '운영중', 2, 10000), ('C2', '운영중', 2, 10000), ('D1', '운영중', 2, 10000), ('D2', '운영중', 2, 10000),
('E1', '운영중', 2, 10000), ('E2', '운영중', 2, 10000),
('A1', '운영중', 3, 10000), ('A2', '운영중', 3, 10000), ('A3', '운영중', 3, 10000), ('A4', '운영중', 3, 10000),
('A5', '운영중', 3, 10000), ('B1', '운영중', 3, 10000), ('B2', '운영중', 3, 10000), ('B3', '운영중', 3, 10000),
('B4', '운영중', 3, 10000), ('B5', '운영중', 3, 10000),
('A1', '운영중', 4, 10000), ('A2', '운영중', 4, 10000), ('A3', '운영중', 4, 10000), ('B1', '운영중', 4, 10000),
('B2', '운영중', 4, 10000), ('B3', '운영중', 4, 10000), ('C1', '운영중', 4, 10000), ('C2', '운영중', 4, 10000),
('C3', '운영중', 4, 10000), ('C4', '운영중', 4, 10000),

('A1', '운영중', 5, 10000), ('A2', '운영중', 5, 10000), ('A3', '운영중', 5, 10000), ('A4', '운영중', 5, 10000),
('B1', '운영중', 5, 10000), ('B2', '운영중', 5, 10000), ('B3', '운영중', 5, 10000), ('B4', '운영중', 5, 10000),
('C1', '운영중', 5, 10000), ('C2', '운영중', 5, 10000),
('A1', '운영중', 6, 10000), ('A2', '운영중', 6, 10000), ('A3', '운영중', 6, 10000), ('A4', '운영중', 6, 10000),
('B1', '운영중', 6, 10000), ('B2', '운영중', 6, 10000), ('B3', '운영중', 6, 10000), ('B4', '운영중', 6, 10000),
('C1', '운영중', 6, 10000), ('C2', '운영중', 6, 10000);

update seat
	set se_state = '사용가능';

/*
1관 좌석 배치
'A1' 'A2' 'A3' 'A4'
'B1' 'B2' 'B3' 'B4'
'C1' 'C2'
2관 좌석 배치
'A1' 'A2'
'B1' 'B2'
'C1' 'C2'
D1 D2
E1 E2
3관 좌석 배치
'A1' 'A2' 'A3' 'A4' 'A5'
'B1' 'B2' 'B3' 'B4' B5

4관 좌석 배치
'A1' 'A2' 'A3'
'B1' 'B2' 'B3'
'C1' 'C2' 'C3' 'C4'

5관 좌석 배치
'A1' 'A2' 'A3' 'A4'
'B1' 'B2' 'B3' 'B4'
'C1' 'C2'

6관 좌석 배치
'A1' 'A2' 'A3' 'A4'
'B1' 'B2' 'B3' 'B4'
'C1' 'C2'


*/

-- 상영시간 등록 쿼리문
insert into screen_schedule(ss_date, ss_time, ss_total_seat, ss_possible_seat, ss_mo_num, ss_ci_num) values
('2022-12-22', '10:30', 10, 10, 1, 4), ('2022-12-22', '14:10', 10, 10, 1, 4), ('2022-12-22', '17:50', 10, 10, 1, 4), ('2022-12-22', '21:30', 10, 10, 1, 4),
('2022-12-22', '09:50', 10, 10, 1, 1), ('2022-12-22', '13:30', 10, 10, 1, 1), ('2022-12-22', '17:10', 10, 10, 1, 1), ('2022-12-22', '20:50', 10, 10, 1, 1),
('2022-12-22', '19:00', 10, 10, 1, 2), ('2022-12-22', '22:40', 10, 10, 1, 2), ('2022-12-22', '09:10', 10, 10, 1, 3),
('2022-12-22', '12:50', 10, 10, 1, 3), ('2022-12-22', '16:30', 10, 10, 1, 3), ('2022-12-22', '20:10', 10, 10, 1, 3), ('2022-12-22', '23:50', 10, 10, 1, 3),
('2022-12-22', '08:30', 10, 10, 1, 5), ('2022-12-22', '12:10', 10, 10, 1, 5), ('2022-12-22', '15:50', 10, 10, 1, 5), ('2022-12-22', '19:30', 10, 10, 1, 5),
('2022-12-22', '23:10', 10, 10, 1, 5), ('2022-12-22', '11:10', 10, 10, 1, 6), ('2022-12-22', '14:50', 10, 10, 1, 6), ('2022-12-22', '18:30', 10, 10, 1, 6), ('2022-12-22', '22:10', 10, 10, 1, 6);


insert into member(me_id, me_pw, me_movie_count) values('abc', 'abc',0); 