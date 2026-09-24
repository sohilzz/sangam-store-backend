\# Sangam Store Backend



Backend REST API for the Sangam Store web application, built using Spring Boot.



\## Overview



Sangam Store Backend provides the server-side functionality required for managing the Sangam Store application.



The backend is responsible for handling API requests, business logic, database operations, and communication between the frontend and database.



\## Features



\* RESTful API development

\* Product management

\* Database integration

\* Request validation

\* Exception handling

\* Layered architecture

\* API testing using Postman

\* Maven-based project

\* Spring Boot application



\## Tech Stack



\* Java

\* Spring Boot

\* Spring Web

\* Spring Data JPA

\* Hibernate

\* MySQL

\* Maven

\* Postman

\* Git \& GitHub



\## Project Structure



```text

src/

├── main/

│   ├── java/

│   │   └── ...

│   └── resources/

│       └── application.properties

└── test/

&#x20;   └── ...

```



\## API



The application exposes REST APIs that can be consumed by the Sangam Store frontend or tested using Postman.



Base URL:



```text

http://localhost:8080

```



\## Database



The application uses MySQL as the database.



Configure your database connection in:



```text

src/main/resources/application.properties

```



Example:



```properties

spring.datasource.url=jdbc:mysql://localhost:3306/sangam\_store

spring.datasource.username=YOUR\_USERNAME

spring.datasource.password=YOUR\_PASSWORD

```



> Do not commit real database passwords or other sensitive credentials to GitHub.



\## How to Run



\### 1. Clone the repository



```bash

git clone <repository-url>

```



\### 2. Navigate to the project



```bash

cd sangam-store-backend

```



\### 3. Configure MySQL



Create the required database and update the database credentials in `application.properties`.



\### 4. Run the application



On Windows:



```bash

mvnw.cmd spring-boot:run

```



Or using Maven:



```bash

mvn spring-boot:run

```



The application will start on:



```text

http://localhost:8080

```



\## Testing



API endpoints can be tested using Postman.



\## Development



This project is currently under development. New features and improvements will be added as the Sangam Store application evolves.



\## Future Enhancements



\* Authentication and authorization

\* Admin functionality

\* Product search and filtering

\* Order management

\* Payment integration

\* Frontend integration

\* Deployment to cloud infrastructure



\## Author



Sohail Akhtar



GitHub: https://github.com/sohilzz



