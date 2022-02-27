FROM openjdk:17-alpine
LABEL maintainer="mczarmayne@gmail.com"
VOLUME /main-app
ADD build/libs/app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]