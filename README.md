# Shuffle and Log Microservices

This project contains two microservices: `shuffle-service` and `log-service`.
The `shuffle-service` microservice provides an API to generate a shuffled array of numbers, and the `log-service` microservice logs requests.

## Prerequisites

- Java 17
- Maven
- Postman (for testing the API)

## Project Structure

- `shuffle-service`: Generates shuffled arrays and sends logging requests.
- `log-service`: Logs the requests received from `shuffle-service`.

## Getting Started

### Running the Services

1. Clone the repository
2. Build the project:
   From the root directory (where the pom.xml for the parent project is located), run:
   mvn clean install

### Running shuffle-service

1. Navigate to the shuffle-service directory:
   cd shuffle-service
2. Run the Spring Boot application:
   mvn spring-boot:run
   (The shuffle-service application will start on port 8080).

### Running log-service

1. Navigate to the log-service directory:
   cd log-service
2. Run the Spring Boot application:
   mvn spring-boot:run
   (The log-service application will start on port 8081).


### Testing the API with Postman

1. Open postman and create a new POST request with the following details:

   URL: http://localhost:8080/api/shuffle

   Headers:

   Content-Type: application/json

   Body:

2. Select raw and choose JSON from the dropdown.
   Add the following JSON payload:
   {
   "number": 5
   }
3. Send the request

   Expected Response:

   {
   "shuffledArray": [3, 1, 5, 4, 2]
   }


### Logs

1.  Check the console of the log-service application to see the logged requests. You should see an entry like this:
    Received request to shuffle number: 5









 
