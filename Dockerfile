FROM openjdk:11

VOLUME /tmp

#ARG JAR_FILE

COPY build/libs/OnlineSportsShopee-0.0.1-SNAPSHOT.war oss-1.0.0.war

ENTRYPOINT ["java","-jar","/oss-1.0.0.war"]
