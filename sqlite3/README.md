##Create a new SQLite database and a new table

1. `$ cd sqlite3/`
2. `$ sqlite3 COOL_APPNAME.db`
3. At the sqlite prompt: `.databases`
4. At the sqlite prompt: `.tables`
5. At the sqlite prompt: `.exit`
6. `$ sqlite3 COOL_APPNAME.db < users.sql`
7. `$ sqlite3 COOL_APPNAME.db`
8. At the sqlite prompt: `.tables`
9. At the sqlite prompt: `DROP TABLE USERS;` (WARNING: PERMANENT!)
10. At the sqlite prompt: `.tables`

_Note 1: Some people prefer singular table names. Also, SQL commands are upper-case by convention; personally, I prefer lower-case (as you'll see below)._

_Note 2: From now on, instead of "at the sqlite prompt", I'll write_ `sqlite>`.

##Create a new user record (and then delete it)!

1. `$ cd sqlite3/`
2. `$ sqlite3 COOL_APPNAME.db`
3. `sqlite> SELECT * FROM USERS;`
4. `sqlite> INSERT INTO USERS (firstname, age) VALUES ('Jimmy', 25);`
5. `sqlite> SELECT * FROM USERS;`
6. `sqlite> DELETE FROM USERS WHERE firstname = 'Jimmy';` (WARNING: PERMANENT!)
7. `sqlite> select * from users;` (a taste of lower case!)

