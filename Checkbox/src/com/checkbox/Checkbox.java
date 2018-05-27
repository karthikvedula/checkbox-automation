package com.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://spicejet.com/");
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).isSelected());
        
	}

}
