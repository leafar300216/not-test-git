FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY services/target/services-1.0.0.jar not-test-git.jar
EXPOSE 8080
CMD ["java","-jar", "not-test-git.jar"]