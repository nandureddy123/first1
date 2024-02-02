package first6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		List<WebElement>links=driver.findElementsByTagName("a");
		System.out.println(links.size());
		for(WebElement ele:links) {
			String words=ele.getText();
			System.out.println(words);
		}
		
		

	}

}
