from datetime import *
import sqlalchemy
import sqlalchemy.ext.declarative

Base = sqlalchemy.ext.declarative.declarative_base()

class Product(Base):
    __tablename__ = 'product'
    id = sqlalchemy.Column(sqlalchemy.Integer, primary_key=True)
    name = sqlalchemy.Column(sqlalchemy.String(256))
    status = sqlalchemy.Column(sqlalchemy.String(256))
    created_at = sqlalchemy.Column(sqlalchemy.DateTime, default=datetime.now(JST()))
    updated_at = sqlalchemy.Column(sqlalchemy.DateTime, default=datetime.now(JST()))
