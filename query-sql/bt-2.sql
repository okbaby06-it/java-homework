CREATE DATABASE CompanyDB;

USE CompanyDB;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);

INSERT INTO employees VALUES (1, 'Nguyễn Văn An', 'IT', 1200.00);
INSERT INTO employees VALUES (2, 'Trần Thị Bình', 'HR', 1500.50);
INSERT INTO employees VALUES (3, 'Lê Văn Cường', 'Finance', 2000.75);
INSERT INTO employees VALUES (4, 'Phạm Thị Dung', 'Marketing', 2500.00);
INSERT INTO employees VALUES (5, 'Hoàng Văn Em', 'IT', 3200.25);
INSERT INTO employees VALUES (6, 'Võ Thị Phương', 'HR', 4500.00);
INSERT INTO employees VALUES (7, 'Đặng Văn Giang', 'Finance', 6000.80);
INSERT INTO employees VALUES (8, 'Bùi Thị Hạnh', 'Marketing', 7200.40);
INSERT INTO employees VALUES (9, 'Đỗ Văn Khánh', 'IT', 8500.00);
INSERT INTO employees VALUES (10, 'Ngô Thị Lan', 'HR', 9999.99);

TRUNCATE TABLE employees;

select * from employees;