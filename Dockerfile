FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/integration-tjsc.jar /app/integration-tjsc.jar

ENTRYPOINT ["java", "-jar", "integration-tjsc.jar"]