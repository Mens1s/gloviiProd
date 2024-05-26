# Glovii Web Service

## Introduction

This repository contains the backend codebase for a web application developed using Java. The backend is designed to support various features such as user management, match tracking, and tournament management for an Unreal Engine game.

## Features

- User management: Allows registration, authentication, and profile management for users.
- Match tracking: Records match details such as players, game type, start time, and end time.
- Tournament management: Facilitates the organization of tournaments with start and end dates, game types, and participant management.

## Technologies

- Java: Programming language used for backend development.
- Spring Boot: Framework for building Java-based web applications.
- Hibernate: ORM (Object-Relational Mapping) framework for database interaction.
- PostgreSQL: Relational database management system used to store application data.

## Installation

1. Clone the repository: `git clone <https://github.com/Mens1s/Glovii-WebService>`
2. Navigate to the project directory: `cd <project_directory>`
3. Install dependencies: `mvn install`
4. Configure the database connection in `application.properties`
5. Run the application: `mvn spring-boot:run`

## Usage

1. Register a new user: Use the provided API endpoints to register a new user.
2. Create matches: Record match details using the match tracking functionality.
3. Manage tournaments: Organize tournaments, add participants, and track tournament progress.

## Sample Postman Requests

1. Download glovii.postman_collection.json
2. Open with Postman

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/<feature_name>`
3. Make your changes
4. Commit your changes: `git commit -am 'Add new feature'`
5. Push to the branch: `git push origin feature/<feature_name>`
6. Submit a pull request

## License

This project is licensed under the [MIT License](LICENSE).
