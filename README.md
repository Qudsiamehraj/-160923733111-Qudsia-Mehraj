# -160923733111-Qudsia-Mehraj

# Task Manager (Spring Boot REST API)

# About

This project is a simple Task Manager REST API built using Spring Boot.
It supports CRUD operations (Create, Read, Update, Delete) for managing tasks.
Each task has a title, description, and status (PENDING, COMPLETED, BLOCKED).

# Project Structure

TaskManager/
 ├── src/main/java/com/example/demo
 │    ├── controller/TaskController.java
 │    ├── model/Task.java
 │    ├── model/Status.java
 │    └── service/TaskService.java
 ├── src/main/resources/application.properties
 ├── pom.xml
 └── README.md

# Tech Stack

Java 17+
Spring Boot
Maven
Postman (for testing API)


# API Endpoints

1️⃣ Create Task

POST /tasks

Body (JSON):

{
  "title": "Complete Assignment",
  "description": "DBMS viva preparation",
  "status": "PENDING"
}


---

2️⃣ Get All Tasks

GET /tasks


---

3️⃣ Get Task by ID

GET /tasks/{id}


---

4️⃣ Update Task

PUT /tasks/{id}

Body (JSON):

{
  "title": "Complete Assignment",
  "description": "DBMS viva preparation updated",
  "status": "COMPLETED"
}


---

5️⃣ Delete Task

DELETE /tasks/{id}


# How to Run

1. Clone the repo
git clone https://github.com/Qudsiamehraj/TaskManager.git

2. Open in IntelliJ IDEA

3. Run the project


4. Test APIs using Postman






