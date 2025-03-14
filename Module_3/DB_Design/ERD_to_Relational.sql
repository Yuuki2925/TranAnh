create database QLVT_DB;
use QLVT_DB;

create table PHIEUXUAT(
	SoPX varchar(10) primary key,
    NgayXuat date
);

create table PHIEUNHAP(
	SoPN varchar(10) primary key,
    NgayNhap date
);

create table VATTU(
	MaVtu varchar(10) primary key,
    TenVTU nvarchar(50)
);

create table DONDH(
	SoDH varchar(10) primary key,
    NgayDH date
);

create table NHACC(
	MaNCC varchar(10) primary key,
    TenNCC nvarchar(50),
    DiaChi nvarchar(50),
    SDT varchar(10) check (SDT = 10)
);

create table CHITIET_PHIEUXUAT(
	SoPX varchar(20),
    MaVTU varchar(20),
    DGXuat decimal(10,2),
    SLXuat int,
    primary key(SoPX, MaVTU),
    foreign key(SoPX) references PHIEUXUAT(SoPX),
	FOREIGN KEY (MaVTU) REFERENCES VATTU(MaVTU)
);

CREATE TABLE CHITIET_PHIEUNHAP (
    SoPN VARCHAR(20),
    MaVTU VARCHAR(20),
    DGNhap DECIMAL(10,2),
    SLNhap INT,
    PRIMARY KEY (SoPN, MaVTU),
    FOREIGN KEY (SoPN) REFERENCES PHIEUNHAP(SoPN),
    FOREIGN KEY (MaVTU) REFERENCES VATTU(MaVTU)
);

CREATE TABLE CHITIET_DONDATHANG (
    SoDH VARCHAR(20),
    MaVTU VARCHAR(20),
    PRIMARY KEY (SoDH, MaVTU),
    FOREIGN KEY (SoDH) REFERENCES DONDH(SoDH),
    FOREIGN KEY (MaVTU) REFERENCES VATTU(MaVTU)
);

CREATE TABLE CUNG_CAP (
    MaNCC VARCHAR(20),
    MaVTU VARCHAR(20),
    PRIMARY KEY (MaNCC, MaVTU),
    FOREIGN KEY (MaNCC) REFERENCES NHACC(MaNCC),
    FOREIGN KEY (MaVTU) REFERENCES VATTU(MaVTU)
);