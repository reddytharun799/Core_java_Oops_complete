FROM openjdk:17-jdk-alpine

COPY ./target/Corejava_Collections-1.0-SNAPSHOT.jar Corejavademo.jar

ENTRYPOINT ["java" ,"-jar","/Corejavademo.jar"]