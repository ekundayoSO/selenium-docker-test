FROM bellsoft/liberica-openjdk-alpine

# Install curl jq
# RUN apk add curl jq

# workspace
WORKDIR /home/selenium-docker

# Add the required files
ADD target/docker-resources     ./


# ENTRYPOINT sh runner.sh
ENTRYPOINT java -cp "libs/*"  org.testng.TestNG  test-suites/testng.xml
# ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* org.testng.TestNG testng.xml

# ENTRYPOINT java -cp selenium-docker.jar; selenium-docker-tests.jar; libs/* org.testng.TestNG testng.xml
