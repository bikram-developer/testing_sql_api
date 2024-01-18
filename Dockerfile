FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar hello.jar
ENTRYPOINT ["java","-jar","/hello.jar"]
EXPOSE 8080