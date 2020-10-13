package com.abswarehouse.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.abswarehouse.helper.WaitHelper;

public class LoginLogoutPage {
	
	private WebDriver driver;
	WaitHelper waitHelper;


	@FindBy(id="username")
	public WebElement userName;


	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login_btn")
	WebElement loginButton;
	

	@FindBy(xpath="/html/body/app-root/app-home/div/div/div[2]/h2")
	public WebElement welcomeHome;


	@FindBy(xpath="/html/body/app-root/app-home/mdb-navbar/nav/div[2]/links/ul[1]/li[2]/a/span")
	public WebElement uom;

	@FindBy(xpath="/html/body/app-root/app-uom-c/div/div[2]/div/div[2]/a/span")
	public WebElement uomRegister;

	@FindBy(xpath="//*[@id=\"uomType\"]")
	public WebElement uomType;

	@FindBy(xpath="//*[@id=\"uomModel\"]")
	public WebElement uomModel;

	@FindBy(xpath="//*[@id=\"description\"]")
	public WebElement uomDescription;

	@FindBy(xpath="/html/body/app-root/app-uom-register/div/div/div[2]/div[1]/form/div[4]/div[2]/input")
	public WebElement uomSubmit;

    @FindBy(xpath="/html/body/app-root/app-uom-register/div/button")
    public WebElement uomHome;


    @FindBy(xpath="/html/body/app-root/app-uom-c/div/div[2]/div/div[3]/a/span")
    public WebElement uomData;

	@FindBy(xpath="/html/body/app-root/app-uom-data/div/button[2]")
	public WebElement uomExportExcel;

	@FindBy(xpath="/html/body/app-root/app-uom-data/div/button[3]")
	public WebElement uomDownloadPDF;

	@FindBy(xpath="/html/body/app-root/app-uom-data/div/button[1]")
	public WebElement uomHome2;

	@FindBy(xpath="/html/body/app-root/app-uom-c/div/a/span")
	public WebElement uomHome3;

	@FindBy(xpath="/html/body/app-root/app-home/mdb-navbar/nav/div[2]/links/ul[2]/li[2]/a")
	public WebElement myaccount;


	@FindBy(xpath="/html/body/app-root/app-home/mdb-navbar/nav/div[2]/links/ul[2]/li[2]/div/a[2]")
	public WebElement logout;



	public LoginLogoutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		///waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	
	public void enterPassword(String password){
		this.password.sendKeys(password);
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}


	public void clickUom(){
		uom.click();
	}
	public void clickUomRegister(){
		uomRegister.click();
	}

	public void selectUOMType(){
		//Select dropdown = new Select(driver.findElement(By.id("designation")));
		Select dropdown = new Select(uomType);
		dropdown.selectByVisibleText("PACKING");
	}

	public void enterUomModel(String uomModel)
	{
		this.uomModel.sendKeys(uomModel);
	}

	public void enterDescription(String description)
	{
		this.uomDescription.sendKeys(description);
	}

	public void submitUomRegister(){
		uomSubmit.click();
	}

    public void clickUomHome(){
        uomHome.click();
    }

    public void clickUomData(){
        uomData.click();
    }

	public void clickUomExcelExport(){
		uomExportExcel.click();
	}

	public void clickUomDownloadPDF(){
		uomDownloadPDF.click();
	}

	public void clickUomHome2(){
		uomHome2.click();
	}

	public void clickUomHome3(){
		uomHome3.click();
	}

	public void clickMyaccount(){
		myaccount.click();
	}

	public void clickLogout(){
		logout.click();
	}




//	public void enterSearchItemandAddToCart(String item){
//		String mainWindow=driver.getWindowHandle();
//		this.itemSearchField.sendKeys(item);
//		this.itemSearchField.submit();
//		secondMacbookItem.click();
//		Set<String> set =driver.getWindowHandles();
//		Iterator<String> itr= set.iterator();
//		while(itr.hasNext()){
//		 String childWindow=itr.next();
//		 if(!mainWindow.equals(childWindow)){
//			 driver.switchTo().window(childWindow);
//			 System.out.println(driver.switchTo().window(childWindow).getTitle());
//			 if(qtyField.size()>=1){
//
//				 Select sel = new Select(qtyField.get(0));
//				 sel.selectByValue("2");
//			 }
//
//			 JavascriptExecutor js = (JavascriptExecutor)driver;
//			 js.executeScript("arguments[0].scrollIntoView(true);",addToCartBtn);
//			 js.executeScript("arguments[0].click();", addToCartBtn);
//			 if(driver.findElements(By.xpath("//div[@class='a-popover-inner']//button[contains(text(),'Skip')]")).size()>=1){
//
//				 driver.findElements(By.xpath("//div[@class='a-popover-inner']//button[contains(text(),'Skip')]")).get(0).click();
//			 }
//			 //addToCartBtn.click();
//			 //driver.close();
//		 }
//		}
//		driver.switchTo().window(mainWindow);
//	}
	
//	public void clickSignInButton(){
//		Actions builder = new Actions(driver);
//		builder.moveToElement(SignInfromNav).build().perform();
//		SignInfromNav.click();
//	}
	
//	public void clearCartItemifExist(){
//		cartButton.click();
//		int i = itemList.size();
//		if(i>=1){
//			itemList.get(0).click();
//			i = itemList.size();
//		}
//	}
	
//	public void clickHeadphonesLnk(){
//		Actions builder = new Actions(driver);
//		builder.moveToElement(allShopNav).build().perform();
//		builder.moveToElement(TvApplElecPanel).build().perform();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", headPhonesCatLnk);
//
//	}
//
//	public void AddHeadphoneToCart(){
//
//		firstHeadPhoneLnk.click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", addToCartBtn);
//	}
	
//	public void clickContinueButton(){
//		Continue.click();
//	}
	
	
	
//	public void clickLogoutButton(){
//		Actions builder = new Actions(driver);
//		builder.moveToElement(SignInfromNav).build().perform();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", logoutBtn);;
//	}
}
