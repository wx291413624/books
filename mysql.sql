CREATE DATABASE `books` /*!40100 DEFAULT CHARACTER SET latin1 */

-- we don't know how to generate schema books (class Schema) :(
create table book_user
(
	id int auto_increment
		primary key,
	user_name varchar(20) charset utf8 null,
	phone varchar(20) charset latin1 null,
	gender varchar(5) charset latin1 null,
	age varchar(5) charset latin1 null,
	card varchar(20) charset latin1 null,
	real_name varchar(20) charset utf8 null,
	pwd varchar(20) charset latin1 null,
	reg_date datetime null,
	img varchar(50) charset latin1 null,
	role_id int null,
	constraint book_user_id_uindex
		unique (id)
)
charset=utf8mb4
;

create table books
(
	id int auto_increment
		primary key,
	IBSN varchar(50) charset utf8 null,
	book_name varchar(20) charset utf8 null,
	writer_id int null,
	press varchar(20) charset utf8 null,
	price double(5,2) null,
	content varchar(100) charset utf8 null,
	category_id int null,
	constraint books_id_uindex
		unique (id)
)
charset=utf8mb4
;

create table books_borrow_log
(
	id int auto_increment
		primary key,
	user_id int null,
	borrow_time datetime null,
	state int null,
	update_time datetime null,
	constraint books_borrow_log_id_uindex
		unique (id)
)
charset=utf8mb4
;

create table books_category
(
	id int auto_increment
		primary key,
	category_name varchar(10) charset utf8 null,
	constraint books_category_id_uindex
		unique (id)
)
charset=utf8mb4
;

create table books_role
(
	id int auto_increment
		primary key,
	role_name varchar(10) charset utf8 null,
	borrow_no int(2) null,
	constraint books_role_id_uindex
		unique (id)
)
charset=utf8mb4
;

create table books_wirter
(
	id int auto_increment
		primary key,
	writer_name varchar(20) charset utf8 null,
	constraint books_wirter_id_uindex
		unique (id)
)
charset=utf8mb4
;

