desc emp;   -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기

desc dept;  -- dept 테이블 구조보기
select * from dept; -- dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; -- bonus 테이블 내용보기

desc salgrade;  -- salgrade 테이블 구조보기
select * from salgrade; -- salgrade 테이블 내용보기

select distinct deptno
from emp;

select distinct job, deptno
from emp;

select all job, deptno
from emp;

select ename, sal, sal*12+comm, comm from emp;

select ename, upper(ename), lower(ename), initcap(ename) from emp;

select * from emp where upper(ename) = upper('scott');

select * from emp where upper(ename) like upper('%scott%');

select ename, length(ename) from emp;

select  ename, length(ename) from emp where length(ename) >= 5;

select length('한글'), lengthb('한글') from dual;

select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;

select job,
substr(job, -length(job)),
substr(job, -length(job), 2),
substr(job, -3)
from emp;

select instr('hello, oracle!', 'l') as instr_1,
    instr('hello, oracle!', 'l', 5) as instr_2,
    instr('hello, oracle!', 'l', 2, 2) as instr_3
    from dual;
    
select * from emp where instr(ename, 's') > 0;

select * from emp where ename like '%s%';

select '010-1234-5678' as replace_before,
replace('010-1234-5678', '-', ' ') as replace_1,
replace('010-1234-5678', '-') as replace_2
from dual;

select 'Oracle',
lpad('Oracle', 10, '#') as lpad_1,
rpad('Oracle', 10, '*') as rpad_1,
lpad('Oracle', 10) as lpad_2,
rpad('Oracle', 10) as rpad_2
from dual; -- lpad rpad 함수 사용하여 출력

select
        rpad('971225-', 14, '*') as rpad_jmno,
        rpad('010-1234-', 13, '*') as rpad_phone
        from dual; -- rpad함수 사용하여 개인정보 뒷자리 *(암호화)하기
        
select concat(empno, ename),
concat(empno, concat(' : ', ename))
from emp where ename = 'SCOTT'; -- 두 열 사이에 : 넣고 연결하기

select '[' || trim('_ _Oracle_ _') || ']' as trim,
       '[' || trim(leading from ' _ _ Oracle_ _ ') || ']' as trim_leading,
       '[' || trim(trailing from ' _ _Oracle_ _ ') || ']' as trim_trailing,
       '[' || trim(both from ' _ _Oracle_ _ ') || ']' as trim_both from dual;
        -- trim 함수로 공백 제거하여 출력
        
select '[' || trim('_' from '_ _Oracle_ _') || ']' as trim,
       '[' || trim(leading '_' from '_ _Oracle_ _') || ']' as trim_leading,
       '[' || trim(trailing '_' from '_ _Oracle_ _') || ']' as trim_trailing,
       '[' || trim(both '_' from '_ _Oracle_ _') || ']' as trim_both from dual;
        -- trim 함수로 삭제할 문자 _ 삭제 후 출력
        
select '[' || trim(' _Oracle_ ') || ']' as trim,
       '[' || ltrim(' _Oracle_ ') || ']' as ltrim,
       '[' || ltrim('<_Oracle_>', '_<') || ']' as ltrim_2,
       '[' || rtrim(' _Oracle_ ') || ']' as rtrim,
       '[' || rtrim('<_Oracle_>', '>_') || ']' as rtrim_2 from dual;
        -- trim, ltrim, rtrim 사용하여 문자열 출력
        
select round(1234.5678) as round,
       round(1234.5678, 0) as round_0,
       round(1234.5678, 1) as round_1,
       round(1234.5678, 2) as round_2,
       round(1234.5678, -1) as round_minus1,
       round(1234.5678, -2) as round_minus2
       from dual; -- round 함수를 사용하여 반올림 된 숫자 출력
       
select trunc(1234.5678) as trunc,
       trunc(1234.5678, 0) as trunc_0,
       trunc(1234.5678, 1) as trunc_1,
       trunc(1234.5678, 2) as trunc_2,
       trunc(1234.5678, -1) as trunc_minus1,
       trunc(1234.5678, -2) as trunc_minus2 from dual;
       -- trunc 함수를 사용하여 숫자 출력
       
