package com.uiplayground;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicElements {

	public static void main(String[] args) throws InterruptedException {
     WebDriver wd=new ChromeDriver();
     wd.get("http://uiplayground.techwithjatin.com/");
     wd.manage().window().maximize();
     
     //found a locator---webelement-----action
     //By class has static methods
     By dynamicElementMenuLinkLocator=By.xpath("//span[contains(text(),\"Dynamic Elements\")]/..");
     WebElement dynamicElementMenuLink=wd.findElement(dynamicElementMenuLinkLocator);
     dynamicElementMenuLink.click();
     
     
     By addMenuItemLocator=By.xpath("//button[@data-testid=\"btn-add-item\"]");
     WebElement addMenuItem=wd.findElement(addMenuItemLocator);
     addMenuItem.click();
     Thread.sleep(3000);
     //delay---Thread.sleep--
     addMenuItem.click();
     Thread.sleep(3000);
     addMenuItem.click();
     Thread.sleep(3000);
     //Found the locator---web element---sub elements--applied----get text----print visible text
    // By addMenuListLocator=By.xpath("//div[@class=\"swiggy-card\"]");
     //WebElement addMenuList=wd.findElement(addMenuListLocator);
     //System.out.println(addMenuList.getText());
   //Found the locator---web element---sub element in list-applied for loop-traverse the loop--get text----print visible text
     By swiggyCardLocator=By.xpath("//div[@class=\"swiggy-card\"]");
     List<WebElement> foodItemsList=wd.findElements(swiggyCardLocator);
     for (WebElement foodItem:foodItemsList)
     {
    	 //System.out.println(foodItem.getText());
    	 By foodItemNameLocator=By.xpath(".//div[@class=\"swiggy-name\"]");//----put a dot in front of xpath
    	 WebElement foodItemName=foodItem.findElement(foodItemNameLocator);
    	 System.out.println(foodItemName.getText());	 
    	 By foodItemPriceLocator=By.xpath(".//span[@class=\"swiggy-price\"]");//----put a dot in front of xpath
    	 WebElement foodItemPrice=foodItem.findElement(foodItemPriceLocator);
    	 System.out.println(foodItemPrice.getText());	 
     }
     By liveCounterLocator=By.className("counter-badge");
     WebElement liveCounter=wd.findElement(liveCounterLocator);
     System.out.println(liveCounter.getText());
     System.out.println(liveCounter);
     
     By hideMenuLocator=By.xpath("//button[@data-testid='btn-toggle-visibility']");
     WebElement hideMenu=wd.findElement(hideMenuLocator);
     hideMenu.click();
   //span[@data-testid="visibility-state"]
     By visibilityLocator=By.xpath("//span[@data-testid=\"visibility-state\"]");
     WebElement visibility=wd.findElement(visibilityLocator);
     System.out.println("State"+ visibility.getText());
     
	}

}
