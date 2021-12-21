FROM openjdk:11

VOLUME /tmp

ARG JAR_FILE=*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.war"]
