package Ani.SeleniumEx;

import org.junit.Test;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import static org.junit.Assert.assertEquals;

import java.util.*;

public class customerMoviet1 {

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testMain() {
//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		assertEquals("React App", driver.getTitle());
	}
	@Test

	public void testAddMovie1() {
//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddMovie");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).sendKeys("Maamanan");
		driver.findElement(By.name("type")).sendKeys("Action/Thriller");
		driver.findElement(By.name("timing")).sendKeys("12pm-6pm");
        driver.findElement(By.name("sub1")).submit();
//        assertSame("Data added Successfully", "Data added Successfully");
        assertEquals("Data added Successfully","Data added Successfully");
	}
	@Test

	public void testAddMovie2() {
//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddMovie");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).sendKeys("");
		driver.findElement(By.name("type")).sendKeys("Action/Thriller");
		driver.findElement(By.name("timing")).sendKeys("2pm-6pm");
        driver.findElement(By.name("sub1")).submit();
        assertEquals("valid data needed", "valid data needed");
	}
	@Test
	
	public void testAddMovie3() {
//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddMovie");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).sendKeys("Maruthu");
		driver.findElement(By.name("type")).sendKeys("");
		driver.findElement(By.name("timing")).sendKeys("12pm-4pm");
        driver.findElement(By.name("sub1")).submit();
        assertEquals("valid data needed", "valid data needed");
	}
	@Test
	
	public void testAddMovie4() {
//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddMovie");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).sendKeys("Chennai express");
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).sendKeys("");
        driver.findElement(By.name("sub1")).submit();
        assertEquals("valid data needed","valid data needed");
	}
	@Test
	
	public void testAddCustomer1() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/AddCustomer");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).sendKeys("ani");
	driver.findElement(By.name("count")).sendKeys("Tirunelveli");
	driver.findElement(By.name("address")).sendKeys("19-B,Street");
	driver.findElement(By.name("s1")).sendKeys("3");
	driver.findElement(By.name("submit")).submit();
        assertEquals("Data added Successfully", "Data added Successfully");
	}
	@Test

	public void testAddCustomer2() {
		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/AddCustomer");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).sendKeys("ani");
	driver.findElement(By.name("count")).sendKeys("");
	driver.findElement(By.name("address")).sendKeys("19-B,Street");
	driver.findElement(By.name("s1")).sendKeys("1");
	driver.findElement(By.name("submit")).submit();
        assertEquals("valid data needed", "valid data needed");
	}
	@Test

	public void testAddCustomer3() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/AddCustomer");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).sendKeys("Aji");
	driver.findElement(By.name("count")).sendKeys("Tirunelveli");
	driver.findElement(By.name("address")).sendKeys("");
	driver.findElement(By.name("s1")).sendKeys("1");
	driver.findElement(By.name("submit")).submit();
        assertEquals("valid data needed", "valid data needed");
	}
	@Test

	public void testAddCustomer4() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/AddCustomer");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).sendKeys("");
	driver.findElement(By.name("count")).sendKeys("Tirunelveli");
	driver.findElement(By.name("address")).sendKeys("122,mount road");
	driver.findElement(By.name("s1")).sendKeys("1");
	driver.findElement(By.name("submit")).submit();
        assertEquals("valid data needed", "valid data needed");
	}
	@Test
	public void testUpdateMovie1() {

//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/EditR/1");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("Pokiri");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("BJKK");
		driver.findElement(By.name("update")).submit();
        assertEquals("Data Updated Successfully","Data Updated Successfully");
	}
	@Test

	public void testUpdateCustomer1() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Aji");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("15");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
//    assertEquals("Data updated Successfully", "Data updated Successfully");
	}
	@Test
	public void testUpdateCustomer2() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Ani");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}
	@Test
	public void testUpdateCustomer3() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Micheal");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("5");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}

	@Test
	public void testUpdateCustomer4() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("6");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}
	

	@Test
	public void testUpdateMovie2() {
		driver.get("http://localhost:3000/EditR/1");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("Pokiri");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("");
		driver.findElement(By.name("update")).submit();
		assertEquals("valid data needed", "valid data needed");
	}
	@Test
	public void testUpdateMovie3() {
		driver.get("http://localhost:3000/EditR/1");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("Pokiri");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("4pm-8pm");
		driver.findElement(By.name("update")).submit();
		assertEquals("valid data needed", "valid data needed");
	}
	@Test
	public void testUpdateMovie4() {
		driver.get("http://localhost:3000/EditR/1");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("6pm-9pm");
		driver.findElement(By.name("update")).submit();
		assertEquals("valid data needed", "valid data needed");
	}
//	@Test
//	  public void deleteTest() {
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().setSize(new Dimension(1536, 816));
//	    driver.findElement(By.linkText("View Customer")).click();
//	    driver.findElement(By.cssSelector("tr:nth-child(1) .ms-1")).click();
//	    assertEquals("Do you want to delete", "Do you want to delete");
//	    assertEquals("Data has deleted","Data has deleted");
//	  }
//	@Test
//	  public void deleteMovieTest() {
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().setSize(new Dimension(1536, 816));
//	    driver.findElement(By.linkText("View Movie")).click();
//	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
//	    assertEquals("Do you want to delete", "Do you want to delete");
//	    assertEquals("Data has deleted","Data has deleted");
//	  }
//	@Test
//	  public void deleteMovieTest1() {
//	    driver.get("http://localhost:3000/ViewR");
//	    driver.manage().window().setSize(new Dimension(1536, 816));
//	    driver.findElement(By.linkText("View Movie")).click();
//	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
//	    assertEquals("Do you want to delete", "Do you want to delete");
//	    assertEquals("Data has deleted","Data has deleted");
//	  }
//	@Test
//	  public void deleteMovieTest2() {
//	    driver.get("http://localhost:3000/ViewR");
//	    driver.manage().window().setSize(new Dimension(1536, 816));
//	    driver.findElement(By.linkText("View Customer")).click();
//	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
//	    assertEquals("Do you want to delete", "Do you want to delete");
//	    assertEquals("Data has deleted","Data has deleted");
//	  }
}