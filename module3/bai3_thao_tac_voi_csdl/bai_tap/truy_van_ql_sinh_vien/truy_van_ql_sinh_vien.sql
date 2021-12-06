use quanlysinhvien;

select * from student
where StudentName like 'h%';

select * from class
where Month(StartDate) = 12;

select * from subject
where Credit between 3 and 5;

set SQL_SAFE_UPDATES = 0;
update student set classId = 2 where StudentName = 'Hung';
set SQL_SAFE_UPDATES = 1;

select s.StudentName, sb.SubName, m.Mark from student as s
inner join mark as m on m.StudentId = s.StudentId
inner join `subject` as sb on sb.SubId = m.SubId
order by m.Mark desc, m.Mark asc


