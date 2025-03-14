create database quanlydiemthi;
use quanlydiemthi;

create table HocSinh(
	MaHS varchar(20) primary key,
	TenHS nvarchar(50),
    NgaySinh date,
    Lop varchar(20),
    GT varchar(20)
);

create table MonHoc(
	MaMH varchar(20) primary key,
    TenMH varchar(50),
    MaGV varchar(20)
);

create table BangDiem(
	MaHS varchar(50),
    MaMH varchar(50),
    DiemThi int,
    NgayKT datetime,
    primary key(MaHS, MaMH),
    constraint FK_MH_BD foreign key (MaMH) references MonHoc(MaMH),
    constraint FK_HS_BD foreign key (MaHS) references HocSinh(MaHS)
);

create table GiaoVien(
	MaGV varchar(20) primary key,
    TenGV varchar(50),
    SDT varchar(10)
);

alter table MonHoc
add constraint FK_GV_MH foreign key (MaGV) references GiaoVien(MaGV)

