create table hotel_tables(
hotel_no varchar(45) primary key, 
hotel_name varchar(45),
hotel_city varchar(45)

);
INSERT INTO `hotels`.`hotel_tables`
(`hotel_no`,
`hotel_name`,
`hotel_city`)
VALUES
('H111','EMPIRE_HOTEL','NEW_YORK'),
('H235','PARK_PLACE','NEW_YORK'),
('H432','BROWNSTONE_HOTEL','TORONTO'),
('H498','JAMES_PLASA','TORONTO'),
('H193','DEVON_HOTEL','BOSTON');
SELECT * FROM hotels.hotel_tables;

use hotels;
CREATE TABLE room_tables(
room_no varchar(45) primary key,
hotel_no varchar(45), 
 KEY `hotel_no` (`hotel_no`),
room_type  char(3)
);
INSERT INTO `hotels`.`room_tables`
(`room_no`,
`hotel_no`,
`room_type`,
`price`)
VALUES
('313','H111','s' ,145.00),
('412','H111','s' ,145.00),
('1267','H235','n' ,175.00),
('1289','H235','n' ,195.00),
('876','H432','s' ,124.00);

select * from room_tables;


use hotels;
create table guest_table(
guest_no int(45) primary key,
guest_name varchar(45),
city varchar(45)
);
INSERT INTO `hotels`.`guest_table`
(`guest_no`,
`guest_name`,
`city`)
VALUES
('256','adam wayan','pittusburg'),
('367',' tara commings','baltimorg'),
('879','varis parry','pittusburg'),
('230','tom hancock','atlanta');

select * from guest_table;