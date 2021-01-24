1. select c.name, t.name from courses c left out join teachers t on t.id = c.teacher_id;

2. select t.name from courses c inner join teachers t on t.id = c.teacher_id group by t.name order by count(*) desc limit 1;

3. select name from teachers where id not in ( select t.id from courses c inner join teachers t on t.id = c.teacher_id);