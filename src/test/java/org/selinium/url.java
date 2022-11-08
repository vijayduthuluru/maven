package org.selinium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	/**
	 * 
	 */
	public static void cricBuzz() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/");
		WebElement links = driver.findElement(By.xpath("//ul[@class='cb-ftr-ul']"));
		List<WebElement> nooflinks = links.findElements(By.tagName("a"));
		System.out.println(links.getText());
		System.out.println(nooflinks.size());
		System.out.println(	links.getSize());
	
		

		for (int i = 0; i < nooflinks.size(); i++) {
			String chord = Keys.chord(Keys.CONTROL, Keys.ENTER);
			nooflinks.get(i).sendKeys(chord);

		}

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();

		while (iterator.hasNext()) {
			WebDriver window = driver.switchTo().window(iterator.next());
			System.out.println(window.getTitle());

		}

	}

	public static void windowsHandles() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		

	}

	public static void main(String[] args) throws InterruptedException {
		//windowsHandles();
		 cricBuzz();

	}

}
