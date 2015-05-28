require 'sqlite3'
require 'webrick'
include WEBrick

s = HTTPServer.new(Port: 1234, DocumentRoot: File.join(Dir.pwd, '/'))

class Getter < HTTPServlet::AbstractServlet

  def do_GET request, response
    status, content_type, body = getter request

    response.status = status
    response['Content-Type'] = content_type
    response.body = body
  end

  def getter request
    return 200, 'text/html', File.open('index.html')
  end
end

class Poster < HTTPServlet::AbstractServlet

  def do_POST request, response
    status, content_type, body = poster request

    response.status = status
    response['Content-Type'] = content_type
    response.body = body
  end

  def poster request
    email = request.query['email']
    password = request.query['password']

    db = SQLite3::Database.new "../sqlite3/cool_app.db"

    # string interpolation!
    user = db.execute "select email, password from new_users where email = '#{email}' and password = '#{password}'"

    db.close if db

    return 200, 'text/html', "You submitted: #{user}"
  end
end

s.mount("/", Getter)
s.mount("/process", Poster)
trap("INT") { s.shutdown }
s.start