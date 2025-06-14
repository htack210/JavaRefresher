# My Java Project

This is a simple Java project that demonstrates the structure of a Maven-based application.

## Project Structure

```
my-java-project
├── src
│   └── main
│       └── java
│           └── App.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Maven installed on your machine.

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="App"
```

## License

This project is licensed under the MIT License.