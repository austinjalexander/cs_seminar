require 'cgi'
require 'sqlite3'

include 'server.rb'

db = SQLite3::Database.new "../sqlite3/cool_app.db"

cgi = CGI.new

email = cgi['email']
password = cgi['password']


#db.execute "insert into new_users (email, password) values (#{email}, #{password})"
    
#db.close if db
