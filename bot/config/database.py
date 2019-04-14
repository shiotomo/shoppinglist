### データベースへの接続を行う
### MySQLのみ対応

import os
from os.path import join, dirname
from dotenv import load_dotenv

dotenv_path = join(dirname(__file__), '.env')
load_dotenv(dotenv_path)

mysql_url = os.environ.get("MYSQL_URL")
mysql_username = os.environ.get("MYSQL_USERNAME")
mysql_password = os.environ.get("MYSQL_PASSWORD")
mysql_database = os.environ.get("MYSQL_DATABASE")

engine = create_engine("mysql+pymsql://" + mysql_username + ":" + mysql_password + "@" + mysql_url + "/" + mysql_database + "?charset=utf8", echo=True)
