./gradlew bootJar -i --no-daemon
mv build/libs/*.jar ./app.jar
APP_NAME=wentjiang/prometheus-test
TAG="1.1"
IMAGE_NAME="${APP_NAME}:${TAG}"

docker build -f Dockerfile -t ${IMAGE_NAME} .
docker tag IMAGE_NAME ${APP_NAME}:latest