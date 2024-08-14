# Quarkus Kafka Example
This is an example project that demonstrates interaction between two microservices using Apache kafka. (Producer-Consumer)

## Prerequisites 
1. **IDE**: Use an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.
2. **Java Version**: jdk 21
3. **Kafka Version**: Kafka 2.13-3.8.0.tgz
4. **Apache Maven**: apache-maven-3.9.8

## Step-by-Step Guide
1. Download apache maven from -> https://maven.apache.org/download.cgi. Set the environment variable for apache maven.

   ![image](https://github.com/user-attachments/assets/f9d4c15f-d855-41be-adff-8cd2002002b6)

3. Download Kafka from -> https://kafka.apache.org/quickstart
4. Extract files in C: drive, go to project where bin and config folders are located. (C:\kafka\kafka)
5. Start Zookeeper server - Open private command prompt for the Kafka project type in the following command - bin\windows\zookeeper-server-start.bat config\zookeeper.properties and press ENTER.
6. Start Kafka server - Open another private command prompt and type in the following command - bin\windows\kafka-server-start.bat config\server.properties and press ENTER.
7. To create a Kafka topic, open another private command prompt and type in the following command - bin\windows\kafka-topics.bat --create --topic level --bootstrap-server localhost:9092 and press ENTER. 
8. Run both the microservices "code-with-micro-one" and "code-with-micro-two" simultaneoulsy by typing "mvn quarkus:dev" on terminal.
9. Open POSTMAN and using POST method for URL -> http://localhost:8080/send and request body -> {"Nisha"} test the Services.
