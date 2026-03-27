package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFromProperty;
import com.crm.pom.HomePagePom;
import com.crm.pom.LoginPom;

public class HomePageBase {
	public static WebDriver driver;

	@BeforeClass
	public void precondition() throws IOException {
		String browser = ReadFromProperty.readProperty("browser");
		String url = ReadFromProperty.readProperty("url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}

	@BeforeMethod
	public void login() throws IOException {
		String username = ReadFromProperty.readProperty("username");
		String password = ReadFromProperty.readProperty("password");
		LoginPom log = new LoginPom(driver);
		log.username().sendKeys(username);
		log.password().sendKeys(password);
		log.loginButton().click();
	}

	@AfterMethod
	public void logout() {
		HomePagePom home = new HomePagePom(driver);
		home.profileIcon().click();
		home.logout().click();
	}

	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}
