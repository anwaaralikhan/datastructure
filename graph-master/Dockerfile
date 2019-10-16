FROM java:8
WORKDIR /
EXPOSE 8080
ADD target/docker-volume-java-0.0.1-SNAPSHOT.jar docker-volume-java-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "docker-volume-java-0.0.1-SNAPSHOT.jar" ]