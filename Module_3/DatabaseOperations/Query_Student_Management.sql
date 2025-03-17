CREATE DATABASE QLSV3;
USE QLSV3;

CREATE TABLE Class(
	ClassID INT AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME NOT NULL,
    Status BIT
);

CREATE TABLE Student(
	StudentID INT AUTO_INCREMENT PRIMARY KEY,
    StudentName NVARCHAR(30) NOT NULL,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    Status BIT,
    ClassID INT NOT NULL
);

CREATE TABLE `Subject`(
	SubId INT AUTO_INCREMENT PRIMARY KEY,
    SubName NVARCHAR(30) NOT NULL,
    Credit TINYINT NOT NULL DEFAULT 1 CHECK (Credit >= 1),
    Status BIT DEFAULT 1
);

CREATE TABLE Mark(
	MarkId INT AUTO_INCREMENT PRIMARY KEY,
    SubId INT NOT NULL,
    StudentID INT NOT NULL,
    Mark FLOAT DEFAULT 0 CHECK (Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    CONSTRAINT FK_Subject_Mark FOREIGN KEY (SubId) REFERENCES Subject (SubId),
	CONSTRAINT FK_Student_Mark FOREIGN KEY (StudentId) REFERENCES Student (StudentID)
);

INSERT INTO Class(ClassName, StartDate, Status)
VALUES
	('A1', '2008-12-20', 1),
	('A2', '2008-12-22', 1),
	('B3', NOW(), 0);

INSERT INTO Student(StudentName, Address, Phone, Status, ClassID)
VALUES
	('Hung', 'Ha Noi', '0912113113', 1, 1),
	('Hoa', 'Hai Phong', NULL, 1, 1),
	('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO `Subject` (SubName, Credit, Status)
VALUES 
    ('CF', 5, 1),
    ('C', 6, 1),
    ('HDJ', 5, 1),
    ('RDBMS', 10, 1);

INSERT INTO Mark (SubID, StudentID, Mark, ExamTimes)
VALUES 
    (1, 1, 8, 1),
    (1, 2, 10, 2),
    (2, 1, 12, 1);
    
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select studentName 
from student
where studentName like "H%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select *
from class
where month(StartDate) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select SubName, Credit
from subject
where credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.


-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần
SELECT 
    Student.StudentName, 
    Subject.SubName, 
    Mark.Mark
FROM Mark
JOIN Student ON Mark.StudentID = Student.StudentID
JOIN Subject ON Mark.SubID = Subject.SubID
ORDER BY Mark.Mark DESC, Student.StudentName ASC;

