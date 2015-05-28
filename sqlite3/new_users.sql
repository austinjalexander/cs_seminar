-- all lower-case and not too worried about spacing
-- One SQL script to rule them all! muahhahaha!

create table new_users (
  id integer primary key autoincrement not null,
  email text not null,
  password text not null
);

insert into new_users (email, password) values 
  ('sara@bu.edu', '12345'),
  ('mark@gmail.com', 'apples'),
  ('cali@yahoo.com', 'sdkdferih34234235rfkdfkhsdf'),
  ('nathan@somerandomthing.com', 'nathan');

-- RED ALERT: STORING PASSWORDS AS PLAIN TEXT IS WRONG, BAD, TERRIBLE, AWFUL, ...
