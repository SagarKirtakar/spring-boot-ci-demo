FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/spring-boot-ci-demo.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080