#  Inventory Management System

This is a backend REST API for managing inventory, including product stock, supplier details, and sales records. Built using Spring Boot and MySQL.

---

## 📌 Table of Contents
1. [About the Project](#about-the-project)  
2. [Features](#features)  
3. [Tech Stack](#tech-stack)  
4. [Getting Started](#getting-started)  
5. [Installation](#installation)  
6. [API Endpoints](#api-endpoints)   
7. [Contributing](#contributing)  
8. [License](#license)  
9. [Author](#author)

---

##  About the Project

This project helps in managing an inventory system with capabilities to add, update, and track products, suppliers, and stock levels.

---

##  Features

- Add/update/delete products and suppliers  
- Track product stock and low inventory  
- Sales and purchase order tracking  
- Search and filter items by name or category  
- Exception handling and validation  

---

##  Tech Stack

- *Java 17*  
- *Spring Boot*  
- *Spring Data JPA*  
- *MySQL*  
- *Maven*  
- *Postman*  
- *Git & GitHub*

---

##  Getting Started

bash
git clone https://github.com/your-username/inventory-management-system.git
cd inventory-management-system
mvn clean install
mvn spring-boot:run


---

##  Installation

Configure application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


---

##  API Endpoints

| Method | Endpoint                 | Description              |
|--------|--------------------------|--------------------------|
| GET    | /api/products            | Get all products         |
| POST   | /api/products            | Add new product          |
| PUT    | /api/products/{id}       | Update product           |
| DELETE | /api/products/{id}       | Delete product           |
| GET    | /api/suppliers           | Get all suppliers        |
| POST   | /api/sales               | Record a sale            |

---

##  Contributing

Contributions are welcome. Open an issue or pull request.

---

##  License

This project is licensed under the [MIT License](LICENSE).

---

##  Author

- 👤 Tamil Selvan  
- 🔗 [GitHub](https://github.com/your-github)  
- 🔗 [LinkedIn](https://linkedin.com/in/tamil-selvan-developer)

---
