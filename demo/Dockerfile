FROM openjdk:20-ea-14-jdk-oraclelinux8

MAINTAINER Sabiha "sabiha.chougle5@gmail.com"

EXPOSE 8080

RUN rm -rf ./webapps/*

COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/bin/webapp.jar

CMD ["java", "-jar", "webapp.jar"]