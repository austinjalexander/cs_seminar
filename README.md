#Initial Set Up!

1. In a browser tab, go to: <a href="https://c9.io/" target="_blank">c9.io</a>
2. Create a new, free account.
3. Create a new workspace (give it a cool name) and select _Custom_ as the type.
4. In the terminal: `sudo pip install pyzmq tornado scikit-learn`
5. In the terminal: `sudo pip install ipython --upgrade`
6. In the terminal: `sudo apt-get install python-pandas`
7. In the terminal: `git clone https://github.com/austinjalexander/cs_whirlwind.git`

_Note 1: Steps 4 and 5 above are not ideal, but using_ `sudo` _and_ `apt-get` _is necessary due to the memory constraints of a free account at_ Cloud9. _Feel free to ask me more about this bit._

_Note 2: From now on, instead of "in the terminal", I'll write_ `$`.


##Run Jupyter (IPython) Notebooks!

1. In the terminal: `ipython notebook --ip=0.0.0.0 --port=8080 --no-browser`
2. In a new browser tab: `http://YOUR_COOL_WORKSPACE_NAME-c9-YOUR_USERNAME.c9.io/`


##Create new SQLite database and a new table (and then delete it)!

1. `$ cd sqlite3/`
2. `$ sqlite3 COOL_APPNAME.db`
3. At the sqlite prompt: `.databases`
4. At the sqlite prompt: `.tables`
5. At the sqlite prompt: `.quit`
6. `$ sqlite3 COOL_APPNAME.db < users.sql`
7. `$ sqlite3 COOL_APPNAME.db`
8. At the sqlite prompt: `.tables`
9. At the sqlite prompt: `DROP TABLE USERS;`
10. At the sqlite prompt: `.tables`

_Note 1: Some people prefer singular table names. Also, SQL commands are upper-case by convention; personally, I prefer lower-case._

_Note 2: From now on, instead of "at the sqlite prompt", I'll write_ `sqlite>`.

##Create a new user record (and then delete it)!

1. `$ cd sqlite3/`
2. `$ sqlite3 COOL_APPNAME.db`
3. `sqlite> SELECT * FROM USERS;`
4. `sqlite> INSERT INTO USERS (firstname, age) VALUES ('Jimmy', 25);`
5. `sqlite> SELECT * FROM USERS;`
6. `sqlite> DELETE FROM USERS WHERE firstname = 'Jimmy';`
7. `sqlite> select * from users;` (a taste of lower case!)


