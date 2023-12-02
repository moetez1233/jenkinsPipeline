FROM openjdk:8
EXPOSE 8080
ADD target/gestionLogz.jar gestionLogz.jar
ENTRYPOINT ["java","-jar","/gestionLogz.jar"]
