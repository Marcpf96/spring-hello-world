FROM openjdk:8-jdk-alpine
VOLUME /tmp

ADD mw002/target/mw002-$VERSION.jar app.jar 
EXPOSE 8082
ENTRYPOINT ["java", "-Xmx750m", "-jar","/app.jar"]
