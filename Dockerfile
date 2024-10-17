FROM openjdk:17-jdk-slim
MAINTAINER gowri sankar aligi
COPY target/cards-app-0.0.1-SNAPSHOT.jar cards-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","cards-app-0.0.1-SNAPSHOT.jar" ]