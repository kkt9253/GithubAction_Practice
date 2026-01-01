FROM eclipse-temurin:17-jre

# 컨테이너 내부 작업 디렉터리
WORKDIR /app

# 빌드 산출물 jar를 app.jar로 복사 (GitHub Actions에서 build/libs/*.jar를 넘겨줄 예정)
ARG JAR_FILE=app.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

# JVM 옵션은 필요에 맞게 조정
ENTRYPOINT ["java","-jar","/app/app.jar"]