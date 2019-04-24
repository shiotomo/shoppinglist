from sqlalchemy import Column, Integer, String, Boolean, Float, Date, DateTime, ForeignKey
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()

class Product(Base):
    __tablename__ = 'product'

    id = Column(Integer, primary_key=True)
    name = Column(String)
    status = Column(String)
    created_at = Column(DateTime)
    updated_at = Column(DateTime)
