FROM openjdk:17
COPY build/libs/notebook-app-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,address=*:5005,server=y,suspend=n", "-jar", "app.war"]
