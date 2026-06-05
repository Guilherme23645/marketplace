FROM eclipse-temurin:25-jdk

WORKDIR /app
COPY . .

RUN chmod +x gradlew && ./gradlew clean build -x test

CMD ["sh", "-c", "java -jar build/libs/*.jar"]