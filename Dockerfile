FROM openjdk:8
EXPOSE 8080 8000
ADD target/spring-remote-debug.jar spring-remote-debug.jar
ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh","/entrypoint.sh"]