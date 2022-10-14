package com.TaskNegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class TaskNegativeCases extends Base_class {

	public static WebDriver driver = getbrowser("opera");

	public static Pom_Class pom = new Pom_Class(driver);
	

 //public static void main(String[] args)  throws InterruptedException {
	@Test(priority = 0)

	public void TaskNegativeCasess() throws InterruptedException {
	// Launch browser
	geturl("https://ehr1.vozo.xyz:444/");

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	// Enter User name
	sendkeys(pom.getinstance().getUsername(), "Admin3");

	// Enter Password
	sendkeys(pom.getinstance().getPassword(), "Admin@123");

	// Click Sign In Button '
	Clickonelement(pom.getinstance().getSigninbtn());

	// Click On Month Option
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
    // Click Task button
 	Clickonelement(pom.getTaskNegativeCases1().getClickTaskButton());
    
 	 // Click Edit button
  	Clickonelement(pom.getTaskNegativeCases1().getClickEditButton());
      
  	// Click Archive button
 //  	Clickonelement(pom.getTaskNegativeCases1().getClickArchive());
   	
   Thread.sleep(2000);
   	
 	// Click close button
   	Clickonelement(pom.getTaskNegativeCases1().getClickClose());
   	
   	Thread.sleep(4000);
   	
 // Click Edit Task template
   	Clickonelement(pom.getTaskNegativeCases1().getClickEditTaskTemplate());
 
    //Click Create New Templates
  	Clickonelement(pom.getTaskNegativeCases1().getClickCreateNewTemplate());
		
  	 // Enter Title
 	sendkeys(pom.getTaskNegativeCases1().getEnterTitle(), "Capminds");
    
 	//Click Assignee
  	Clickonelement(pom.getTaskNegativeCases1().getCickAssignee());
  	
    //Select Tech1 Test
  	Clickonelement(pom.getTaskNegativeCases1().getselectTech1Test());
  	
  	
  	 // EnterTemplate Name
 	sendkeys(pom.getTaskNegativeCases1().getEnterTemplateName(), "Capminds");
    
    // Enter Day
  	sendkeys(pom.getTaskNegativeCases1().getEnterDay(), "2");
  	
     // Enter Hour
   	sendkeys(pom.getTaskNegativeCases1().getEnterHour(), "2");
  	
     // Enter Minute
   	sendkeys(pom.getTaskNegativeCases1().getEnterMin(), "2");
   	
     //Click Category
  	Clickonelement(pom.getTaskNegativeCases1().getSelectcategory());

    //click priority
  	Clickonelement(pom.getTaskNegativeCases1().getClickPriority());
  	
   //Select Medium
  	Clickonelement(pom.getTaskNegativeCases1().getSelectmedium());
  	
  //click Status
  	Clickonelement(pom.getTaskNegativeCases1().getClickStatus1());
  	
   //Select Arrived
  	Clickonelement(pom.getTaskNegativeCases1().getSelectArrived());
  	
  //Enter Notes	
  	sendkeys(pom.getTaskNegativeCases1().getEnterNotes(), "WELCOME");
  	
  //click SAVE
  //Clickonelement(pom.getTaskNegativeCases1().getSelectSave());
  	
  //click CANCEL
  Clickonelement(pom.getTaskNegativeCases1().getSelectCancel());
  
  Thread.sleep(2000);
  
  Clickonelement(pom.getTaskNegativeCases1().getClickBack());
  	
  //click Filter Select TAsk
  Clickonelement(pom.getTaskNegativeCases1().getClickFilterTask());
  		
  //Select Filter Select TAsk
  Clickonelement(pom.getTaskNegativeCases1().getSelectFilterTask());
  
  //Click Reset Filter 
  Clickonelement(pom.getTaskNegativeCases1().getResetFilters());
  
   	
   	System.out.println("Successful");
   	
   	
}
}