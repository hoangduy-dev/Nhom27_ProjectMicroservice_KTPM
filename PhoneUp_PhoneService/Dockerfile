FROM openjdk:11
EXPOSE 8801
WORKDIR /app
COPY target/PhoneUp_PhoneService-0.0.1-SNAPSHOT.jar PhoneUp_PhoneService.jar
ENTRYPOINT ["java", "-jar", "/app/PhoneUp_PhoneService.jar"]
