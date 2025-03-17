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
    
-- Hiển thị danh sách tất cả các học viên
SELECT *
FROM Student;

-- Hiển thị danh sách các học viên đang theo học.
SELECT *
FROM Student
WHERE status = true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
SELECT SubID, SubName, Credit
FROM subject
WHERE credit < 10;

-- Hiển thị danh sách học viên lớp A1
select StudentName, ClassName
from student join class on student.ClassID = class.ClassID
where classname = 'A1';

-- Hiển thị điểm môn CF của các học viên.
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';