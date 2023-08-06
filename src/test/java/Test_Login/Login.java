package Test_Login;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchSessionException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserLaunch.Launch;

public class Login extends Launch {
	
	  @Test
	  public void TC_ID_01() throws InterruptedException {
		  
		  WebElement Language= driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]"));
		 
		      Language.click();
			  
			  Thread.sleep(2000);
			  
			  WebElement Enter_Mobile_Number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
			                                                    
			  Enter_Mobile_Number.click();
			  
			  Thread.sleep(5000);	 
			  
			  Enter_Mobile_Number.sendKeys("8999144992");
			  
	          WebElement Login= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
	         
	          Login.click();
	         
	          Thread.sleep(5000);
	  
	          WebElement Verify= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]"));
	        
	          Verify.click();
	        
	          Thread.sleep(5000);
	     
	  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  	  
     }	  
	  
	  public void KL_Quite() throws InterruptedException {
		  
		 driver.quit();
     
}

}  

	


