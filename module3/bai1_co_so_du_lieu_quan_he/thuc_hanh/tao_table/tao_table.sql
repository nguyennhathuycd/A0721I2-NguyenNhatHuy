create database student_management;

use student_management;

create table student(
	id int,
    `name` nvarchar(45) null,
    age smallint,
    country nvarchar(45) null,
    primary key(id)
);