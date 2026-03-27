package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
@FindBy(name = "username")
private WebElement username;
@FindBy(name = "password")
private WebElement password;
@FindBy(css="button[type='submit']")
private WebElement login_button;
public LoginPom(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement username() {
	return username;
} 
public WebElement password() {
	return password;
} 
public WebElement loginButton() {
	return login_button;
} 


}
