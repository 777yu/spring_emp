create table t_emp
(
    emp_id   int auto_increment
        primary key,
    emp_name varchar(50) null,
    age      int         null,
    gender   varchar(50) null,
    dept_id  int         null
);

INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id) VALUES (1, '小明', 12, '0', 1);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id) VALUES (2, '李四', 15, '1', 2);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id) VALUES (3, '王五', 16, '1', 1);
INSERT INTO ssm.t_emp (emp_id, emp_name, age, gender, dept_id) VALUES (8, 'yunying', 18, '1', 4);
