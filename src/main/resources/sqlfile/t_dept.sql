create table t_dept
(
    dept_id   int auto_increment
        primary key,
    dept_name varchar(50) null
);

INSERT INTO ssm.t_dept (dept_id, dept_name) VALUES (1, '部门A');
INSERT INTO ssm.t_dept (dept_id, dept_name) VALUES (2, '部门B');
INSERT INTO ssm.t_dept (dept_id, dept_name) VALUES (3, '部门C');
INSERT INTO ssm.t_dept (dept_id, dept_name) VALUES (4, '部门D');
