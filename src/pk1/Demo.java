package pk1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
System.setProperty("webdriver.chrome.driver", "D:\\data\\st\\chromedriver.exe");  // path of chrome driver
WebDriver w=new ChromeDriver();
w.get("https://www.demoblaze.com/");

	}

}
