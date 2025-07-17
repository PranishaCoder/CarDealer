# 🚗 CarDealer - Spring Boot Console App

This is a **Java Spring Boot-based console application** that simulates a basic car dealership using XML-based configuration and dependency injection.

## 🛠 Technologies Used

- Java 24
- Spring Framework (Core + IOC container)
- XML-based Bean Configuration (`ApplicationContext.xml`)
- Eclipse IDE
- Maven (Project structure, not for dependency mgmt here)

## 🚘 Features

- Simple **text-based menu** for selecting cars.
- Three types of cars available:
  - Cyber Truck
  - Family Car
  - Sports Car
- Based on user input, the app fetches the appropriate **Spring bean** and displays car details.

## 🔧 How It Works

1. On startup, the application loads `ApplicationContext.xml`.
2. Based on user menu choice, it loads a specific bean:
   - `cyber` → Cyber Truck
   - `family` → Family Car
   - `sports` → Sports Car
3. Calls the `showCarDetails()` method for the selected bean.

CarDealer/
├── src/main/java
│ └── com/example/CarDealer
│ ├── Car.java
│ ├── CyberTruck.java
│ ├── FamilyCar.java
│ ├── SportsCar.java
│ └── CarDealerApplication.java
├── src/main/resources
│ └── ApplicationContext.xml
├── pom.xml
└── README.md


## ▶️ How to Run

1. Open the project in Eclipse.
2. Make sure `ApplicationContext.xml` is correctly configured with all car beans.
3. Run the `CarDealerApplication.java` file as a Java application.
4. Follow the menu in the console to select a car.

## 🙌 Author

**Pranisha Dhananjay Pol**

---

### 📌 Note

This project uses manual XML configuration instead of `@SpringBootApplication` and annotations.
 Great for learning the **core Spring fundamentals**!

