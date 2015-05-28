require 'sqlite3'

# just a quick check to see that we can connect to the database

db = SQLite3::Database.new "../sqlite3/cool_app.db"
    
puts db.execute "select * from new_users where email ='sara@bu.edu'"
    
db.close if db
