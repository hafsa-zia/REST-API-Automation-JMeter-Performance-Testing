# REST API Automation & JMeter Performance Testing

A software testing project combining **automated REST API testing** with **performance and load testing** for a web application. The project uses **Java and RestAssured** to automate API validation and **Apache JMeter** to evaluate application performance under simulated load.

## Project Components

### 1. Automated REST API Testing

Developed automated API tests in **Java using RestAssured** to validate the web application's RESTful endpoints.

The test suite covers the following HTTP operations:

* **GET** — Retrieve and validate resources
* **POST** — Create new resources
* **PUT** — Update existing resources
* **DELETE** — Remove resources

The automated tests validate API behavior and responses to ensure that endpoints perform their expected operations correctly.

### 2. JMeter Performance Testing

Created a **JMeter test plan** to simulate user load and evaluate the performance of the application's API endpoints.

The performance testing component focuses on:

* Simulating concurrent requests
* Measuring endpoint response times
* Evaluating application behavior under load
* Identifying potential performance bottlenecks

## Technologies & Tools

* **Java**
* **RestAssured**
* **Apache JMeter**
* **REST APIs**
* **HTTP Methods:** GET, POST, PUT, DELETE

## Testing Approach

The project combines two complementary testing approaches:

**Functional API Automation**
Automated RestAssured tests verify that API endpoints correctly handle requests and return the expected responses.

**Performance Testing**
JMeter tests simulate load against the application's endpoints to observe response times and system behavior under increased traffic.

## Project Purpose

This project demonstrates practical experience with **API automation, REST API validation, performance testing, load testing, and automated test execution**, providing coverage beyond traditional UI-based testing.
