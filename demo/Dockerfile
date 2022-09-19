FROM openjdk:11.0

MAINTAINER Sabiha "sabiha.chougle5@gmail.com"

WORKDIR /usr/local/bin/

EXPOSE 8080

COPY ./target/demo-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]