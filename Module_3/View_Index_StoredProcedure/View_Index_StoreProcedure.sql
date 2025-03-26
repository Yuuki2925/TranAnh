CREATE DATABASE DEMO;
USE DEMO;

CREATE TABLE Products (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    productCode VARCHAR(50) NOT NULL UNIQUE,
    productName VARCHAR(100) NOT NULL,
    productPrice DECIMAL(10,2) NOT NULL,
    productAmount INT NOT NULL,
    productDescription TEXT,
    productStatus ENUM('Active', 'Inactive') NOT NULL
);

INSERT INTO Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) 
VALUES
    ('P001', 'Laptop ASUS X515', 15000000.00, 10, 'Laptop ASUS X515, RAM 8GB, SSD 512GB', 'Active'),
    ('P002', 'Chuột Logitech G102', 450000.00, 50, 'Chuột gaming Logitech G102, LED RGB', 'Active'),
    ('P003', 'Bàn phím cơ AKKO 3087', 1500000.00, 20, 'Bàn phím cơ AKKO 3087, switch Blue', 'Inactive'),
    ('P004', 'Màn hình Dell 24 inch', 3200000.00, 15, 'Màn hình Dell 24 inch Full HD', 'Active'),
    ('P005', 'Tai nghe Sony WH-1000XM4', 6900000.00, 5, 'Tai nghe chống ồn Sony WH-1000XM4', 'Active');
    
-- 1. Tạo Unique Index trên cột productCode
CREATE UNIQUE INDEX idx_productCode ON Products(productCode);

-- 2. Tạo Composite Index trên productName và productPrice
CREATE INDEX idx_productName_Price ON Products(productName, productPrice);

-- 3. Kiểm tra hiệu suất truy vấn trước và sau khi tạo index
EXPLAIN SELECT *
FROM Products
Where productName = 'Laptop ASUS X515' AND productPrice = 15000000.00;

-- Tạo view
CREATE VIEW V1 AS
SELECT productCode, productName, productPrice, productStatus
FROM Products;

SELECT * FROM V1;

-- Sửa view
ALTER VIEW V1 AS
SELECT productCode, productName, productPrice, productStatus, productAmount
FROM Products;

-- Xóa view
DROP VIEW V1;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
CREATE PROCEDURE GetAllProducts()
BEGIN
    SELECT * FROM Products;
END //
DELIMITER ;
CALL GetAllProducts();

-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //
CREATE PROCEDURE AddProduct(
    IN p_productCode VARCHAR(50),
    IN p_productName VARCHAR(100),
    IN p_productPrice DECIMAL(10,2),
    IN p_productAmount INT,
    IN p_productDescription TEXT,
    IN p_productStatus ENUM('Active', 'Inactive')
)
BEGIN
    INSERT INTO Products (productCode, productName, productPrice, productAmount, productDescription, productStatus) 
    VALUES (p_productCode, p_productName, p_productPrice, p_productAmount, p_productDescription, p_productStatus);
END //
DELIMITER ;
CALL AddProduct('P006', 'Bàn ghế gaming', 2500000.00, 8, 'Bộ bàn ghế gaming cao cấp', 'Active');

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
CREATE PROCEDURE UpdateProduct(
    IN p_Id INT,
    IN p_productCode VARCHAR(50),
    IN p_productName VARCHAR(100),
    IN p_productPrice DECIMAL(10,2),
    IN p_productAmount INT,
    IN p_productDescription TEXT,
    IN p_productStatus ENUM('Active', 'Inactive')
)
BEGIN
    UPDATE Products 
    SET productCode = p_productCode, 
        productName = p_productName, 
        productPrice = p_productPrice, 
        productAmount = p_productAmount, 
        productDescription = p_productDescription, 
        productStatus = p_productStatus
    WHERE Id = p_Id;
END //
DELIMITER ;
CALL UpdateProduct(3, 'P003', 'Bàn phím cơ AKKO 3098', 1800000.00, 15, 'Bàn phím cơ AKKO 3098, switch Red', 'Active');

-- Tạo store procedure xoá sản phẩm theo id
DELIMITER //
CREATE PROCEDURE DeleteProduct(IN p_Id INT)
BEGIN
    DELETE FROM Products WHERE Id = p_Id;
END //
DELIMITER ;
CALL DeleteProduct(5);






