# Mobile-App-Task-and-Task-Service-Object
Project Overview

This project aims to develop a mobile application for a customer, and the objective is to add, update, and delete task objects within the application. In this milestone, the focus is on delivering the task services, and the task service uses in-memory data structures to support storing tasks.

This GitHub repository contains the codebase for the task service along with the unit tests implemented to ensure that the application meets the customer's requirements.

Task Class Requirements

The task object has a unique task ID that cannot be longer than 10 characters, and it is not updatable. The task object also contains a name and description field, and both fields are mandatory. The name field cannot be longer than 20 characters, and the description field cannot be longer than 50 characters.

Task Service Requirements

The task service provides functionalities to add, delete, and update tasks based on their unique ID. The service can add tasks with a unique ID and delete tasks per task ID. The service can also update the name and description fields for a specific task ID.

Technologies Used

Java 11
JUnit 5

How to Run the Application
To run the application, you need to follow these steps:

Clone the repository to your local machine.
Navigate to the project's root directory.
Run the following command to build the project:
java
Copy code
"mvn clean package"
After the build is successful, you can run the tests using the following command:
bash
Copy code
"mvn test"
