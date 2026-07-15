FROM openjdk:17

WORKDIR /app
COPY HelloDevOps.java /app
RUN javac HelloDevOps.java
CMD ["java", "HelloDevOps"]
