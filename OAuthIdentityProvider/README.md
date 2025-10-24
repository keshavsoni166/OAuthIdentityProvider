# Mini OAuth2 Identity Provider

A lightweight OAuth2 Authorization Server built with **Spring Boot 3** and **Spring Security 6**.  
This project provides a basic implementation of an OAuth2 Identity Provider issuing authorization codes and JWT tokens for authentication and authorization.

---

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Running](#setup-and-running)
- [Usage](#usage)
- [Testing](#testing)
- [Author](#author)
- [License](#license)

---

## Project Overview

The Mini OAuth2 Identity Provider is designed to demonstrate core concepts of OAuth2 and OpenID Connect:

- Secure user login with Spring Security
- Authorization Server capabilities with OAuth2 protocol
- In-memory users and clients for testing
- JWT tokens issuance for downstream services

This project forms a foundation for building secure authentication and authorization layers in modern web applications.

---

## Features

- OAuth 2.0 Authorization Code grant flow
- JWT Token generation & validation
- Custom login page with Spring Security
- In-memory user and client store for simplicity
- Easy integration with OAuth2 client applications

---

## Technologies Used

- Java 21  
- Spring Boot 3.x  
- Spring Security 6.x  
- Spring Security OAuth2 Authorization Server  
- Maven  
- Thymeleaf for login UI  

---

## Setup and Running

### Prerequisites

- Java 21+
- Maven
- IDE (VS Code, IntelliJ, etc.)

### Steps

1. Clone the repository:  
git clone https://github.com/keshavsoni166/OAuthIdentityProvider.git

text
2. Navigate into the project:  
cd OAuthIdentityProvider

text
3. Build and run the app:  
mvn clean install
mvn spring-boot:run

text
4. Open [http://localhost:9000](http://localhost:9000) to access the login page.

### Default Credentials

- Username: `user`  
- Password: `password`

- Username: `admin`  
- Password: `adminpwd`

---

## Usage

Use this server as an OAuth2 Authorization Server in your OAuth2/OpenID Connect flows. Clients can request authorization codes and exchange them for JWT tokens. Extend or customize with your user stores, clients, and token configurations.

---

## Testing

- Access the login page at `http://localhost:9000/login`.
- Use the credentials above to log in.
- Use an OAuth2 client configured with client ID `client` and secret `secret` to perform auth code flow.
- Verify JWT tokens returned from `http://localhost:9000/oauth2/token`.

---

## Author

**Keshav Soni**  
Backend Developer | Java | Spring Boot | Security  
[LinkedIn](https://linkedin.com/in/keshavsoni166) | [GitHub](https://github.com/keshavsoni166)

---

## License

This project is licensed under the MIT License.