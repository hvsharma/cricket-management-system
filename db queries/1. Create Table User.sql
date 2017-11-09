create table cms_user (
	firstName	varchar(20) not null,
    lastName 	varchar(20) not null,
    email		varchar(50) not null unique,
    uniqueID	varchar(40) not null,
    userID		varchar(20) not null,
    phone		varchar(20) not null unique,
    dob			date not null,
    facebook	varchar(100) unique,
    google		varchar(100) unique,
    nickname	varchar(20),
    PRIMARY KEY (uniqueID)
);