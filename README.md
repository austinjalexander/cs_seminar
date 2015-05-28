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


#Create a Ruby on Rails app in like two seconds!

1. Create a new <a href="https://c9.io/" target="_blank">c9.io</a> workspace (give it a cool name) and select _Ruby on Rails_ as the type.
2. '$ rails g scaffold User email password'
3. '$ rake db:migrate'
4. Copy the following code block into db/seeds.rb and then run: '$ rake db:seed'  

        ```ruby
        User.create(email: 'sara@bu.edu', password: '12345')
        User.create(email: 'mark@gmail.com', password: 'apples')
        User.create(email: 'cali@yahoo.com', password: 'sdkdferih34234235rfkdfkhsdf')
        User.create(email: 'nathan@somerandomthing.com', password: 'nathan')
        ```
        
5. `$ rails s -p $PORT -b $IP` (ctrl-C to shutdown the server)
6. In a new browser tab: `http://YOUR_COOL_WORKSPACE_NAME-c9-YOUR_USERNAME.c9.io/`
