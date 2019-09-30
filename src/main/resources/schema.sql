create table MEMBER (
	num int primary key AUTO_INCREMENT,
	email varchar(75) not null,
	pw varchar(30) not null,
	name varchar(45) not null,
	tel varchar(25) not null,
	address varchar(100) not null,
	date TIMESTAMP not null default sysdate
	);

create table GOODS (
	gd_num int primary key AUTO_INCREMENT,
	gd_name varchar(45) not null,
	gd_img varchar(25) not null, 
	gd_kinds varchar(30) not null,
	gd_price varchar(25) not null,
	gd_maker varchar(25) not null,
	gd_discription varchar(255) not null
	);
			
create table SHOPPINGBASKET(
	sb_num int primary key AUTO_INCREMENT,
	sb_name varchar(45) not null,
	sb_img varchar(25) not null, 
	sb_kinds varchar(30) not null,
	sb_price varchar(25) not null,
	sb_maker varchar(25) not null,
	sb_status varchar(20) not null		
	);
	
create table delivery(
	del_num int primary key AUTO_INCREMENT,
	del_name varchar(45) not null,
	del_img varchar(25) not null, 
	del_kinds varchar(30) not null,
	del_price varchar(25) not null,
	del_maker varchar(25) not null,
	del_status varchar(20) not null		
	);
	
create table buyed(
	buy_num int primary key AUTO_INCREMENT,
	buy_name varchar(45) not null,
	buy_img varchar(25) not null, 
	buy_kinds varchar(30) not null,
	buy_price varchar(25) not null,
	buy_maker varchar(25) not null,
	buy_status varchar(20) not null		
	);
	
create table QNA (
	post_num int primary key AUTO_INCREMENT,
	post_sub varchar(30) not null,
	post_contant varchar(255) not null,
	post_writer varchar(45) not null,
	post_date TIMESTAMP not null default sysdate not null
	);
	
create table banner(
	id	int primary key AUTO_INCREMENT,
	name varchar(255),
	start_dttm TIMESTAMP not null default sysdate,
	end_dttm TIMESTAMP,
	img_name varchar(255) not null
	);