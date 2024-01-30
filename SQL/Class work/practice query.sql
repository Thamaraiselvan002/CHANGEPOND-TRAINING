use practise;



select  * from employees where first_name ='john';
select * from employees where job_id ='IT_PROG' and manager_id='102';
select * from employees where first_name='guy' or last_name='khoo';
select * from employees where job_id ='st_clerk'  and first_name= 'julia' or first_name= 'james';
select * from employees where first_name not in ('john','julie','james');
select * from employees where first_name like 'alex%';
select * from employees where salary like '1700_';
select * from employees where salary like '_9%';
select * from employees where first_name not like '%x%';
select * from employees where salary between 10000 and  24000;
select * from employees where salary*12 between 150000 and 300000;
select * from employees where manager_id is not null;
select * from employees where manager_id is null;
select * from employees where  commissioon_pct is not null;
select * from employees where  commissioon_pct is  null;
select distinct hire_date from employees;
select distinct salary from employees where salary like '_800';
SELECT COUNT(*) FROM EMPLOYEES WHERE SALARY >17000;
SELECT COUNT(*) FROM EMPLOYEES WHERE SALARY <17000;
SELECT COUNT(MANAGER_ID) FROM EMPLOYEES;
SELECT COUNT( distinct MANAGER_ID) FROM EMPLOYEES;
select salary ,count( employee_id) from employees where salary  >11000 group by salary  order by  salary desc;
select employee_id , avg (salary) from employees group by employee_id having avg(salary *12) >150000;
select manager_id,count(*) from employees  group by manager_id having count(*) >1;
select manager_id from employees  group by manager_id having count(*) >1;
select * from employees order by employee_id desc limit 10;
select * from employees limit 10;
select min(salary) ,max(salary) from employees;
select job_id, min(salary) ,max(salary) from employees group by job_id;
select round (avg(salary),2) from employees where hire_date > '1998-01-01'; 