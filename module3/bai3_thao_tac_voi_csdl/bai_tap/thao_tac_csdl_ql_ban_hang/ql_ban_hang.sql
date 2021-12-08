use quanlybanhang;

insert into customer
values(1, "Minh Quan", 10), (2, "Ngoc Oanh", 20), (3, "Hong Ha", 50);

insert into product
values(1, "May giat", 3), (2, "Tu lanh", 5), (3, "Dieu hoa", 7), (4, "Quat", 1), (5, "bep dien", 2);

insert into `order`
values (1, "2006-3-21", null , 1), (2, "2006-3-23", null, 2), (3, "2006-3-16", null, 3);

insert into orderdetail
values (1, 1, 3), (1, 3, 7), (1, 4, 2), (2, 1, 1), (3, 1, 8), (2, 5, 4), (2, 3, 3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order.
select id, `date`, totalprice
from `order`; 

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách.
select c.id, c.`name`, c.age, p.`name` from customer c
inner join `order` o on o.customerID = c.id
inner join orderdetail od on od.orderID = o.id
inner join product p on p.id = od.productID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.id, c.`name`, c.age from customer c
where id not in (select customerID from `order`);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán 
-- của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.id, `date`, sum(QTY * price) as "price"
from `order` o
inner join orderdetail od on od.orderID = o.id
inner join product p on p.id = od.productID
group by o.id;
