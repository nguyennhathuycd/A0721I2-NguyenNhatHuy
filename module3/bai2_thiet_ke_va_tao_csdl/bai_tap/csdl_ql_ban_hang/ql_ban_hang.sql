create database QuanLyBanHang;

use QuanLyBanHang;

create table customer (
	id int primary key,
    `name` nvarchar(45),
    age smallint
);

create table product (
	id int primary key,
    `name` nvarchar(45),
    price double
);

create table `order` (
	id int primary key,
    `date` Date,
    totalPrice double,
    customerID int,
    foreign key (customerID) references customer(id)
);

create table orderDetail (
	orderID int,
    productID int,
    QTY varchar(45),
    primary key (orderID, productID),
    foreign key (orderID) references `order`(id),
    foreign key (productID) references product(id)
);