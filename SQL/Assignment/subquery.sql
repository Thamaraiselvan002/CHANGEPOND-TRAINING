
use trainingcenter ;
CREATE TABLE COURSES
(
COURSE_ID INT PRIMARY KEY,
COURSE_NAME VARCHAR(56),
COURSE_DURATION INT NOT NULL,
COURSE_FEES INT NOT NULL,
COURSE_TOPIC TEXT
);
insert into courses values
(1,'java',60,18000,null),
(2,'software testing',80,18000,null),
(3,'cyber security',30,18000,null),
(4,'web development',60,18000,null),
(5,'.net',100,18000,null),
(6,'data science',75,18000,null),
(7,'machine learning',30,18000,null);
select * from courses;

alter table trainer add column course_id int;
alter table trainer add foreign key(course_id) references courses(course_id);
select * from trainingcenter.trainer; 
