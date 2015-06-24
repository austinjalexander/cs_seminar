import os
from flask import Flask, render_template

app = Flask(__name__)

@app.route('/')

def index():
    
    return render_template('index.html', name="Austin")
    
app.run(host=os.getenv('IP', '0.0.0.0'), port=os.getenv('PORT', 8080))
