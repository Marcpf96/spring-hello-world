FROM openjdk:8-jdk-alpine
VOLUME /tmp

ADD mw002-0.0.1-SNAPSHOT.jar app.jar 
EXPOSE 8082
ENTRYPOINT ["java", "-Xmx750m", "-jar","/app.jar"]
