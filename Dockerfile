# Use an official Java runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the built JAR file into the container
COPY ["target/datamesh-backend-1.0.0.jar", "app.jar"]

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]