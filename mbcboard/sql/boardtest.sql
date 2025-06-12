create table member(
mno number(5) not null,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,
regidate date default sysdate not null
)

drop table member

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '����', 'kkw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '������', 'lee', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '����ȯ', 'oh', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '����â', 'kwak', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '�赵��', 'kim', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, 'ȫ����', 'hong', '1234')

select * from member


drop table board
drop sequence board_seq -- �ڵ���ȣ ���� ����
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
values (board_seq.nextval, '������~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�ȳ��ϼ���~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����մϴ�.~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����ϼ̳���~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, 'ȭ�����ϼ���~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�氩���ϴ�.~', '����� ��Ͻô³İ� ��� �ϼ̽��ϴ�.', '����', sysdate)

select * from board 

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='kkw'
