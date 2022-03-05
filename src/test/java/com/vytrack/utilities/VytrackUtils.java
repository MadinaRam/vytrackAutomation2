package com.vytrack.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {

    public static void login(String username, String password){
        /*
WebElement inputUsername = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
         */

        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        //Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("#prependedInput")).sendKeys(username);
        // pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);
        // click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsDriver(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        //Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("#prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
        // pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));
        // click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsStoreManager(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        //Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("#prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        // pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        // click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

    public static void loginAsSalesManager(){
        // go to website
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // pass username
        //Driver.getDriver().findElement(By.cssSelector("#prependedInput"));
        Driver.getDriver().findElement(By.id("#prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        // pass password
        Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        // click login button
        Driver.getDriver().findElement(By.tagName("button")).click();
    }

}
