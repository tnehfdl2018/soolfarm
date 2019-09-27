create table MEMBER (
			id varchar(100) primary key,
			pw varchar(30) not null);
			
create table QNA (
			post_sub varchar(30) primary key,
			post_contant varchar(30)
			);

create table GOODS (
			gd_num int primary key,
			gd_name varchar(30),
			gd_kinds varchar(30)
			);