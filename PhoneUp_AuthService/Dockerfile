FROM openjdk:11
EXPOSE 8803
WORKDIR /app
COPY target/PhoneUp_AuthService-0.0.1-SNAPSHOT.jar PhoneUp_AuthService.jar
ENTRYPOINT ["java", "-jar", "/app/PhoneUp_AuthService.jar"]
