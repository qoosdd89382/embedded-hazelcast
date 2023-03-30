FROM openjdk:8-jre-alpine
EXPOSE 8888

ADD target/embedded-hazelcast-*.jar embedded-hazelcast.jar

ENTRYPOINT ["java", "-jar", "embedded-hazelcast.jar"]