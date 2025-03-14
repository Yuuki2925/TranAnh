create database QLBH;
use QLBH;

create table Customer(
	cID varchar(10) primary key,
    cName nvarchar(50) not null,
    cAge int
);

create table `Order`(
	oID varchar(10) primary key,
    cID varchar(10) not null,
    oDate date,
    oTotalPrice int,
    constraint FK_C_O foreign key (cID) references Customer(cID)
);

create table Product(
	pID varchar(10) primary key,
    pName nvarchar(50)not null,
    pPrice int
); 

create table OrderDetail(
	oID varchar(10),
    pID varchar(10),
    odQTY varchar(20),
    primary key(oID, pID),
    constraint FK_O_OD foreign key (oID) references `Order`(oID),
    constraint FK_P_OD foreign key (pID) references Product(pID)
);