### データベースへの接続を行う
### MySQLのみ対応

import os
from sqlalchemy import create_engine, orm
from os.path import join, dirname
from dotenv import load_dotenv

class Database():

    # MySQLのセッションを返却
    @classmethod
    def get_mysql_session(self):
        dotenv_path = join(dirname(__file__), '.env')
        load_dotenv(dotenv_path)

        mysql_url = os.environ.get("MYSQL_URL")
        mysql_username = os.environ.get("MYSQL_USERNAME")
        mysql_password = os.environ.get("MYSQL_PASSWORD")
        mysql_database = os.environ.get("MYSQL_DATABASE")
        engine_url = "mysql://" + mysql_username + ":" + mysql_password + "@" + mysql_url + "/" + mysql_database

        engine = create_engine(engine_url, echo = True)
        Session = orm.sessionmaker(bind = engine)
        session = Session()

        print("MySQL Session Create!!")

        return session
