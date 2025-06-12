create table member(
mno number(5) not null,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,
regidate date default sysdate not null
)

drop table member

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김기원', 'kkw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '이현우', 'lee', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '오승환', 'oh', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '곽현창', 'kwak', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김도영', 'kim', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '홍경훈', 'hong', '1234')

select * from member


drop table board
drop sequence board_seq -- 자동번호 생성 제거
delete from board

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache 

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)

insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥내용~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셨내요~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다.~', '무더운데 등교하시는냐고 고생 하셨습니다.', '김기원', sysdate)

select * from board 

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='kkw'
