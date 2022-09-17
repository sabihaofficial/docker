FROM tomcat:10.1.0-M17-jdk11-temurin-jammy

MAINTAINER Sabiha "sabiha.chougle5@gmail.com"

EXPOSE 8080

RUN rm -rf ./webapps/*

COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]