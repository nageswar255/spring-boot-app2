FROM openjdk:8-jdk-alpine


VOLUME /tmp

EXPOSE 8081

ADD target/*.jar app2.jar

ENTRYPOINT ["java","-Dserver.port=8081", "-Djava.security.egd=file:/dev/./urandom","-jar","app2.jar"]