FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY reduce-beta-1.0.jar /app/assignment/reduce-beta-1.0.jar
COPY ./h2/reduce.h2.db /app/assignment/h2/reduce.h2.db
COPY ./h2/reduce.trace.db /app/assignment/h2/reduce.trace.db
WORKDIR /app/assignment/
CMD ["java", "-jar", "reduce-beta-1.0.jar"]
