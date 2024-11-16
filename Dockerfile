FROM ubuntu:latest
LABEL authors="reddytharun"
FROM openjdk:17-jdk-alpine

ENTRYPOINT ["top", "-b"]
COPY ./target/Corejava_Collections-1.0-SNAPSHOT.jar Corejavademo.jar

ENTRYPOINT ["java" ,"-jar","/Corejavademo.jar"]