select ceil(3.14),
       floor(3.14),
       ceil(-3.14),
       floor(-3.14)
       from dual; -- ceil, floor 함수로 숫자 출력
       
select mod(15, 6),
       mod(10,2),
       mod(11,2)
       from dual; -- mod 함수를 사용하여 나머지 값 출력
       
select sysdate as now,
       sysdate-1 as yesterday,
       sysdate+1 as tomorrow from dual; -- sysdate 함수를 사용하여 날짜 출력
       
select sysdate,
       add_months(sysdate, 3) from dual; -- sysdate와 add_months 함수로 3개월 후 날짜 구하기
       
select empno, ename, hiredate,
       add_months(hiredate, 120) as work10year from emp;
       -- 10주년 데이터 출력
       
select empno, ename, hiredate, sysdate from emp where add_months(hiredate, 384) > sysdate;
-- 32년 미만인 사원 데이터 출력

select empno, ename, hiredate, sysdate,
        months_between(hiredate, sysdate) as months1,
        months_between(sysdate, hiredate) as months2,
        trunc(months_between(sysdate, hiredate)) as months3
        from emp;
        
select sysdate,
        next_day(sysdate,'월요일'),
        last_day(sysdate)
        from dual; -- next_day, last_day 함수를 사용하여 날짜 출력
       
select sysdate,
        round(sysdate, 'CC') as format_CC,
        round(sysdate, 'YYYY') as format_YYYY,
        round(sysdate, 'Q') as format_Q,
        round(sysdate, 'DDD') as format_DDD,
        round(sysdate, 'HH') as format_HH
        from dual; -- round 함수 사용하여 날짜 데이터 출력
        
select sysdate,
        trunc(sysdate, 'CC') as format_CC,
        trunc(sysdate, 'YYYY') as format_YYYY,
        trunc(sysdate, 'Q') as format_Q,
        trunc(sysdate, 'DDD') as format_DDD,
        trunc(sysdate, 'HH') as format_HH
        from dual; -- trunc 함수 사용하여 날짜 데이터 출력
        
select empno, ename, empno + '500' 
from emp
where ename = 'SCOTT'; -- 숫자와 문자열(숫자)을 더하여 출력하기

select 'ABCD' + empno, empno
from emp
where ename = 'SCOTT'; -- 오류남

select to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') as 현재날짜시간
from dual; -- sysdate 날짜 형식 지졍하여 출력

select sysdate,
        to_char(sysdate, 'MM') as MM,
        to_char(sysdate, 'MON') as MON,
        to_char(sysdate, 'MONTH') as MONTH,
        to_char(sysdate, 'DD') as DD,
        to_char(sysdate, 'DY') as DY,
        to_char(sysdate, 'DAY') as DAY
        from dual;
        
create table dept_temp as select* from dept;
-- dept 테이블을 복사해서 dept_temp 테이블 만들기

select * from dept_temp; -- dept_temp 테이블 전체 열 조회

insert into dept_temp (DEPTNO, DNAME, LOC)
values (50, 'DATABSE', 'SEOUL'); -- dept_temp 테이블에 서울 데이터를 넣음
select * from dept_temp; -- insert 후 테이블 출력

insert into dept_temp
values (60 , 'NETWORK', 'BUSAN'); -- dept_temp 테이블에 부산 데이터를 넣음
select * from dept_temp;

insert into dept_temp (deptno, dname, loc) 
values (70, 'WEB', null); -- dept_temp 테이블에 NULL 값을 넣음
select * from dept_temp;

insert into dept_temp (deptno, dname, loc)
values (80 , 'MOBILE', ''); -- 빈 공백 문자열로 NULL 데이터 입력
select * from dept_temp;

insert into dept_temp (deptno, loc)
values (90 , 'INCHEON'); -- 열 데이터를 입력하지 않는 방식으로 NULL 데이터 입력
select * from dept_temp;

