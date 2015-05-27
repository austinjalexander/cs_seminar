#Initial Set Up!

1. In a browser tab, go to: `https://c9.io/`
2. Create a new, free account.
3. Create a new workspace (give it a cool name) and select _Custom_ as the type.
4. In the terminal: `sudo pip install pyzmq tornado scikit-learn`
5. In the terminal: `sudo pip install ipython --upgrade`
6. In the terminal: `sudo apt-get install python-pandas`
7. In the terminal: `git clone https://github.com/austinjalexander/cs_whirlwind.git`

_Note: Steps 4 and 5 above are not ideal, but using_ `sudo` _and_ `apt-get` _is necessary due to the memory constraints of a free account at_ Cloud9. _Feel free to ask me more about this bit._


##Run IPython Notebooks!

1. In the terminal: `ipython notebook --ip=0.0.0.0 --port=8080 --no-browser`
2. In a new browser tab: `http://YOUR_COOL_WORKSPACE_NAME-c9-YOUR_USERNAME.c9.io/`