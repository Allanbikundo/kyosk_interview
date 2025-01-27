# Stage 1: Build
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven configuration files and dependencies
COPY pom.xml ./
COPY src ./src

# Run Maven build to create the JAR file
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the backend port
EXPOSE 8081

# Run the application
CMD ["java", "-jar", "app.jar"]