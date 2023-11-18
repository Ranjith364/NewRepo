package GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Javascriptutility  extends BaseClass {
	/**
	 * this method is used to click on element
	 * @param element
	 * @param data
	 */
	
	public void enteringdataintoElement(WebElement element,String data) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='"+data+"'",element);
	}
	public void clickingonElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void scrollingthepage(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy("+x+","+y+")");
		
	}
}