create table emp_temp as select * from emp where 1 <> 1; -- emp 테이블을 복사해서 emp_temp 테이블 만들기
select * from emp_temp;

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01', 5000, 1000, 10);
select * from emp_temp;  -- insert문으로 날짜 데이터 입력(날짜 사이에 /입력)

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, null, 20);
select * from emp_temp; -- insert문으로 날짜 데이터 입력(날짜 사이에 - 입력)

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(2111, '이순신', 'MANAGER', 9999, to_date('07/01/2001', 'DD/MM/YYYY'), 4000, NULL, 20);
select * from emp_temp; -- to-date 함수를 사용하여 날짜 데이터 입력

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (3111, '심청이', 'MANAGER', 9999, sysdate, 4000, null, 30);
select * from emp_temp; -- sysdate를 사용하여 날짜 데이터 입력

insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno from emp e, salgrade s
where e.sal between s.losal and s.hisal and s.grade = 1;
select * from emp_temp;

create table dept_temp2
as select * from dept;
select * from dept_temp2;

update dept_temp2
set loc = 'SEOUL'; -- location을 서울로 바꿈
select * from dept_temp2;
rollback; -- 롤백(방금 실행한 명령문 되돌리기)

update dept_temp2
set dname = 'DATABASE',
loc = 'SELOUL'
where deptno = 40;
select * from dept_temp2; -- 테이블 데이터 중 일부분만 수정

update dept_temp2
set (dname, loc) = (select dname, loc from dept where deptno = 40)
where deptno = 40;
select * from dept_temp2; -- 서브쿼리로 데이터 일부분 수정

update dept_temp2
set dname = (select dname from dept where deptno = 40),
loc = (select loc from dept where deptno = 40)
where deptno = 40; -- 서브쿼리로 데이터 일부분 수정
select * from dept_temp2;

update dept_temp2 set loc = 'SEOUL'
where deptno = (select deptno from dept_temp2 where dname = 'OPERATIONS');
select * from dept_temp2; -- seoul 을 operation으로 수정

create table emp_temp2 as select * from emp; -- 테이블 복사
select * from emp_temp2;

delete from emp_temp2
where job = 'MANAGER';
select * from emp_temp2; -- where절을 사용하여 manager를 삭제

delete from emp_temp2
where empno in (select e.empno from emp_temp2 e, salgrade s
where e.sal between s.losal and s.hisal and s.grade = 3 and deptno = 30);
select * from emp_temp2; -- where절에 서브쿼리를 사용하여 데이터 일부 삭제

delete from emp_temp2; -- 전체 데이터 삭제
select * from emp_temp2;
rollback; -- 롤백

create table emp_ddl(
empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2));
desc emp_ddl;

CREATE TABLE DEPT_DDL AS SELECT * FROM DEPT;
DESC DEPT_DDL;
SELECT * FROM DEPT_DDL;

CREATE TABLE EMP_DDL_30 AS SELECT * FROM EMP
WHERE DEPTNO = 30;
SELECT * FROM EMP_DDL_30;

CREATE TABLE EMPDEPT_DDL AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC FROM EMP E, DEPT D WHERE 1 <> 1;
SELECT * FROM EMPDEPT_DDL;

CREATE TABLE EMP_ALTER AS SELECT * FROM EMP;
SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER ADD HP VARCHAR2(20);
SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER RENAME COLUMN HP TO TEL;
SELECT * FROM EMP_ALTER;

ALTER TABLE EMP_ALTER
MODIFY EMPNO NUMBER(5);
DESC EMP_ALTER;

ALTER TABLE EMP_ALTER DROP COLUMN TEL;
SELECT * FROM EMP_ALTER;

RENAME EMP_ALTER TO EMP_RENAME;
DESC EMP_ALTER;
SELECT * FROM EMP_RENAME;

TRUNCATE TABLE EMP_RENAME;
SELECT * FROM EMP_RENAME;

DROP TABLE EMP_RENAME;
DESC EMP_RENAME;

SELECT * FROM DICT;

