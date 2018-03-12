package com.browserstack;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
      AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("DomainTextBox")));
      searchElement.click();
      searchElement.sendKeys("percipio");
      AndroidElement nextBtn = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Domain_Click")));
          nextBtn.click();

    AndroidElement useCredentials = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("USE PERCIPIO CREDENTIALS")));
          useCredentials.click();

    AndroidElement userName = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Login_Text")));
      userName.click();
      userName.sendKeys("admin@artisan.com");

      AndroidElement pwdField = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Password_Text")));
      pwdField.click();
      pwdField.sendKeys("test1234");


    AndroidElement loginBtn = (AndroidElement) new WebDriverWait(driver, 10).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Login_Button")));
      loginBtn.click();


     // AndroidElement domainText = (AndroidElement) new WebDriverWait(driver, 30);
     // domainText.sendKeys("percipio");
    //   AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
    //       ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
    //   insertTextElement.sendKeys("Browser");
      Thread.sleep(5000);

      List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
      Assert.assertTrue(allProductsName.size() > 0);
    }
}
