# Spring Boot E-Commerce API

A robust and scalable e-commerce REST API built with Spring Boot 3.4.1, featuring product management, shopping cart functionality, secure checkout with Stripe integration, and order management.

## Features

### Product Management
- Browse products with category filtering
- Full CRUD operations for products
- Category-based organization

### Shopping Cart
- Create and manage shopping carts
- Add/remove products
- Update quantities
- Calculate totals automatically

### Secure Checkout
- Stripe payment integration
- Webhook handling for payment events
- Secure payment processing

### Order Management
- Order history tracking
- Detailed order information
- Order status updates

### Security
- JWT-based authentication
- Role-based access control
- Secure endpoints

## Technology Stack

- **Java 21**
- **Spring Boot 3.4.1**
- **Spring Security** with JWT
- **Spring Data JPA**
- **MySQL** Database
- **Flyway** for database migrations
- **MapStruct** for object mapping
- **Lombok** for reducing boilerplate
- **Stripe** for payment processing
- **OpenAPI/Swagger** for API documentation

## Getting Started

### Prerequisites

- JDK 17 or later
- MySQL 8.0 or later
- Maven 3.6 or later
- Stripe account for payment processing

### Database Configuration

The application uses MySQL. Create a database and update the credentials in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/store_api
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Environment Variables

Create a `.env` file in the project root with the following variables:

```properties
STRIPE_SECRET_KEY=your_stripe_secret_key
STRIPE_WEBHOOK_SECRET=your_stripe_webhook_secret
JWT_SECRET=your_jwt_secret
```

### Building and Running

1. Clone the repository:
```bash
git clone [repository-url]
```

2. Navigate to the project directory:
```bash
cd spring-api-starter
```

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## API Documentation

Once the application is running, you can access the OpenAPI documentation at:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## API Endpoints

### Products
- `GET /products` - List all products
- `GET /products/{id}` - Get product by ID
- `POST /products` - Create new product
- `PUT /products/{id}` - Update product
- `DELETE /products/{id}` - Delete product

### Shopping Cart
- `POST /carts` - Create new cart
- `GET /carts/{cartId}` - Get cart contents
- `POST /carts/{cartId}/items` - Add item to cart
- `PUT /carts/{cartId}/items/{productId}` - Update item quantity
- `DELETE /carts/{cartId}/items/{productId}` - Remove item from cart
- `DELETE /carts/{cartId}/items` - Clear cart

### Checkout
- `POST /checkout` - Create checkout session
- `POST /checkout/webhook` - Handle payment webhook events

### Orders
- `GET /orders` - List all orders
- `GET /orders/{orderId}` - Get order details

## Database Migration

The project uses Flyway for database migrations. To run migrations manually:

```bash
mvn flyway:migrate
```

## Security

The API uses JWT for authentication. Include the JWT token in the Authorization header:

```
Authorization: Bearer your_jwt_token
```