SELECT * FROM DICTIONARY;

SELECT TABLE_NAME FROM USER_TABLES;

SELECT OWNER, TABLE_NAME FROM ALL_TABLES;

SELECT * FROM DBA_TABLES;

CREATE TABLE TABLE_NOTNULL(
LOGIN_ID VARCHAR2(20) NOT NULL,
LOGIN_PWD VARCHAR2(20) NOT NULL,
TEL VARCHAR2(20));
DESC TABLE_NOTNULL;

INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', NULL, '010-1234-5678'); -- NOT NULL로 지정한 열에 NULL값을 입력시 오류

INSERT INTO TABLE_NOTNULL (LOGIN_ID, LOGIN_PWD)
VALUES ('TEST_ID_01', '1234');
SELECT * FROM TABLE_NOTNULL;

UPDATE TABLE_NOTNULL
SET LOGIN_PWD = NULL
WHERE LOGIN_ID = 'TEST_ID_01'; -- NOT NULL 제약 조건이 지정된 열 데이터를 NULL 값으로 업데이트

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS; -- 제약 조건 보기

CREATE TABLE TABLE_NOTNULL2(
LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,
TEL VARCHAR2(20));
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS; -- 테이블 생성 시 제약 조건에 이름 지정

ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL); -- TEL 열에 NOT NULL 제약조건 추가 (오류)

UPDATE TABLE_NOTNULL
SET TEL = '010-1234-5678'
WHERE LOGIN_ID = 'TEST_ID_01';
SELECT * FROM TABLE_NOTNULL; -- TEL 열 데이터 수정

ALTER TABLE TABLE_NOTNULL
MODIFY(TEL NOT NULL); -- NOT NULL 제약 조건 추가
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2
MODIFY(TEL CONSTRAINT TBLNN_TEL_NN NOT NULL); -- 제약 조건에 이름 지정해서 추가
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

DESC TABLE_NOTNULL2;

ALTER TABLE TABLE_NOTNULL2
RENAME CONSTRAINT TBLNN_TEL_NN TO TBLNN2_TEL_NN; -- 이미 생성된 제약 조건 이름 변경
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS;

ALTER TABLE TABLE_NOTNULL2
DROP CONSTRAINT TBLNN2_TEL_NN; -- 제약 조건 삭제
DESC TABLE_NOTNULL2;

CREATE TABLE TABLE_UNIQUE(
LOGIN_ID VARCHAR2(20) UNIQUE,
LOGIN_PWD VARCHAR2(20) NOT NULL,
TEL VARCHAR2(20));
DESC TABLE_UNIQUE;

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'TABLE_UNIQUE'; -- USER_CONSTRAINTS 데이터 사전 뷰로 제약 조건 확인

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_01', 'PWD01', '010-1234-5678');
SELECT * FROM TABLE_UNIQUE; -- TABLE_UNIQUE 테이블에 데이터 입력

INSERT INTO TABLE_UNIQUE (LOGIN_ID, LOGIN_PWD, TEL)
VALUES ('TEST_ID_01', 'PWD01', '010-1234-5678'); -- LOGIN_ID 열에 중복되는 데이터 넣기

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES('TEST_ID_02', 'PWD01', '010-1234-5678');
SELECT * FROM TABLE_UNIQUE; -- TABLE_UNIQUE 테이블에 데이터 입력 (LOGIN_PWD 열은 NOTNULL 조건만 지정되어 있어서 UNIQUE x)

INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PWD, TEL)
VALUES(NULL, 'PWD01', '010-2345-6789');
SELECT * FROM TABLE_UNIQUE; -- UNIQUE 제약 조건이 지정된 열에 NULL값 입력

UPDATE TABLE_UNIQUE
SET LOGIN_ID = 'TEST_ID_01'
WHERE LOGIN_ID IS NULL; -- 테이블 데이터 수정(오류)

