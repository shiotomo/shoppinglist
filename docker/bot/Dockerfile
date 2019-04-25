FROM python:3.7-alpine

RUN mkdir /bot
WORKDIR /bot

RUN pip install pipenv
RUN pipenv install

CMD pipenv run start
