## SQL Injection!!!
1. Back in the sqlite3 directory, run: `$ sqlite3 COOL_APPNAME.db < new_users.sql`
2. `$ gem install sqlite3`
3. Back in this (ruby) directory, run: `$ ruby db_connect_check.rb` (you should see some terminal output)
4. `$ ruby process_server.rb` (will start a local ruby server)
5. In a new browser tab: `http://YOUR_COOL_WORKSPACE_NAME-c9-YOUR_USERNAME.c9.io/`


##SQL Injection Protection!

1. `$ cd cool_app`
2. `$ bundle install`
3. `$ rails s -p $PORT -b $IP` (ctrl-C to shutdown the server)
4. In a new browser tab: `http://YOUR_COOL_WORKSPACE_NAME-c9-YOUR_USERNAME.c9.io/`
