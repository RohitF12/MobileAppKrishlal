package Test_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BrowserLaunch.Launch;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Home extends Launch{
	
	
	@Test
	  public void loginId() throws InterruptedException {
		
		
		Login KL = new Login();
		
		KL.TC_ID_01();

		
	}
	
	
	@Test
	  public void sampleTest5() throws InterruptedException {
		  
		 
		  
		  boolean ProfileName= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Test Krishlal\"]")).isDisplayed();
		  		  
		  System.out.println("Profie Name =" + ProfileName );
		  
		  Thread.sleep(1000);
		  
		 
			  
   }
   @Test
	  public void sampleTest6() throws InterruptedException {
		  
		  WebElement Notification= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]"));
		 
		  Notification.click();
		  
		  driver.navigate().back();
		      
		      Thread.sleep(1000);
		  
		  

}
   @Test
	  public void sampleTest7() throws InterruptedException {
		  
		  WebElement ProfileName= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[1]"));
		 
		  ProfileName.click();
		  
		 driver.navigate().back();
		      
		      Thread.sleep(1000);
		 
		  
		  
}
   // check that adress changes should be work
   @Test
	  public void sampleTest8 () throws InterruptedException {
		  
		 WebElement Adress= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Mumbai, Maharashtra, India\"]"));
		 
		 Adress.click();
		   
		// Thread.sleep(10000);
		
		// WebElement SelectAdress= driver.findElement(By.xpath(""));
		
		driver.navigate().back();
		 
		// SelectAdress.click();
		      
	     Thread.sleep(5000);
	     	     
	
}
   @Test
	  public void sampleTest9 () throws InterruptedException {
		  
		  WebElement button= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		 
		  button.click();
		   
		 Thread.sleep(3000);
		  	
		 	 
		 WebElement AA1= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sell your Product\"]"));
		
		AA1.click();
		
		Thread.sleep(3000);
		
	    WebElement Add= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
		
	    Add.click();
		
		Thread.sleep(3000);
		
	    
		
	   WebElement Primary= driver.findElement(By.xpath("//android.view.View[@content-desc=\"primary\"]"));
		
	   Primary.click();
		
	   Thread.sleep(3000);
	   
	 
		
	   WebElement pinadd= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[3]"));
		
	   pinadd.click(); 
	   
	   Thread.sleep(3000);
	   
	   
	   
	   WebElement SelectImage= driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"IMG_20230802_110242.jpg, 358 kB, 2 Aug\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		
	   SelectImage.click();
	   
	   Thread.sleep(5000);
	   
	  
	   
	   WebElement SelectImagebytick= driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Crop\"]"));
		
	   SelectImagebytick.click(); 
	   
			  
			  Thread.sleep(5000);
			  
			  WebElement ProductName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
			                                                    
			  ProductName.click();
			  
			  Thread.sleep(2000);
			  
			  ProductName.sendKeys("Graphics Card");
			  
			  Thread.sleep(2000);
			  
			  WebElement category = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Category *\"]"));
			           
			  category.click();
			  
			  Thread.sleep(3000);
			  
			  WebElement Alternaria_Blight=  driver.findElement(By.xpath("//android.view.View[@content-desc=\"Alternaria Blight\"]"));
		
			  Alternaria_Blight.click();
			  
		      //driver.navigate().back();
		      
	           Thread.sleep(3000);
	
	         WebElement Enter_Price=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
	  		
	          Enter_Price.click();
	           
	          Enter_Price.sendKeys("500");
	        
	          Thread.sleep(3000);
	      
	         WebElement Market_Price=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
	  		
	         Market_Price.click();
	           
	        Market_Price.sendKeys("500");
	        
	        Thread.sleep(3000);
	        
	        
			 
			  

	        
				  WebElement coverage_Area=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]"));
		           
				  coverage_Area.click();
				  
				  coverage_Area.sendKeys("90");
				  
				  Thread.sleep(3000);
	        
				  
	        
				  WebElement Description = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]"));
		           
				  Description.click();
				  
				  Description.sendKeys("Graphics Poster");
				  
				 Thread.sleep(3000);
				 
				 WebElement SelectUnit = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select Unit *\"]"));
		           
				  SelectUnit.click();
				  
				  Thread.sleep(3000);
				 
				  WebElement Biswa=  driver.findElement(By.xpath("//android.view.View[@content-desc=\"Biswa\"]"));
					
				  Biswa.click();
				  
			      //driver.navigate().back();
			      
		           Thread.sleep(3000);
		
				  
				  WebElement minQnty = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[6]"));
		           
				  minQnty.click();
				  
				  minQnty.sendKeys("2");
				  
				  Thread.sleep(3000);
				  
				  WebElement maxQnty = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[7]"));
		           
				  maxQnty.click();
				  
				  maxQnty.sendKeys("3");
				  
				  Thread.sleep(3000);
				  
				  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
   
				  WebElement PostNow = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Post Now\"]"));
				  
				  PostNow.click();
				  
				  Thread.sleep(10000); 
			
				  
			      WebElement Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button"));
			                                                                                
			       Back.click();
			  
				   Thread.sleep(3000); 
				  
				 
				  //searchField
				  
				  WebElement Search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
				  
				  Search.click();
				  
				  Thread.sleep(3000); 
				  
				  //search Graphics Card
				  
				  WebElement Searchproduct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
				  
				  Searchproduct.click();
				  
				  Searchproduct.sendKeys("Graphics Card");
				  
				  Thread.sleep(3000); 
				  
				  
                
}
   







}    
	        


