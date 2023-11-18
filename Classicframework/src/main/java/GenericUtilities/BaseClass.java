package GenericUtilities;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ObjectRepository.Loginpage;
import ObjectRepository.Registrationpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		public static WebDriver driver;
		public Javascriptutility js;
		public Loginpage login1;
		public Registrationpage regpage;
		propertyUtility ppts=new propertyUtility();
		@BeforeClass
		public void launchingBrowser() throws IOException, InterruptedException {
			System.out.println("launching browser");
			if(ppts.readingdatafromproperty("browser").equals("chrome")) {
				//WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(ppts.readingdatafromproperty("browser").equals("firefox")) {
				//WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			else if(ppts.readingdatafromproperty("browser").equals("edge")) {
				//WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else {
				//WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(ppts.readingdatafromproperty("url"));
		}
		@BeforeMethod
		public void loadingObject() {
			js=new Javascriptutility();
			login1=new Loginpage(driver);
			regpage=new Registrationpage(driver);
		}
		@AfterClass
		public void closingBrowser() {
			driver.quit();
		}
		
}
