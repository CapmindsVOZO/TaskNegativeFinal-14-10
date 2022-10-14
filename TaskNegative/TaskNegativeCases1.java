package com.TaskNegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskNegativeCases1 {

	public WebDriver driver;

	public TaskNegativeCases1(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

@FindBy(xpath = "//a[@href='/popups/Tasks']//*[name()='svg']")
private WebElement ClickTaskButton;

public WebElement getClickTaskButton() {
return ClickTaskButton;
}
@FindBy(xpath = "//div[@class='tk-cd-right-btn tsk_btn_edt']")
private WebElement ClickEditButton;

public WebElement getClickEditButton() {
return ClickEditButton;
}
@FindBy(xpath = "//button[@id='3']")
private WebElement ClickArchive;

public WebElement getClickArchive() {
return ClickArchive;
}
@FindBy(xpath = "//div[@class='add-task-close']")
private WebElement ClickClose;

public WebElement getClickClose() {
return ClickClose;
}
@FindBy(xpath = "//button[@id='tsk_mng-btn_tmplt']")
private WebElement ClickEditTaskTemplate;

public WebElement getClickEditTaskTemplate() {
return ClickEditTaskTemplate;
}
@FindBy(xpath = "//button[normalize-space()='Create New Template']")
private WebElement ClickCreateNewTemplate;

public WebElement getClickCreateNewTemplate() {
return ClickCreateNewTemplate;
}
@FindBy(xpath = "(//input[@type='text'])[2]")
private WebElement EnterTitle;

public WebElement getEnterTitle() {
return EnterTitle;
}
@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/select[1]")
private WebElement CickAssignee;

public WebElement getCickAssignee() {
return CickAssignee;
}
@FindBy(xpath = "(//option[@value='1'][normalize-space()='Martin Edward'])[2]")
private WebElement selectTech1Test;

public WebElement getselectTech1Test() {
return selectTech1Test;
}
@FindBy(xpath = "//input[@name='template_name']")
private WebElement EnterTemplateName;

public WebElement getEnterTemplateName() {
return EnterTemplateName;
}
@FindBy(xpath = "(//input[@type='tel'])[1]")
private WebElement EnterDay;

public WebElement getEnterDay() {
return EnterDay;
}
@FindBy(xpath = "(//input[@type='tel'])[2]")
private WebElement EnterHour;

public WebElement getEnterHour() {
return EnterHour;
}
@FindBy(xpath = "(//input[@type='tel'])[3]")
private WebElement EnterMin;

public WebElement getEnterMin() {
return EnterMin;
}
@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[2]/select[1]")
private WebElement Selectcategory;

public WebElement getSelectcategory() {
return Selectcategory;
}
@FindBy(xpath = "//option[normalize-space()='Lab Order']")
private WebElement SelectCapminds;

public WebElement getSelectCapminds() {
return SelectCapminds;
}
@FindBy(xpath = "//select[@name='priority']")
private WebElement ClickPriority;

public WebElement getClickPriority() {
return ClickPriority;
}
@FindBy(xpath = "(//option[@value='2'][normalize-space()='Medium'])[2]")
private WebElement Selectmedium;

public WebElement getSelectmedium() {
return Selectmedium;
}
@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/div[2]/select[1]")
private WebElement ClickStatus1;

public WebElement getClickStatus1() {
return ClickStatus1;
}
@FindBy(xpath = "(//option[normalize-space()='Arrived'])[1]")
private WebElement SelectArrived;

public WebElement getSelectArrived() {
return SelectArrived;
}
@FindBy(xpath = "//textarea[@class='form-control']")
private WebElement EnterNotes;

public WebElement getEnterNotes() {
return EnterNotes;
}
@FindBy(xpath = "//button[normalize-space()='Save']")
private WebElement SelectSave;

public WebElement getSelectSave() {
return SelectSave;
}
@FindBy(xpath = "//button[normalize-space()='Cancel']")
private WebElement SelectCancel;

public WebElement getSelectCancel() {
return SelectCancel;
}
@FindBy(xpath = "//button[@id='tsk_ad-btn_bck']")
private WebElement ClickBack;

public WebElement getClickBack() {
return ClickBack;
}

@FindBy(xpath = "//select[@class='tk-frmc-wid arrow-adj form-control']")
private WebElement ClickFilterTask;

public WebElement getClickFilterTask() {
return ClickFilterTask;
}
@FindBy(xpath = "(//option[@value='Capminds'])[1]")
private WebElement SelectFilterTask;

public WebElement getSelectFilterTask() {
return SelectFilterTask;
}
@FindBy(xpath = "//button[@id='tsk_mng-btn_filt']")
private WebElement ResetFilters;

public WebElement getResetFilters() {
return ResetFilters;
}

















}
