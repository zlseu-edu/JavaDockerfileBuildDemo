FROM demo-registry.cn-beijing.cr.aliyuncs.com/demo/maven-base:3.8-openjdk-8 AS builder

# add pom.xml and source code
ADD ./pom.xml pom.xml
ADD ./service service/

# package jar
RUN mvn clean package

# Second stage: minimal runtime environment
From openjdk:8-jre-alpine

# copy jar from the first stage
COPY --from=builder target/service-1.0-SNAPSHOT.jar service-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "service-1.0-SNAPSHOT.jar"]
