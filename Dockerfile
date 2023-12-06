FROM openjdk:8
EXPOSE 9090
ADD target/gestionLogz.jar gestionLogz.jar
ENTRYPOINT ["java","-jar","/gestionLogz.jar"]
