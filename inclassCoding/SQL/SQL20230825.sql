select * from course;

with
	cs001 as (
		select *
        from coursse
        where course_code = 'CS001'
	),
	cs002 as (
		select *
        from coursse
        where course_code = 'CS002'
	)
select *
from cs002
