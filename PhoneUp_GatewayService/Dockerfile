FROM openjdk:11
EXPOSE 8080
WORKDIR /app
COPY target/PhoneUp_GatewayService-0.0.1-SNAPSHOT.jar PhoneUp_GatewayService.jar
ENTRYPOINT ["java", "-jar", "/app/PhoneUp_GatewayService.jar"]
