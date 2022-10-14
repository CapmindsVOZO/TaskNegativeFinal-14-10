package com.TaskNegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.github.dockerjava.api.model.Task;
import com.page.BillingNergativeCases1;

import com.page.Patient69;
import com.page.PatientModuleNegativeCases1;
import com.page.Settings;
import com.page.SettingsNegativeCases1;
import com.page.SignIn;
import com.page.TaskNegativeCases1;

public class Pom_Class {


	public  static RemoteWebDriver driver;

	private SignIn sp;

	
	private Settings st;
    
	
	private PatientModuleNegativeCases1 PANE;
	
	private BillingNergativeCases1 BLNC;
	
	private SettingsNegativeCases1 STNC;
	
	private TaskNegativeCases1 TKNC;
	
//	private PaymentNegativeCases PANC;
	
//	private ScheduleNegativeCases SCNC;
	
	private Patient69 pa;
	public Pom_Class(WebDriver driver2) {
		
		this.driver = (RemoteWebDriver) driver2;

	}
	
	

	public SignIn getinstance() {

		if (sp == null) {

			sp = new SignIn(driver);
   
		}
		return sp;
	}

	
	
	
	
	public PatientModuleNegativeCases1 getPatientModuleNegativeCases1() {

		if (PANE== null) {

			PANE = new PatientModuleNegativeCases1(driver);

		}
		return PANE;
	}
	
	public BillingNergativeCases1 getBillingNergativeCases() {

		if (BLNC== null) {

			BLNC = new BillingNergativeCases1(driver);

		}
		return BLNC;
	}
	public SettingsNegativeCases1 getSettingsNegativeCases1() {

		if (STNC== null) {

			STNC = new SettingsNegativeCases1(driver);

		}
		return STNC;
	}
	public TaskNegativeCases1 getTaskNegativeCases1() {

		if (TKNC== null) {

			TKNC = new TaskNegativeCases1(driver);

		}
		return TKNC;
	}
	
	
	public Patient69 getPatient() {

		if (pa== null) {

			pa = new Patient69(driver);

		}
		return pa;
	}
	
	
}
