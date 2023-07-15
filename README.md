E-Shop Microservices
This repository contains the code for an e-commerce platform implemented using a microservices architecture. The application consists of various microservices built using different technologies.

Technologies Used
Frontend: Angular
Backend: Spring Boot, Node.js
Databases: SQL (e.g., MySQL, PostgreSQL), H2, MongoDB
Microservices
The e-shop application is divided into several microservices, each responsible for specific functionalities. The following microservices are included:

Inventory Microservice: Manages inventory-related operations, such as stock management, availability, and pricing.

Catalog Microservice: Handles catalog-related operations, including the management of product categories, attributes, and specifications.

Product Microservice: Manages product-related operations, such as adding, updating, and retrieving product information.

Authentication Microservice: Provides user authentication and authorization functionalities, ensuring secure access to the e-shop platform.

Order Microservice: Handles order management, including creating, updating, and retrieving orders.

Cart Microservice: Manages the shopping cart functionalities, such as adding, updating, and removing items from the cart.

Additional Components
Apart from the microservices, the e-shop application also includes the following additional components:

Eureka Discovery Server: Serves as a server for service discovery, allowing microservices to register and discover each other dynamically.

API Gateway: Acts as an entry point for all client requests and routes them to the respective microservices.

Config Server: Provides centralized configuration management for the microservices, allowing dynamic configuration updates without restarting the services.

Getting Started
To run the e-shop application locally, follow these steps:

Ensure that you have the necessary software installed, including Angular, Spring Boot, Node.js, and the required databases (SQL and MongoDB).

Clone this repository to your local machine.

Configure the necessary database connections in the respective microservices.

Start the Eureka Discovery Server, API Gateway, and Config Server.

Start each microservice individually, ensuring that they register with the Eureka server.

Launch the frontend application by running the Angular development server.

Access the e-shop application through the provided URL or port.

Conclusion
The e-shop microservices architecture provides a scalable and modular solution for building an online shopping platform. Each microservice focuses on a specific domain, enabling independent development, deployment, and scaling. The combination of Angular, Spring Boot, Node.js, and various databases ensures a robust and flexible e-commerce solution.
