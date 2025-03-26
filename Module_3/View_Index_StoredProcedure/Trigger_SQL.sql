CREATE DATABASE Company;
USE Company;

CREATE TABLE employees (
	id INT auto_increment PRIMARY KEY,
    name varchar(50) not null,
    department varchar(50) not null,
    salary decimal(10, 2) not null
);

DELIMITER //
CREATE TRIGGER update_department
before INSERT ON employees
FOR EACH ROW
BEGIN
	IF NEW.salary >= 5000 THEN
		SET new.department = 'Management';
	ELSEIF NEW.salary >= 3000 THEN
		SET new.department = 'Sales';
	ELSE
		SET NEW.department = 'Support';
	END IF;
END //
DELIMITER ;

INSERT INTO employees (name, department, salary)
VALUES
('John Doe', 'A', 3500),
('Jane Smith', 'A', 2000),
('David Johnson', 'A', 6000);