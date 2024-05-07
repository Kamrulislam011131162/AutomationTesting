package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
	public static WebDriver driver;
	public void testone() {

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to the demoqa website
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		System.out.println("Registration Process Start");
		driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
		WebElement firstname = driver.findElement(By.id("FirstName"));
		WebElement lastname = driver.findElement(By.id("LastName"));
		firstname.sendKeys("Kamrul");
		lastname.sendKeys("Islam");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("DateOfBirthDay")).sendKeys("25");
		driver.findElement(By.name("DateOfBirthMonth")).sendKeys("October");
		driver.findElement(By.name("DateOfBirthYear")).sendKeys("1993");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement email = driver.findElement(By.id("Email"));
		
	   // Scanner Obj = new Scanner(System.in);
	  //  String email1;
	   // System.out.println("Enter dynamic email"); 
	  //  email1 = Obj.nextLine();   
		email.sendKeys("kamrulislam@gmail1.com");
		WebElement company = driver.findElement(By.id("Company"));
		company.sendKeys("Mysoft Heaven LTD.");
		
		driver.findElement(By.xpath("//label[text()='Newsletter:']")).click();
		
		WebElement password = driver.findElement(By.id("Password"));
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		password.sendKeys("12345678");
		confirmPassword.sendKeys("12345678");

		System.out.println("Submit The Application");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String abc=driver.findElement(By.className("result")).getText();
		System.out.println(abc);
		if(abc.equals("Your registration completed")) {
			System.out.println("Registration Completed");
		}
		
		else {
					System.out.println("Registration not Completed");
		}
		driver.manage().window().minimize();
		driver.close();
		//driver.quit();
	}

	}

