# Use a base image
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/books-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]