CREATE DATABASE QLBH;
USE QLBH;

CREATE TABLE Customer (
    cID VARCHAR(10) PRIMARY KEY,
    cName NVARCHAR(50) NOT NULL,
    cAge INT
);

CREATE TABLE `Order` (
    oID VARCHAR(10) PRIMARY KEY,
    cID VARCHAR(10) NOT NULL,
    oDate DATE,
    oTotalPrice INT,
    CONSTRAINT FK_C_O FOREIGN KEY (cID) REFERENCES Customer(cID)
);

CREATE TABLE Product (
    pID VARCHAR(10) PRIMARY KEY,
    pName NVARCHAR(50) NOT NULL,
    pPrice INT
);

CREATE TABLE OrderDetail (
    oID VARCHAR(10),
    pID VARCHAR(10),
    odQTY INT,
    PRIMARY KEY (oID, pID),
    CONSTRAINT FK_O_OD FOREIGN KEY (oID) REFERENCES `Order`(oID),
    CONSTRAINT FK_P_OD FOREIGN KEY (pID) REFERENCES Product(pID)
);

INSERT INTO Customer (cID, cName, cAge)
VALUES
(1, 'Minh Quan', 10),
(2, 'Ngoc Oanh', 20),
(3, 'Hong Ha', 50);

INSERT INTO `Order` (oID, cID, oDate, oTotalPrice)
VALUES
(1, 1, '2006-3-21', NULL),
(2, 2, '2006-3-23)', NULL), 
(3, 1, '2006-3-16', NULL);

INSERT INTO Product (pID, pName, pPrice)
VALUES
(1, 'May Giat', 3),
(2, 'Tu Lanh', 5),
(3, 'Dieu Hoa', 7),
(4, 'Quat', 1),
(5, 'Bep Dien', 2);

INSERT INTO OrderDetail (oID, pID, odQTY)
VALUES
(1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1),
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

-- Hiển thị các thông tin gồm oID, oDate của tất cả các hóa đơn trong bảng Order
SELECT o.oID, o.oDate, p.pPrice
FROM `Order` o JOIN OrderDetail od ON od.oID = o.oID
			   JOIN Product p ON od.pID = p.pID;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
SELECT Customer.cName, Product.pName, Product.pPrice
FROM Customer JOIN `Order` ON Customer.cID = `Order`.cID
			  JOIN OrderDetail ON `Order`.oID = OrderDetail.oID
			  JOIN Product ON OrderDetail.pID = Product.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
SELECT cName
FROM Customer
WHERE cID NOT IN (SELECT DISTINCT cID
				  FROM `Order`);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)
SELECT `Order`.oID, `Order`.oDate, SUM(odQTy * pPrice) as TotalPrice
FROM `Order` JOIN OrderDetail ON `Order`.oID = OrderDetail.oID
			 JOIN Product ON OrderDetail.pID = Product.pID
Group by `Order`.oID, `Order`.oDate
