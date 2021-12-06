use quanlysinhvien;

select * from student;

select * from student
where status = true;

select * from subject
where Credit < 10;

select * from student
inner join class on class.ClassID = student.StudentId
where ClassName = 'A1';

select StudentName, SubName, Mark from student
inner join mark on mark.StudentId = student.StudentId
inner join `subject` on `subject`.SubId = mark.SubId
where SubName = 'CF';