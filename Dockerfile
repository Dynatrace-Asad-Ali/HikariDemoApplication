FROM openjdk:11.0.13-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/hikari-demo-project-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/hikari-demo-project-0.0.1-SNAPSHOT.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
