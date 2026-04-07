# Todo Application

A simple Spring Boot + Thymeleaf todo app that lets you create, complete, and delete tasks.

## Features
- Add new tasks
- Mark tasks as complete/incomplete (toggle)
- Delete tasks
- Persist tasks in MySQL using Spring Data JPA

## Tech Stack
- Java 21
- Spring Boot 4
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Bootstrap 5

## Prerequisites
- JDK 21 installed
- MySQL running locally
- Maven (or use the included Maven Wrapper)

## Configuration
The app reads DB settings from:

`src/main/resources/application.properties`

Current required settings:
- Database URL: `jdbc:mysql://localhost:3306/todo-app`
- Username: `root`
- Password from environment variable: `DB_PASSWORD`

Set password before running:

```bash
export DB_PASSWORD=your_mysql_password
```

## Run the Application
From the project root:

Unix/macOS:

```bash
./mvnw spring-boot:run
```

Windows:

```powershell
mvnw.cmd spring-boot:run
```

Then open:

`http://localhost:8080`

## Available Routes
- `GET /` - show all tasks
- `POST /` - add a task (`title` form field)
- `GET /{id}/toggle` - toggle completion status
- `GET /{id}/delete` - delete a task

## Run Tests
Unix/macOS:

```bash
./mvnw test
```

Windows:

```powershell
mvnw.cmd test
```

> Note: The project is configured for Java 21. Using an older JDK will fail compilation.
