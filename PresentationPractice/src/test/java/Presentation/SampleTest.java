package Presentation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
	public void Sample1() {
    //	System.out.println(System.getProperty("BROWSER"));
    //	System.out.println(System.getProperty("Url"));
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=dms_bing_cpc&utm_campaign=dms_bing_Brand_Exact_Desktop&utm_adgroup=Myntra_Generic&keyword=myntra%5D&matchtype=e&utm_source=bing&msclkid=d4faad1a7f561e407f35cb7b28925c26&utm_term=myntra%5D&utm_content=Myntra_Generic");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.dmart.in/");
		
	}

}
