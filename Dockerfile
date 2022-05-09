FROM openjdk:latest
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY src/main/resources/player.csv /tmp/player.csv
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]
