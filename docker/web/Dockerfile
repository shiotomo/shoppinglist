FROM openjdk:8-jdk-alpine

RUN mkdir /web
WORKDIR /web

COPY web /web

RUN apk update
RUN apk add gradle
RUN gradle build

CMD java -jar -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=production /web/build/libs/web-0.0.1.jar
