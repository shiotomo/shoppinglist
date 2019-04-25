FROM mysql:5.7

COPY init.sql /docker-entrypoint-initdb.d/

RUN apt-get update
RUN apt-get install -y procps
