FROM openjdk:8-jdk-alpine

ENV LANG=ja_JP.UTF-8

RUN mkdir /web
WORKDIR /web

COPY web /web

RUN apk --update add tzdata && \
    cp /usr/share/zoneinfo/Asia/Tokyo /etc/localtime && \
    apk del tzdata && \
    rm -rf /var/cache/apk/*
RUN apk add gradle
RUN gradle build

CMD java -jar -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=production /web/build/libs/web-0.0.1.jar
