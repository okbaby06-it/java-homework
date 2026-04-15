create database UniversityDB;

use universitydb;

create table students (
	id int primary key,
    name varchar(50),
    age int
);

CREATE TABLE courses (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE student_courses (
    student_id INT,
    course_id INT,
    grade DECIMAL(5,2),

    PRIMARY KEY (student_id, course_id),

    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);

insert into students (id, name, age) values (1,  N'Nguyễn Thị Thúy An', 20);
insert into students (id, name, age) values (2,  N'Lê Hồng Nguyên', 19);
insert into students (id, name, age) values (3,  N'Trần Thị Diễm quỳnh', 21);
insert into students (id, name, age) values (4,  N'Lê Bảo An', 20);
insert into students (id, name, age) values (5,  N'Huỳnh Tấn Mạnh', 22);
insert into students (id, name, age) values (6,  N'Trương Chí Bảo', 22);
insert into students (id, name, age) values (7,  N'Nguyễn Hoàng Nam', 20);
insert into students (id, name, age) values (8,  N'Châu Tiểu Quý', 21);
insert into students (id, name, age) values (9,  N'Nguyễn Thị Tuyết Nhung', 20);
insert into students (id, name, age) values (10,  N'Trần Thị Thúy Vy', 20);

insert into courses (id, name) values (1, N'Lập trình Java');
insert into courses (id, name) values (2, N'Cơ sở dữ liệu MySQL');
insert into courses (id, name) values (3, N'Cấu trúc dữ liệu & Giải thuật');
insert into courses (id, name) values (4, N'Lập trình Web');
insert into courses (id, name) values (5, N'Kỹ thuật phần mềm');
insert into courses (id, name) values (6, N'An ninh mạng');
insert into courses (id, name) values (7, N'Trí tuệ nhân tạo');
insert into courses (id, name) values (8, N'Phát triển ứng dụng di động');

-- Sinh viên 1 (Nguyễn Thị Thúy An)
insert into student_courses (student_id, course_id, grade) values (1, 1, 8.5);
insert into student_courses (student_id, course_id, grade) values (1, 2, 7.8);
insert into student_courses (student_id, course_id, grade) values (1, 4, 9.0);

-- Sinh viên 2 (Lê Hồng Nguyên)
insert into student_courses (student_id, course_id, grade) values (2, 1, 7.5);
insert into student_courses (student_id, course_id, grade) values (2, 3, 8.0);
insert into student_courses (student_id, course_id, grade) values (2, 5, 7.2);

-- Sinh viên 3 (Trần Thị Diễm Quỳnh)
insert into student_courses (student_id, course_id, grade) values (3, 2, 9.0);
insert into student_courses (student_id, course_id, grade) values (3, 4, 8.5);
insert into student_courses (student_id, course_id, grade) values (3, 6, 8.8);

-- Sinh viên 4 (Lê Bảo An)
insert into student_courses (student_id, course_id, grade) values (4, 1, 6.5);
insert into student_courses (student_id, course_id, grade) values (4, 3, 7.0);
insert into student_courses (student_id, course_id, grade) values (4, 7, 7.5);

-- Sinh viên 5 (Huỳnh Tấn Mạnh)
insert into student_courses (student_id, course_id, grade) values (5, 2, 8.2);
insert into student_courses (student_id, course_id, grade) values (5, 5, 7.9);
insert into student_courses (student_id, course_id, grade) values (5, 8, 8.5);

-- Sinh viên 6 (Trương Chí Bảo)
insert into student_courses (student_id, course_id, grade) values (6, 1, 9.0);
insert into student_courses (student_id, course_id, grade) values (6, 4, 8.7);
insert into student_courses (student_id, course_id, grade) values (6, 6, 7.5);

-- Sinh viên 7 (Nguyễn Hoàng Nam)
insert into student_courses (student_id, course_id, grade) values (7, 3, 7.8);
insert into student_courses (student_id, course_id, grade) values (7, 5, 8.0);
insert into student_courses (student_id, course_id, grade) values (7, 7, 6.5);

-- Sinh viên 8 (Châu Tiểu Quý)
insert into student_courses (student_id, course_id, grade) values (8, 2, 8.5);
insert into student_courses (student_id, course_id, grade) values (8, 4, 9.2);
insert into student_courses (student_id, course_id, grade) values (8, 8, 8.0);

-- Sinh viên 9 (Nguyễn Thị Tuyết Nhung)
insert into student_courses (student_id, course_id, grade) values (9, 1, 7.0);
insert into student_courses (student_id, course_id, grade) values (9, 3, 8.5);
insert into student_courses (student_id, course_id, grade) values (9, 6, 7.8);

-- Sinh viên 10 (Trần Thị Thúy Vy)
insert into student_courses (student_id, course_id, grade) values (10, 2, 9.5);
insert into student_courses (student_id, course_id, grade) values (10, 4, 8.0);
insert into student_courses (student_id, course_id, grade) values (10, 5, 8.5);


select * from students;
select * from courses;
select * from student_courses;
