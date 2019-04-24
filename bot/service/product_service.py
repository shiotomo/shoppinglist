import time
from sqlalchemy import create_engine, orm
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy import Column, Integer, String, Boolean, Float, Date, DateTime, ForeignKey

from config.database import Database
from model.product import Product

class ProductService():
    def __init__(self):
        self.session = Database.get_mysql_session()

    def insert(self, name):
        time_stamp = time.strftime('%Y-%m-%d %H:%M:%S')
        product = Product(name = name, status = "new", created_at = time_stamp, updated_at = time_stamp)
        self.session.add(product)
        self.session.commit()

