🧪 OrangeHRM Automation Framework
📌 Overview

This project is a Selenium-based test automation framework developed for automating the OrangeHRM web application. It is built using Java, TestNG, and Maven, following the Page Object Model (POM) design pattern to ensure scalability, maintainability, and reusability.

🚀 Tech Stack
Language: Java
Automation Tool: Selenium WebDriver
Test Framework: TestNG
Build Tool: Maven
Design Pattern: Page Object Model (POM)
Reporting: TestNG Reports / Extent Reports
Version Control: Git
📂 Project Structure
OrangeHRM-Automation/
│
├── src/main/java
│   ├── base/                # Driver setup & Base classes
│   ├── pages/               # Page Object classes
│   ├── utilities/           # Reusable utility methods
│
├── src/test/java
│   ├── tests/               # Test classes
│   ├── testdata/            # Test data files
│
├── src/main/resources
│   ├── config.properties    # Configuration file
│   ├── testng.xml           # Test suite file
│
├── reports/                 # Execution reports
├── screenshots/             # Failure screenshots
├── pom.xml                  # Maven dependencies
└── README.md                # Documentation
⚙️ Key Features
Automated Login & Logout functionality
Dashboard validation
PIM (Employee Management) module automation
Admin module automation
Data-driven testing support
Cross-browser testing capability
Screenshot capture on failure
🏗️ Framework Architecture
🔹 Base Layer
WebDriver initialization
Browser configuration
Setup & teardown methods
🔹 Page Layer (POM)
Separate classes for each page
WebElements defined as private variables
Public methods for user actions
🔹 Test Layer
Contains all TestNG test cases
Uses assertions for validation
🔹 Utility Layer
Common reusable methods (Waits, Excel handling, etc.)
🧪 Sample Page Object
public class LoginPage {

    private WebDriver driver;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
🧪 Sample Test Case
public class LoginTest extends BaseClass {

    @Test
    public void verifyValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");

        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}
▶️ Execution Steps
Prerequisites
Java (JDK 8 or above)
Maven installed
IDE (IntelliJ / Eclipse)
Browser (Chrome/Edge)
Run Tests
mvn clean test
⚙️ Configuration
---
Update values in config.properties:
---
browser=chrome
url=https://opensource-demo.orangehrmlive.com
username=Admin
password=admin123
📊 Reporting
TestNG reports → /test-output
Extent reports → /reports
Screenshots → /screenshots
🔁 CI/CD Integration
Can be integrated with Jenkins
Supports scheduled execution
Supports parallel execution via TestNG
✅ Best Practices Implemented
Page Object Model (POM)
Reusable utilities
Clean code structure
Proper exception handling
Data-driven approach
👤 Author

Yogesh
Automation Tester / Software Developer
