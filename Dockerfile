FROM openjdk:11
COPY ./target/CalculatorSpeDevop-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "CalculatorSpeDevop-1.0-SNAPSHOT-jar-with-dependencies.jar"]