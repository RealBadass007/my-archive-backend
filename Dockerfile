FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
EXPOSE 8091
ARG JAR_FILE=build/libs/myarchive-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]