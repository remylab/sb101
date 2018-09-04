# sb101
spring boot hello world app + docker

## build

docker build -t remylab/sb101:latest .

## run

docker run -p 5001:8080 -t remylab/sb101

OR

docker run -e "SPRING_PROFILES_ACTIVE=prod" -p 5001:8080 -t remylab/sb101
