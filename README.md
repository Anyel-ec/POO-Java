# Student Management System

This project implements a student management system using Java Persistence API (JPA) for data storage. The data model includes an abstract base class called `Person` and a derived class `Student`. Additionally, the `SINGLE_TABLE` inheritance strategy is employed through the `@Inheritance` annotation in the `Person` class.

## Person Class

The `Person` class represents an individual with attributes such as name, last name, age, ID, and date of birth.

### Attributes:

- `name`: Person's first name.
- `lastName`: Person's last name.
- `age`: Person's age.
- `ID`: Person's ID number.
- `birthDate`: Person's date of birth.

### Methods:

- Constructors: Two constructors are provided, one to initialize all attributes and another default constructor.
- Getter and setter methods to access and modify attributes.
- `toString()`: Method that returns a string representation of the class instance.

## Student Class

The `Student` class inherits from the `Person` class and adds specific attributes to represent student information, such as the major and registration number.

### Additional Attributes:

- `major`: Academic major the student is pursuing.
- `registrationNumber`: Student's registration number.

### Additional Methods:

- Constructors: Two constructors are provided, one to initialize all attributes and another default constructor.
- Getter and setter methods to access and modify student-specific attributes.
- `toString()`: Method that returns a string representation of the class instance, including inherited attributes from the `Person` class.

## JPA Configuration

JPA is used for data persistence. Make sure to correctly configure your `persistence.xml` file for database connection and schema generation.

```xml
<!-- persistence.xml Configuration -->
<repositories>
    <repository>
        <id>objetodb</id>
        <name>Repositorio de ObjectDB</name>
        <url>https://m2.objectdb.com</url>
    </repository>
</repositories>
<dependencies>
<dependency>
    <groupId>com.objectdb</groupId>
    <artifactId>objectdb</artifactId>
    <version>2.8.9</version>
</dependency>
<dependency>
    <groupId>javax.transaction</groupId>
    <artifactId>jta</artifactId>
    <version>1.1</version>
</dependency>
</dependencies>
```

## Contact

For any inquiries or additional assistance, feel free to reach out to me on WhatsApp: [OpenAPI WhatsApp Link](https://wa.me/593991675490). I'm here to help!