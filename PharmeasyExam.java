package Grotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PharmeasyExam {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement e1=driver.findElement(By.xpath("//div[@aria-label='Search']/div/div"));
		e1.click();
		Thread.sleep(3000);

		WebElement search=driver.findElement(By.xpath("//div[@aria-label='Search']/div/div/input"));
		search.sendKeys("PCM");
		Thread.sleep(3000);
		
		WebElement product=driver.findElement(By.xpath("(//div[@aria-label=\"Search\"]/div/div/div/div)[3]"));
		product.click();
		Thread.sleep(3000);

		WebElement thirdproduct=driver.findElement(By.xpath("(//div[@class='ProductCard_infoContainer__58LfU'])[3]"));
		thirdproduct.click();
		Thread.sleep(3000);

		WebElement addtocart=driver.findElement(By.xpath("//div[@class='CartButtonWrapper_cartButton__LcXLh']/button"));
		addtocart.click();
		Thread.sleep(3000);

		WebElement quantity=driver.findElement(By.xpath("(//div[@role='listbox']/div)[2]"));
		quantity.click();
		Thread.sleep(3000);

		WebElement viewcart=driver.findElement(By.xpath("//a[text()='View Cart']"));
		viewcart.click();

}
}