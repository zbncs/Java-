# Student(S#,Sname,Sage,Ssex) 学生表，
# Course(C#,Cname,T#) 课程表，

# SC(S#,C#,score) 成绩表，

# Teacher(T#,Tname) 教师表 。

# 其中，S#代表学生号，C#代表课程号，T#代表教师号。

# 查询姓“李”的老师的个数
select count(*) from Teacher where Tname like "孙%";

# 查询没学过“叶平”老师课的同学的学号、姓名

select 'C#' from Course where 'T#' = (select 'T#' from Teacher where Tname = "叶平");

select 'S#' from SC where "C#" = (select 'C#' from Course where 'T#' = (select 'T#' from Teacher where Tname = "叶平"));

select 'S#',Sname from Student where 'S#' = (select 'S#' from SC where "C#" = (select 'C#' from Course where 'T#' = (select 'T#' from Teacher where Tname = "叶平")));

# 查询学过“001”并且也学过编号“002”课程的同学的学号、姓名
select 'C#' from Course where 'C#' = '001' or 'C#' = '002';

select 'S#' from SC where 'C#' = (select 'C#' from Course where 'C#' = '001' or 'C#' = '002');

select 'S#',Sname from Student where 'S#' = (select 'S#' from SC where 'C#' = (select 'C#' from Course where 'C#' = '001' or 'C#' = '002'));

