package crosskt;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prgram1 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("nishi");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nishi.com");
		
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("7679787654");
		
		WebElement adress = driver.findElement(By.id("textarea"));
		adress.sendKeys("bangalore");
		
		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		
		WebElement day = driver.findElement(By.id("tuesday"));
		day.click();
		
		WebElement country = driver.findElement(By.id("country"));
		Select s1=new Select(country);
		s1.selectByValue("germany");
		
		WebElement color = driver.findElement(By.id("colors"));
		Select s2=new Select(color);
		s2.selectByValue("yellow");	
		
		WebElement animal = driver.findElement(By.id("animals"));
		Select s3=new Select(animal);
		s3.selectByValue("deer");	
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		
		WebElement d = driver.findElement(By.xpath("//a[text()='7']"));
		d.click();
		
		WebElement date2 = driver.findElement(By.id("txtDate"));
		date2.click();
		
		WebElement d2 = driver.findElement(By.xpath("//a[text()='15']"));
		d2.click();
		
		WebElement date3 = driver.findElement(By.id("start-date"));
		date3.sendKeys("1-01-2021");
		
		WebElement date4 = driver.findElement(By.id("end-date"));
        date4.sendKeys("5-05-2022");
        
        WebElement link = driver.findElement(By.xpath("//h4[text()='Broken Links']"));
        link.click();
        List<WebElement> links=driver.findElements(By.xpath("//div[@id='broken-links']/a"));
        int count=links.size();
        System.out.println("No. links-->"+count);

        for(int i=0;i<count;i++)
        {
        String url=links.get(i).getAttribute("href");
        System.out.println(url);
        verifyUrl(url);
        }

}

        public static void verifyUrl(String url) throws IOException {
        try
        {
        URL u1=new URL(url);
        HttpURLConnection c1=(HttpURLConnection) u1.openConnection();

        if(c1.getResponseCode()==200)
        {
        System.out.println("Url is valid");
        }
        else
        {
        System.out.println(c1.getResponseCode()+"-->"+c1.getResponseMessage());
        }
        }

        catch(MalformedURLException e)
        {
        System.out.println("Invalid url");
        }
        }
}
