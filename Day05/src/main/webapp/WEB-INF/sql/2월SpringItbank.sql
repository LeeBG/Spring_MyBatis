drop table book;
drop SEQUENCE book_seq;

create sequence book_seq
increment by 1
start with 1001
minvalue 1001
maxvalue 99999999999
nocycle
nocache;

create table book(
    idx  NUMBER default book_seq.NEXTVAL CONSTRAINT book_pk primary key,
    title VARCHAR2(100) not null,
    writer VARCHAR2(50) not null, 
    publisher VARCHAR2(50) not null,
    publish_date DATE DEFAULT sysdate,
    price number not null
);

desc book;

insert into book(title,writer,publisher,price) values('세이노의 가르침','세이노','데이원',6480);
insert into book(title,writer,publisher,price) values('만일 내가 인생을 다시 산다면','김혜남','메이븐',15480);
insert into book(title,writer,publisher,price) values(' K 배터리 레볼루션','박순혁','지와인',17100);
insert into book(title,writer,publisher,price) values('원씽(The One Thing)','게리 켈러 외','비즈니스북스',12600);
insert into book(title,writer,publisher,price) values('김미경의 마흔 수업','김미경','어웨이크북스',16200);

select * from book;

update book set book.publish_date='23/03/02' where idx=1001;

commit;