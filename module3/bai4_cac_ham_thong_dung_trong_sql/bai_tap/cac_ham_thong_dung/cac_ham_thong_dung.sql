use quanlysinhvien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from `subject`
where credit = (select max(credit) from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.SubId, s.SubName, s.Credit, s.`Status`, m.Mark from `subject` s
inner join mark m on m.SubId = s.SubId
where m.Mark = (select max(mark) from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần.
select s.StudentId, s.StudentName, avg(m.Mark) from student s
inner join mark m on m.StudentId = s.StudentId
group by m.StudentId
order by avg(m.Mark) desc;