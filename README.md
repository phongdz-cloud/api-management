# Spring Boot Multi-Module Application

This is a multi-module Spring Boot application with a modular architecture designed for scalability and maintainability.

## Project Structure

```
spring-multi-module-app/
├── common/                 # Common utilities and shared components
│   ├── src/
│   │   ├── main/java/com/example/common/
│   │   │   ├── constants/     # Common constants
│   │   │   ├── dto/          # Common DTOs
│   │   │   ├── exception/    # Common exception handling
│   │   │   └── util/         # Utility classes
│   │   └── resources/
├── core/                   # Core business logic
│   ├── src/
│   │   ├── main/java/com/example/core/
│   │   │   ├── controller/   # REST controllers
│   │   │   ├── service/      # Business logic
│   │   │   ├── repository/   # Data access
│   │   │   ├── entity/       # Domain models
│   │   │   └── dto/          # Data transfer objects
│   │   └── resources/
├── admin/                  # Admin module
│   ├── src/
│   │   ├── main/java/com/example/admin/
│   │   │   ├── controller/   # Admin controllers
│   │   │   ├── service/      # Admin services
│   │   │   └── dto/          # Admin DTOs
│   │   └── resources/
├── user/                   # User module
│   ├── src/
│   │   ├── main/java/com/example/user/
│   │   │   ├── controller/   # User controllers
│   │   │   ├── service/      # User services
│   │   │   └── dto/          # User DTOs
│   │   └── resources/
├── security/              # Security module
│   ├── src/
│   │   ├── main/java/com/example/security/
│   │   │   ├── config/       # Security configurations
│   │   │   ├── controller/   # Auth controllers
│   │   │   ├── service/      # Security services
│   │   │   ├── filter/       # Security filters
│   │   │   └── dto/          # Security DTOs
│   │   └── resources/
└── pom.xml                # Root project configuration
```

## Modules Description

### Common Module

- Contains shared utilities, constants, and common components
- Provides base exception handling and response structures
- Includes utility classes for string and date operations

### Core Module

- Contains core business logic and domain models
- Implements data access layer and business services
- Provides REST endpoints for core functionality

### Admin Module

- Handles administrative operations
- Implements admin-specific business logic
- Provides admin-only REST endpoints

### User Module

- Manages user-related operations
- Implements user-specific business logic
- Provides user-facing REST endpoints

### Security Module

- Handles authentication and authorization
- Implements JWT-based security
- Provides login and token refresh endpoints

## Prerequisites

- Java 17 or higher
- Maven 3.8 or higher
- PostgreSQL 12 or higher

## Setup Instructions

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd spring-multi-module-app
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Configure the database:

   - Create a PostgreSQL database
   - Update the database configuration in the respective `application.properties` files

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Documentation

The API documentation is available at:

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Security

The application uses JWT-based authentication with the following features:

- Token-based authentication
- Role-based access control
- Refresh token mechanism
- CORS configuration
- Security headers

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request
