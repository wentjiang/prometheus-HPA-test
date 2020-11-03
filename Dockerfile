FROM adoptopenjdk/openjdk11:ubi

WORKDIR /app
COPY *.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]