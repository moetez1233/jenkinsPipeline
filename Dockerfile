FROM openjdk:8
EXPOSE 8080
ADD target/jenkinProject.jar jenkinProject.jar
ENTRYPOINT ["java","-jar","/jenkinProject.jar"]
