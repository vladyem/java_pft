package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helperbase {
  protected ChromeDriver wd;

  public Helperbase(ChromeDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }
  public boolean isElementPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
