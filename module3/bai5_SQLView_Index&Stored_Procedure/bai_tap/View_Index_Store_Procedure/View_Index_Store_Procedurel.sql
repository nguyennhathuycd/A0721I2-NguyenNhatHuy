create database demo;

use demo;

create table Products(
	id int auto_increment primary key,
    productCode int,
    productName nvarchar(45),
    productPrice double,
    productAmount double,
    productDescription nvarchar(100),
    productStatus bit
);

insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (43, 'Pork - Bacon,back Peameal', 7716.94, 7591.47, 'Bag - Bread, White, Plain', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (48, 'Petite Baguette', 1322.11, 5714.14, 'Fiddlehead - Frozen', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (16, 'Banana - Leaves', 5564.84, 3118.86, 'Tofu - Firm', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (50, 'Beer - Steamwhistle', 6742.85, 8038.95, 'Bagelers - Cinn / Brown', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (54, 'Soup - Cream Of Broccoli', 2182.07, 6305.9, 'Beef - Cow Feet Split', 1);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (89, 'Ice Cream Bar - Hagen Daz', 7954.75, 1616.14, 'Crab - Claws, 26 - 30', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (4, 'Table Cloth 90x90 White', 8199.42, 7259.84, 'Goulash Seasoning', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (15, 'Ocean Spray - Ruby Red', 1012.46, 5765.74, 'Shallots', 0);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (73, 'Pie Filling - Cherry', 576.68, 3714.76, 'Wine - Champagne Brut Veuve', 1);
insert into Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values (24, 'Otomegusa Dashi Konbu', 5861.85, 1636.47, 'Wine - Pinot Grigio Collavini', 0);

-- T???o Unique Index tr??n b???ng Products (s??? d???ng c???t productCode ????? t???o ch??? m???c)
ALTER TABLE products ADD UNIQUE INDEX idx_productCode(productCode);

select * from products
where productCode = 4;

-- T???o Composite Index tr??n b???ng Products (s??? d???ng 2 c???t productName v?? productPrice)
ALTER TABLE products ADD INDEX idx_productName_productPrice(productName, productPrice);

-- S??? d???ng c??u l???nh EXPLAIN ????? bi???t ???????c c??u l???nh SQL c???a b???n th???c thi nh?? n??o
EXPLAIN select * from products
where productCode = 4;

-- T???o view l???y v??? c??c th??ng tin: productCode, productName, productPrice, productStatus t??? b???ng products.
CREATE VIEW products_views AS
SELECT productCode, productName, productPrice, productStatus
FROM  products;

select * from products_views;

-- Ti???n h??nh s???a ?????i view
CREATE OR REPLACE VIEW update_products_views AS
SELECT productCode, productName, productPrice, productStatus, productAmount
FROM products;

-- Ti???n h??nh xo?? view
DROP VIEW update_products_views;

-- T???o store procedure l???y t???t c??? th??ng tin c???a t???t c??? c??c s???n ph???m trong b???ng product.
DELIMITER //
CREATE PROCEDURE findAllProducts()
BEGIN
  SELECT * FROM products;
END //
DELIMITER ;

call findAllProducts();

-- T???o store procedure th??m m???t s???n ph???m m???i
DELIMITER //
CREATE PROCEDURE addNewProduct(IN productCode int, productName nvarchar(45), productPrice double, productAmount double, productDescription nvarchar(100), productStatus bit)
BEGIN
  insert into products (productCode, productName, productPrice, productAmount, productDescription, productStatus) values(productCode, productName, productPrice, productAmount, productDescription, productStatus);
END //
DELIMITER ;

call addNewProduct(53, "B??nh", 30000, 1000, "B??nh g???o", 1);

-- T???o store procedure s???a th??ng tin s???n ph???m theo id
DELIMITER //
CREATE PROCEDURE updateProduct(IN productId int, product_name nvarchar(45))
BEGIN
  update products set productName = product_name where id = productId;
END //
DELIMITER ;

call updateProduct(2, "Soup");

-- T???o store procedure xo?? s???n ph???m theo id
DELIMITER //
CREATE PROCEDURE deleteProduct(IN productId int)
BEGIN
  delete from products where id = productId;
END //
DELIMITER ;

call deleteProduct(10);