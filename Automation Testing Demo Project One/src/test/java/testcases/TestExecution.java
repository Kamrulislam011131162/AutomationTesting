package testcases;

import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;

import pages.PlaceOrder;

public class TestExecution extends PlaceOrder {
	//ChromeOptions chromeOptions = new ChromeOptions();
	//WebDriver driver = new ChromeDriver(chromeOptions);

//public static void main(String[] args) throws InterruptedException {
	
	@Test(priority = 1)
	public void TestOne() {
		TestExecution stone1 = new TestExecution();
		//System.out.println("Run Task One");
		// ttestone.baseset();
		stone1.testone();
		//super.testone();
		System.out.println("Task One completed");
	}

	@Test(priority = 2)
	public void TestTwo() {
		
		TestExecution stone = new TestExecution();
		//System.out.println("Run Task One");
		// ttestone.baseset();
		stone.testtwo();
		//super.testtwo();
		System.out.println("Task two completed");
		//driver.close();
		//driver.quit();
	}	
}


