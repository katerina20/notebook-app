FROM openjdk:17
COPY build/libs/notebook-app-0.0.1-SNAPSHOT.war app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]
