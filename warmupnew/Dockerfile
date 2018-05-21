FROM openjdk:8u121-jre-alpine
ADD ./target/warmupnew-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 9098
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /api.jar"]