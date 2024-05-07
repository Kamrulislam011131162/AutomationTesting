package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;

public class PlaceOrder extends Registration {
	public void testtwo() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// FirefoxOptions firefoxOption = new FirefoxOptions();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver = new Firefoxdriver(firefoxOption);
		// WebDriver driver = new FirefoxDriver(firefoxOption);

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("Nokia Lumia 1020 Purchage Process Start");
		driver.findElement(By.xpath("(//a[@title='Show products in category Electronics'])[1]")).click();
		driver.findElement(By.xpath("(//h2[@class='title']//a)[2]")).click();
		driver.findElement(By.xpath("(//h2[@class='product-title']//a)[3]")).click();
		WebElement ade = driver.findElement(By.xpath("(//label[text()='Qty:']/following::input)[1]"));
		ade.clear();
		ade.sendKeys("2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='ico-cart']//span[1]")).click();
		driver.findElement(By.xpath("//div[@class='terms-of-service']//input[1]")).click();
		driver.findElement(By.xpath("//button[text()=' Checkout ']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		System.out.println("Give My Address");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement firstname1 = driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
		firstname1.sendKeys("kamrul");
		WebElement lastname1 = driver.findElement(By.xpath("(//div[@class='inputs']//input)[2]"));
		lastname1.sendKeys("Islam");

		WebElement email1 = driver.findElement(By.xpath("(//div[@class='inputs']//input)[3]"));
		email1.sendKeys("Islam@gmail.com");
		driver.findElement(By.name("BillingNewAddress.CountryId")).sendKeys("Bangladesh");
		System.out.println("Half Done");

		WebElement city = driver.findElement(By.xpath("//input[@data-val-required='City is required']"));
		city.sendKeys("Dhaka");

		WebElement address1 = driver.findElement(By.xpath("(//label[text()='Address 1:']/following::input)[1]"));
		address1.sendKeys("Mirpur2, Dhaka");

		WebElement postal = driver.findElement(By.xpath("(//label[text()='Zip / postal code:']/following::input)[1]"));
		postal.sendKeys("1212");

		WebElement phone = driver.findElement(By.xpath("(//label[text()='Phone number:']/following::input)[1]"));
		phone.sendKeys("01735376958");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Now Submit");
		driver.findElement(By.xpath("(//button[@name='save'])[1]")).click();

		System.out.println("Next day air");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//div[@class='method-name']//label)[2]")).click();
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//button[1]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("(//div[@class='payment-details']//label)[2]")).click();
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//button[1]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement cardholder = driver.findElement(By.id("CardholderName"));
		cardholder.sendKeys("Kamrul Islam");
		WebElement cardnumber = driver.findElement(By.id("CardNumber"));
		cardnumber.sendKeys("4170 3380 6078 0228");

		driver.findElement(By.id("ExpireMonth")).sendKeys("10");
		driver.findElement(By.id("ExpireYear")).sendKeys("2027");

		WebElement cardcode = driver.findElement(By.id("CardCode"));
		cardcode.sendKeys("169");

		System.out.println("Card details submitted");

		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//button[1]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Final Submission");

		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//button[1]")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Match the success result");

		String abce = driver.findElement(By.xpath("(//div[@class='title']//strong)[1]")).getText();
		System.out.println(abce);
		if (abce.equals("Your order has been successfully processed!")) {
			System.out.println("Order Completed");
		}

		else {
			System.out.println("Order not Completed");
		}
		
		driver.manage().window().minimize();
		driver.close();
		//driver.quit();
		
	}
		
	}

