# DemoOrangeHRM Automation Testing Project

Welcome to the OrangeHRM Automation Testing Project! This repository contains the automation scripts developed for testing the **OrangeHRM** web application using **Selenium WebDriver**, **Data-Driven Testing (DDT)**, and the **Page Object Model (POM)** design pattern.

---

## 🚀 Project Overview

This project focuses on creating an efficient and scalable automation testing framework for validating the functionality of OrangeHRM, a widely used Human Resource Management System. The framework leverages modern testing principles for better maintainability and flexibility.

---

## 🛠️ Technologies Used

- **Programming Language**: Java
- **Automation Tool**: Selenium WebDriver
- **Framework**: TestNG
- **Design Pattern**: Page Object Model (POM)
- **Testing Approach**: Data-Driven Testing (DDT)
- **Data Source**: Excel (Apache POI for handling Excel files)

---

## 🌟 Features Automated

- **Login Functionality**: Validating user authentication with multiple datasets.
- **Employee Management**: Adding, editing, and deleting employee records.
- **Leave Management**: Testing leave application and approval workflows.
- **Attendance Tracking**: Automating attendance marking and reporting.

---

## 📂 Project Structure

```
project-root
│
├── src/test/java
│   ├── tests/                # Test scripts for various features
│   ├── pages/                # POM classes representing each web page
│   ├── utils/                # Utility classes (e.g., Excel handling, config)
├── src/test/resorces
│   ├── testdata/             # Test data files (Excel, JSON, etc.)
│
├── reports/                  # Test execution reports
│
└── README.md                 # Project documentation
```

---

## ⚙️ Setup and Execution

### Prerequisites
- **Java JDK** (version 8 or above)
- **Maven**
- **IDE** (e.g., IntelliJ IDEA, Eclipse)
- WebDriver executable (e.g., ChromeDriver, GeckoDriver)

### Steps to Run the Automation
1. Clone the repository:
   ```bash
   git https://github.com/rohans2001/demoOrrangeHrm
   ```
2. Import the project into your IDE.
3. Update the `config.properties` file with the required details (e.g., URL, credentials).
4. Ensure the WebDriver executable is added to the system PATH.
5. Run the test suite using Maven:
   ```bash
   mvn test
   ```

---

## 📈 Outcomes

- **Improved Test Coverage**: Automated validation of core HRM functionalities.
- **Time Efficiency**: Significant reduction in manual testing efforts.
- **Scalability**: Easy to extend and maintain due to POM implementation.

---

## 📬 Contact
For any queries or contributions, feel free to reach out.

---

Happy Testing! 🚀
