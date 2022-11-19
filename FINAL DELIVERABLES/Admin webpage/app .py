from flask import Flask, render_template, request, redirect, url_for, session
import ibm_db
import re
from sendgrid import SendGridAPIClient
from sendgrid.helpers.mail import Mail
from flask_mysqldb import MySQL
from logging import error
from jinja2.utils import select_autoescape
import bcrypt
import json



app = Flask(__name__)
  
app.secret_key = 'a'

conn = ibm_db.connect("DATABASE=bludb;HOSTNAME=ba99a9e6-d59e-4883-8fc0-d6a8c9f7a08f.c1ogj3sd0tgtu0lqde00.databases.appdomain.cloud;PORT=31321;SECURITY=SSL;SSLServerCertificate=Cert.crt;UID=djy96762;PWD=cNFJRrdL17ah7wbW",'','')
def send_mail(email):
    print(email)
    message = Mail(from_email='venkatkisshore2005@gmail.com',
                   to_emails='bhuvaneshbs999@gmail.com',
                   subject='caution',
                   plain_text_content='Please Stay Safe',
                   html_content='<h2>You are entering into a containment Zone</h2>')

    try:
        sg = SendGridAPIClient(
            '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')
        response = sg.send(message)
        print(response.status.code)
        print(response.body)
        print(response.headers)
    except Exception as e:
        print(e)
@app.route('/')

def index():
    return render_template('index.html')


@app.route('/home', methods=['POST', 'GET'])
def home():
    lat = request.form['uname']
    lon = request.form['pass']
    vis = "admin@gmail.com"
    if(lat == vis or lon ==vis):

        session['id']=vis
        return render_template('home.html')

    return render_template('index.html')

@app.route('/logout')
def logout():
   session.pop('loggedin', None)
   session.pop('id', None)
   session.pop('username', None)
   return render_template('index.html')


if __name__ == '__main__':
   app.run(host='0.0.0.0')   

 