CREATE TABLE TABLE_UNIQUE2(
LOGIN_ID VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNID_UNQ UNIQUE,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLUNQ2_LGNPW_NN NOT NULL,
TEL VARCHAR2(20));

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%'; -- 생성한 UNIQUE 제약 조건 확인

ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE); -- 이미 생성한 테이블 열에 UNIQUE 제약 조건 추가(오류)

UPDATE TABLE_UNIQUE SET TEL = NULL;
SELECT * FROM TABLE_UNIQUE; -- TEL 열 값을 모두 NULL 값으로 변경

ALTER TABLE TABLE_UNIQUE
MODIFY(TEL UNIQUE); -- TEL 값에 UNIQUE 제약 조건 설정

ALTER TABLE TABLE_UNIQUE2
MODIFY(TEL CONSTRAINT TBLUNQ_TEL_UNQ UNIQUE);
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%'; -- UNIQUE 제약 조건 이름 직접 지정

ALTER TABLE TABLE_UNIQUE2
RENAME CONSTRAINT TBLUNQ_TEL_UNQ TO TBLUNQ2_TEL_UNQ;
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%'; -- 이미 만들어져 있는 UNIQUE 제약 조건 이름 수정

ALTER TABLE TABLE_UNIQUE2
DROP CONSTRAINT TBLUNQ2_TEL_UNQ;
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_UNIQUE%'; -- 제약 조건 삭제

CREATE TABLE DEPT_FK(DEPTNO NUMBER(2) CONSTRAINT DEPTFK_DEPTNO_PK PRIMARY KEY, DNAME VARCHAR2(14), LOC VARCHAR2(13));
DESC DEPT_FK;

CREATE TABLE EMP_FK(
EMPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY,
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK REFERENCES DEPT_FK (DEPTNO));
DESC EMP_FK; -- EMP_FK 테이블 생성

INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'),3000, NULLL, 10); -- DEPTNO 데이터가 DEPT_FK 테이블에 없을 때

INSERT INTO DEPT_FK VALUES(10, 'TEST_DNAME', 'TEST_LOC');
SELECT * FROM DEPT_FK; -- DEPT_FK에 데이터 삽입

INSERT INTO EMP_FK
VALUES(9999, 'TEST_NMAME', 'TEST_JOB', NULL, TO_DATE('2001/01/01', 'YYYY/MM/DD'), 3000, NULL, 10);
SELECT * FROM EMP_FK;

DELETE FROM DEPT_FK
WHERE DEPTNO = 10; -- DEPT 값을 참조하는 데이터가 존재 (오류)

CREATE TABLE TABLE_CHECK(
LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK_LOGINID_PK PRIMARY KEY,
LOGIN_PWD VARCHAR2(20) CONSTRAINT TBLCK_LOGINPW_CK CHECK (LENGTH(LOGIN_PWD) > 3),
TEL VARCHAR2(20));
DESC TABLE_CHECK;

INSERT INTO TABLE_CHECK
VALUES('TEST_ID', '123', '010-1234-5678'); -- CHECK 제약 조건에 맞지 않는 예시

INSERT INTO TABLE_CHECK
VALUES ('TEST_ID', '1234', '010-1234-5678');
SELECT * FROM TABLE_CHECK; -- CHECK 제약 조건에 맞는 예시

SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME FROM USER_CONSTRAINTS
WHERE TABLE_NAME LIKE 'TABLE_CHECK'; -- CHECK 제약 조건 확인

CREATE TABLE TABLE_DEFAULT(
LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK2_LOGINID_PK PRIMARY KEY,
LOGIN_PWD VARCHAR2(20) DEFAULT '1234',
TEL VARCHAR2(20)); -- 테이블 생성 시 DEFAULT 제약 조건 설정
DESC TABLE_DEFAULT;

INSERT INTO TABLE_DEFAULT VALUES ('TEST_ID', NULL, '010-1234-5678');
INSERT INTO TABLE_DEFAULT (LOGIN_ID, TEL) VALUES ('TEST_ID2', '010-1234-5678');
SELECT * FROM TABLE_DEFAULT; -- DEFAULT로 지정한 기본값이 입력되는 INSERT문 확인













        
