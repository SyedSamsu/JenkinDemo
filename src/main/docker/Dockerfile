FROM openjdk:11

VOLUME /tmp

ARG JAR_FILE=*.war

COPY ${JAR_FILE} app.war

ENTRYPOINT ["java","-jar","/app.war"]
