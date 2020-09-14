package pk5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DigvijayLoginTest {
  @Test(dataProvider="dp")
  public void login(String us,String pw) {
	  System.setProperty("webdriver.chrome.driver", "D:\\data\\st\\chromedriver.exe");  // path of chrome driver
	  WebDriver w=new ChromeDriver();
	w.manage().window().maximize();
	w.get("file:///D:/data/st/prax%2010%20ide/data.html"); //open page
	Reporter.log("step1) opened page ");
	w.manage().window().maximize(); // maximize the window
	w.findElement(By.id("username")).sendKeys(us); // enters values in id username
	Reporter.log("step2) entered username");
	w.findElement(By.id("password")).sendKeys(pw); // enters values in id password
	Reporter.log("step3) entered password");
	w.findElement(By.id("submit")).click();  // clicks submit button
	Reporter.log("step4) clicked submit");
	
	w.findElement(By.linkText("Logout")).click();
	Reporter.log("clicked logout link"); 
  }
  
  @DataProvider   // this method supplies data to test function
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tester1","tester1"}, // test data
      new Object[] { "tester2","tester2"}, // test data
      new Object[] { "tester3","tester3"}, // test data
      
      
    };
  }
}

