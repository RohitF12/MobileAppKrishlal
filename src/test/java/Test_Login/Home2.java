package Test_Login;

import java.util.concurrent.TimeUnit;

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

public class Home2 extends Launch{
	
	
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
		      
	     Thread.sleep(1000);
	     	     
	
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
				  
				  //Scroll down
				  
				  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
   
				  WebElement PostNow = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Post Now\"]"));
				  
				  PostNow.click();
				  
				  Thread.sleep(20000); 
			
				  
			      WebElement Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button"));
			                                                                                
			       Back.click();
			  
				   Thread.sleep(3000); 
				   
   }
				   
				   
	 @Test
	 public void sampleTest10 () throws InterruptedException {
				   
				   
				  
				 
				  //searchField
				  
				  WebElement Search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
				  
				  Search.click();
				  
				  Thread.sleep(3000); 
				  
				  //search Graphics Card
				  
				  WebElement Searchproduct = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
				  
				  Searchproduct.click();
				  
				  Searchproduct.sendKeys("Graphics Card");
				  
				  Thread.sleep(3000); 
				  
				  
				  WebElement Ten_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"10km\"]"));
				  
				  Ten_km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  WebElement TwentyFive_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"25km\"]"));
				  
				  TwentyFive_km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  WebElement Fifty_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"50km\"]"));
				  
				  Fifty_Km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  WebElement hundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"100km\"]"));
				  
				  hundred_Km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  WebElement Twohundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"200km\"]"));
				  
				  Twohundred_Km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
				  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToRight(1000)"));
				  
//				  WebElement FiveHundred_Km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"500km\"]"));
//				  
//				  FiveHundred_Km.click();
//				  
//				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//				  
//				  WebElement All = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\" All \"]"));
//				  
//				  All.click();
//				  
//				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);       
//				  
//                  WebElement MoveBack = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
//				  
//                  MoveBack.click();
//				  
//                  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);       
                  
                  
                  
}
	 
	 
	 @Test
	 public void sampleTest11 () throws InterruptedException {
				   	  
				 
		//Search Field
		 
		 boolean SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]")).isEnabled();
		  
		 boolean SearchField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]")).isDisplayed();		  
				  
	     WebElement SearchField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]"));
				  
	              System.out.println("SearchField tab is Enable " + SearchField);
	     
	              System.out.println("SearchField tab is Display " + SearchField1);
	     
	              SearchField2.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
				  
				  
}    
	        


	 
	 @Test
	 public void sampleTest12 () throws InterruptedException {
				   	  
				 
				  //filter
		 
		 boolean filter = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]")).isEnabled();
		  
		 boolean filter1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]")).isDisplayed();		  
				  
	     WebElement filter2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[4]"));
				  
	              System.out.println("Filter tab is Enable " + filter);
	     
	              System.out.println("Filter tab is Display " + filter1);
	     
				  filter2.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   
				  
				  
}    
	 
	 @Test
	 public void sampleTest13 () throws InterruptedException {
				   
	//Try to purchase a crop
				  
		   WebElement Crop = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Crop Protection\"]"));
				  
		   Crop.click();       

}
	 
	 @Test
	 public void sampleTest14 () throws InterruptedException {
				   	  
				 
		//Search Field
		 
		 boolean SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isEnabled();
		  
		 boolean SearchField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isDisplayed();		  
				  
	     WebElement SearchField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
				  
	              System.out.println("SearchField tab is Enable " + SearchField);
	     
	              System.out.println("SearchField tab is Display " + SearchField1);
	     
	              SearchField2.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
}
	 
  //click on desease
            
	 @Test
	 public void sampleTest15 () throws InterruptedException {
				   
	//click on desease
				  
		   WebElement desease = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Diseases\"]"));
				  
		   desease.click();  

	 }
	 
	 public void sampleTest16 () throws InterruptedException {
	   	  
		 
		//Search Field
		 
		 boolean SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isEnabled();
		  
		 boolean SearchField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isDisplayed();		  
				  
	     WebElement SearchField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
				  
	              System.out.println("SearchField tab is Enable " + SearchField);
	     
	              System.out.println("SearchField tab is Display " + SearchField1);
	     
	              SearchField2.click();
	              
	              SearchField2.sendKeys("Test");   
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				  
				  
				  WebElement Ten_km = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"10km\"]"));
				  
				  Ten_km.click();
				  
				  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  
	 }
	 
	 public void sampleTest17 () throws InterruptedException {
		   
			//click on product
						  
				   WebElement TestProduct = driver.findElement(By.xpath("//android.view.View[@content-desc=\"test ??\r\n"
				   		+ " ₹500.0/Kanal(5..\r\n"
				   		+ "￼1396.1km\r\n"
				   		+ "81% OFF\r\n"
				   		+ "￼3\"]/android.widget.ImageView[1]"));
						  
				   TestProduct.click();  
				   
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 
	 public void sampleTest18 () {
		   
			//click on product
		 
		         driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
						  
				   WebElement Qnty = driver.findElement(By.xpath("//android.view.View[@content-desc=\"test\"]"));
						  
				   Qnty.click();  
				   
				   Qnty.sendKeys("5");
				   
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                
				   
				   
	 }
	 
	 public void sampleTest19 () {
		   
			//click on enquire Now
		 
		 
		 boolean Qnty = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isEnabled();
		  
		 boolean Qnty1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isDisplayed();		  
		  
				   WebElement Qnty2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]"));
						  
				   System.out.println("SearchField tab is Enable " + Qnty);
				     
		              System.out.println("SearchField tab is Display " + Qnty1);
				   
				   Qnty2.click();  
				   
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				   

}
	 
	 public void sampleTest20 () {
		   
			//click on enquire Now
		 
		 
		 boolean Ok = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isEnabled();
		  
		 boolean Ok1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).isDisplayed();		  
		  
				   WebElement Ok2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Enquiry Now\"]"));
						  
				   System.out.println("Ok button is Enable " + Ok);
				     
		              System.out.println("Ok button is Display " + Ok1);
				   
		              Ok2.click();  
				   
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 }
	 
	 public void sampleTest21 () {
		   
			//click on product
		 
						  
				   WebElement Move_Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.Button[1]"));
						  
				   Move_Back.click();  
				   
				   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				   
				   WebElement Move_Back1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
					  
				   Move_Back1.click();  
				   
				   WebElement Move_Back2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
					  
				   Move_Back2.click(); 	 
}}