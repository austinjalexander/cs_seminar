##Create a new SQLite database and a new table

1. `$ sqlite3 COOL_APPNAME.db`
2. At the sqlite prompt: `.databases`
3. At the sqlite prompt: `.tables`
4. At the sqlite prompt: `.exit`
5. `$ sqlite3 COOL_APPNAME.db < users.sql`
6. `$ sqlite3 COOL_APPNAME.db`
7. At the sqlite prompt: `.tables`
8. At the sqlite prompt: `DROP TABLE USERS;` (WARNING: PERMANENT!)
9. At the sqlite prompt: `.tables`

_Note 1: Some people prefer singular table names. Also, SQL commands are upper-case by convention; personally, I prefer lower-case (as you'll see below)._

_Note 2: From now on, instead of "at the sqlite prompt", I'll write_ `sqlite>`.

##Create a new user record (and then delete it)!

1. `$ sqlite3 COOL_APPNAME.db`
2. `sqlite> SELECT * FROM USERS;`
3. `sqlite> INSERT INTO USERS (firstname, age) VALUES ('Jimmy', 25);`
4. `sqlite> SELECT * FROM USERS;`
5. `sqlite> DELETE FROM USERS WHERE firstname = 'Jimmy';` (WARNING: PERMANENT!)
6. `sqlite> select * from users;` (a taste of lower case!)

