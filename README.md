# Hotel Room Reservation System

The Hotel Room Reservation System is an open-source project developed using Spring Boot (Java) for the back end, React.js for the front end, and MySQL as the database. This system allows users to easily search for available hotel rooms, make reservations, and manage their bookings. Online payments are facilitated through an integrated payment gateway.

## Features

- **User Authentication**: Secure user authentication and authorization system.
- **Room Search**: Users can search for available hotel rooms based on their preferences such as check-in date, check-out date, number of guests, etc.
- **Reservation Management**: Users can make, view, modify, and cancel their reservations.
- **Admin Dashboard**: Admin users have access to a dashboard to manage rooms, bookings, users, and other system settings.
- **Email Notifications**: Automatic email notifications for booking confirmations, modifications, and cancellations.

## Technologies Used

- **Spring Boot**: Framework for building Java-based enterprise applications.
- **React.js**: JavaScript library for building user interfaces.
- **MySQL**: Relational database management system for storing application data.
- **Thymeleaf**: Server-side Java template engine for building HTML views.
- **Spring Security**: Authentication and access control framework.
- **Spring Data JPA**: Data access framework for Java applications.
- **Maven**: Dependency management tool for Java projects.
- **JUnit**: Testing framework for unit testing.
- **Payment Gateway**: Integrated payment gateway for processing online payments.

## Installation

1. **Clone the Repository**:

    ```
    git clone https://github.com/your-username/hotel-room-reservation-system.git
    ```

2. **Set Up MySQL Database**:

    - Create a MySQL database named `hotel_reservation_system`.
    - Configure the database connection properties in `application.properties`.

3. **Run the Application**:

    ```
    mvn spring-boot:run
    ```

4. **Access the Application**:

    Open a web browser and navigate to `http://localhost:8080`.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For questions or inquiries, please contact thiraj.pro@gmail.com.
