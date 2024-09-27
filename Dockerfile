FROM openjdk:17-alpine
#EXPOSE 8080
ARG JAR_FILE=target/User-Registration-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} userregistration.jar
ENTRYPOINT [ "java","-jar","/userregistration.jar" ]