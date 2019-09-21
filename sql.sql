CREATE DATABASE IF NOT EXISTS CAFETERIA_MANAGEMENT
CHARACTER SET 'utf8' COLLATE 'utf8_unicode_ci';
USE CAFETERIA_MANAGEMENT;

CREATE TABLE UserAccount(
	id int not null AUTO_INCREMENT,
	username nvarchar(50),
	password nvarchar(20),
	PRIMARY KEY(id)
);

CREATE TABLE Customer(
	id int not null AUTO_INCREMENT,
	name nvarchar(50),
	gender boolean,
	phone nvarchar(20),
	email nvarchar(50),
	address nvarchar(100),
	account_id int,
	PRIMARY KEY(id),
	CONSTRAINT fk_Customer_UserAccount FOREIGN KEY(account_id) REFERENCES UserAccount(id)
);

CREATE TABLE Menu(
	id int not null AUTO_INCREMENT,
	name nvarchar(50),
	PRIMARY KEY(id)
);

CREATE TABLE Drink(
	id int not null AUTO_INCREMENT,
	name nvarchar(50),
	image nvarchar(50),
	unit_price int,
	menu_id int not null, 
	PRIMARY KEY(id),
	CONSTRAINT fk_Menu_Drink FOREIGN KEY(menu_id) REFERENCES Menu(id)
);

CREATE TABLE Bill(
	id int not null AUTO_INCREMENT,
	days date,
	totoal_amount int,
	account_id int,
	PRIMARY KEY(id),
	CONSTRAINT fk_Bill_UserAccount FOREIGN KEY(account_id) REFERENCES UserAccount(id)
);

CREATE TABLE BillDetail(
	id int not null AUTO_INCREMENT,
	quanlity int,
	bill_id int not null, 
	drink_id int not null,
	PRIMARY KEY(id),
	CONSTRAINT fk_Bill_BillDetail FOREIGN KEY(bill_id) REFERENCES Bill(id),
	CONSTRAINT fk_Drink_BillDetail FOREIGN KEY(drink_id) REFERENCES Drink(id)
);

INSERT INTO UserAccount(id,username,password) VALUES (1,'admin','admin');
INSERT INTO UserAccount(id,username,password) VALUES (2,'duong','duong');
INSERT INTO UserAccount(id,username,password) VALUES (3,'hanh','hanh');

INSERT INTO Menu(id,name) VALUES (1,'CÀ PHÊ');
INSERT INTO Menu(id,name) VALUES (2,'TRÀ & MACCHIATO');
INSERT INTO Menu(id,name) VALUES (3,'THỨC UỐNG ĐÁ XAY');
INSERT INTO Menu(id,name) VALUES (4,'THỨC UỐNG TRÁI CÂY');

INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (1,'AMERICANO','',39000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (2,'BẠC SỈU','',29000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (3,'CÀ PHÊ ĐEN','',29000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (4,'CÀ PHÊ SỮA','',29000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (5,'CAPPUCINNO','',45000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (6,'CARAMEO MACCHIATO','',55000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (7,'ESPRESSO','',35000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (8,'LATTE','',45000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (9,'MOCHA','',49000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (10,'SOCOLA ĐÁ','',55000,1);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (11,'TRÀ ĐÀO CAM SẢ','',45000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (12,'TRÀ ĐEN MACCHIATO','',42000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (13,'TRÀ GẠO RANG MACCHIATO','',48000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (14,'TRÀ MATCHA LATTE','',59000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (15,'TRÀ MATCHA MACCHIATO','',45000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (16,'TRÀ ỔI THANH LONG MACCHIATO','',48000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (17,'TRÀ OOLONG VẢI NHƯ Ý','',45000,2);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (18,'CARAMEL ĐÁ XAY','',59000,3);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (19,'MOCHA ĐÁ XAY','',59000,3);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (20,'SÔ-CÔ-LA ĐÁ XAY','',59000,3);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (21,'SINH TỐ CAM XOÀI','',59000,4);
INSERT INTO Drink(id,name,image,unit_price,menu_id) VALUES (22,'SINH TỐ VIỆT QUẤT','',59000,4);

INSERT INTO Customer(id,name,gender,phone,email,address,account_id) VALUES (1, 'Hoàng Tùng Dương', true, '01234567890', 'hoangtungduong0403@gmail.com', 'Đồng Nai',2);
INSERT INTO Customer(id,name,gender,phone,email,address,account_id) VALUES (2, 'Phạm Huỳnh Mỹ Hạnh', false, '01236547890', 'banoimyhanh@gmail.com', 'Quảng Nam',3);

INSERT INTO Bill(id,days,totoal_amount,account_id) VALUES (1, '2019-2-10', 118000, 3);
INSERT INTO Bill(id,days,totoal_amount,account_id) VALUES (2, '2019-2-12', 80000, 2);

INSERT INTO BillDetail(id,quanlity,bill_id,drink_id) VALUES (1, 1, 1, 21);
INSERT INTO BillDetail(id,quanlity,bill_id,drink_id) VALUES (2, 1, 1, 13);
INSERT INTO BillDetail(id,quanlity,bill_id,drink_id) VALUES (3, 1, 2, 7);
INSERT INTO BillDetail(id,quanlity,bill_id,drink_id) VALUES (4, 1, 2, 17);



