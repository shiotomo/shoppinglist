FROM python:3.7

ENV LANG=ja_JP.UTF-8

RUN mkdir /bot
WORKDIR /bot

COPY bot/Pipfile /bot
COPY bot/Pipfile.lock /bot

RUN apt-get update
RUN apt-get install -y python-dev default-libmysqlclient-dev \
      task-japanese locales-all

COPY bot /bot

RUN pip install pipenv \
    &&  pipenv install --system

CMD python bot.py
