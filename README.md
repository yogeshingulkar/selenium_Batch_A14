🧪 OrangeHRM Automation Framework (Selenium + Java)
📌 Project Overview

This project is a test automation framework built using Selenium WebDriver, designed to automate the OrangeHRM web application. It follows industry best practices like Page Object Model (POM) and supports scalable and maintainable test automation.

🚀 Tech Stack
Language: Java
Automation Tool: Selenium WebDriver
Build Tool: Maven
Test Framework: TestNG
Design Pattern: Page Object Model (POM)
Reporting: Extent Reports / TestNG Reports
Version Control: Git
📂 Project Structure
OrangeHRM-Automation/
│── src/main/java
│   ├── base/                # Base classes (Driver setup, utilities)
│   ├── pages/               # Page Object classes
│   ├── utils/               # Reusable utilities
│
│── src/test/java
│   ├── tests/               # Test cases
│   ├── testdata/            # Test data files (Excel/JSON)
│
│── resources/
│   ├── config.properties    # Configuration file
│   ├── testng.xml           # TestNG suite file
│
│── reports/                 # Test reports
│── screenshots/             # Failure screenshots
│── pom.xml                  # Maven dependencies
│── README.md                # Project documentation
⚙️ Features Covered
✅ Login Functionality
✅ Dashboard Validation
✅ Employee Management (PIM Module)
✅ Admin Module Automation
✅ Logout Functionality
✅ Data-driven testing support
✅ Cross-browser testing (Chrome, Edge, Firefox)
🏗️ Framework Design
🔹 Base Class
WebDriver initialization
Browser handling
Common setup/teardown
🔹 Page Object Model (POM)

Each page is implemented as a separate class:

Locators → Private variables
Initialization → Constructor
Actions → Public methods

Example:

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By loginBtn = By.id("btnLogin");

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
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("Admin", "admin123");

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
}
▶️ How to Run the Project
Prerequisites
Java (JDK 8+)
Maven installed
IDE (IntelliJ / Eclipse)
Chrome/Edge browser
Steps
Clone the repository:
git clone https://github.com/your-repo/orangehrm-automation.git
Navigate to project:
cd orangehrm-automation
Install dependencies:
mvn clean install
Run tests:
mvn test
⚙️ Configuration

Update config.properties:

browser=chrome
url=https://opensource-demo.orangehrmlive.com
username=Admin
password=admin123
📊 Reporting
TestNG default reports → /test-output
Extent Reports → /reports
Screenshots captured on failure → /screenshots
🔁 CI/CD Integration (Optional)
Jenkins integration supported
Can be scheduled for nightly runs
Supports parallel execution
📈 Best Practices Used
✔ Page Object Model
✔ Reusable utility methods
✔ Data-driven testing
✔ Proper exception handling
✔ Clean and maintainable code
🤝 Contribution
Fork the repo
Create a new branch
Commit changes
Create Pull Request
📧 Contact

For queries or collaboration:

Name: Yogesh
Role: Automation Tester / Developer
