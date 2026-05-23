package com.uiplayground;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationFormAutomation1 {

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("http://uiplayground.techwithjatin.com/");
		wd.manage().window().maximize();
		//Found the locator----->found the element----->entering the text
		By firstNameTextBoxLocator=By.xpath("//input[@data-testid='input-first-name']");
		WebElement firstNameTextBox=wd.findElement(firstNameTextBoxLocator);
		firstNameTextBox.sendKeys("Uday");
		//Found the locator----->found the element----->entering the text
				By lastNameTextBoxLocator=By.xpath("//input[@data-testid='input-last-name']");
				WebElement lastNameTextBox=wd.findElement(lastNameTextBoxLocator);
				lastNameTextBox.sendKeys("Shetty");	
				//Found the locator----->found the element----->entering the text
				By emailTextBoxLocator=By.xpath("//input[@data-testid='input-email-reg']");
				WebElement emailTextBox=wd.findElement(emailTextBoxLocator);
				emailTextBox.sendKeys("uday@gmail.com");	
				//Found the locator----->found the element----->entering the text
				By passwordTextBoxLocator=By.xpath("//input[@data-testid='input-password']");
				WebElement passwordTextBox=wd.findElement(passwordTextBoxLocator);
				passwordTextBox.sendKeys("form@123");
				//Found the locator----->found the element----->entering the text
				By phoneNumberTextBoxLocator=By.xpath("//input[@data-testid='input-phone']");
				WebElement phoneNumberTextBox=wd.findElement(phoneNumberTextBoxLocator);
				phoneNumberTextBox.sendKeys("987654321");
				//Found the locator----->found the element----->entering the text
				By genderRadioButtonLocator=By.xpath("//input[@value='Male']");
				WebElement genderRadioButton=wd.findElement(genderRadioButtonLocator);
				genderRadioButton.click();
				//Found the locator----->found the element----->entering the text
				By dateofBirthTextBoxLocator=By.xpath("//input[@type=\"date\"]");
				WebElement dateofBirthTextBox=wd.findElement(dateofBirthTextBoxLocator);
				dateofBirthTextBox.sendKeys("12");
				dateofBirthTextBox.sendKeys("12");
				dateofBirthTextBox.sendKeys("1990");
				//Automating the select dropdown---locator--webelemen--passing select class constructor---value option goes to backend
				//visible text displayed to ui
				By countrySelectDropdownLocator=By.xpath("//select[@data-testid=\"input-country\"]");
				WebElement countrySelectDropdown=wd.findElement(countrySelectDropdownLocator);
				Select select=new Select(countrySelectDropdown);
				select.selectByVisibleText("UAE");
				select.selectByIndex(10);
				select.selectByValue("Australia");
				
				//Found the locator----->found the element----->entering the text
				By registerButtonLocator=By.tagName("button");
				WebElement registerButton=wd.findElement(registerButtonLocator);
				registerButton.click();
				//Registration success
				By registerSuccessLocator=By.xpath("//div[@data-testid='registration-success']/div[2]");
				WebElement registerSuccess=wd.findElement(registerSuccessLocator);
				registerSuccess.getText();
				System.out.println(	registerSuccess.getText());
				
				//strong[@data-testid='success-name']
				
				By successNameLocator=By.xpath("//strong[@data-testid='success-name']");
				WebElement successName=wd.findElement(successNameLocator);
				successName.getText();
				System.out.println(	successName.getText());
				

	}

}
	