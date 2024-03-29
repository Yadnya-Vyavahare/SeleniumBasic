package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {




			public static void main(String[] args) {
				
				//it gives us a driver which communicates our selenium code to the browser
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				
				//interface            class
				WebDriver driver = new ChromeDriver();
				
				//open or navigate to a url
				driver.get("https://www.google.com");
				
				String title = driver.getTitle();
				System.out.println(title);
				
				//validate if the title printed is correct
				if(title.equals("Google")) {
					System.out.println("Title is correct");
				}
				else {
					System.out.println("Title incorrect");
				}
				
				//print the url
				System.out.println("The url is: " + driver.getCurrentUrl());
				
				//close the window
				driver.quit();
				
			}

		


	}

