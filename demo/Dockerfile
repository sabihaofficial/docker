FROM tomcat:8.5.47-jdk8-openjdk

MAINTAINER Sabiha "sabiha.chougle5@gmail.com"

EXPOSE 8080

RUN rm -rf ./webapps/*

COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]