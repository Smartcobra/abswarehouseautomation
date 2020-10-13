package com.abswarehouse.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.abswarehouse.helper.WaitHelper;
import com.abswarehouse.pageObjects.LoginLogoutPage;
import com.abswarehouse.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginLogoutPageStepDefinitions extends TestBase {

	LoginLogoutPage loginPage = new LoginLogoutPage(driver);

	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the Login page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		waitHelper = new WaitHelper(driver);
	}


	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		loginPage.enterUserName(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		waitHelper.WaitForElement(loginPage.password,200);
		loginPage.enterPassword(arg1);

	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		loginPage.clickLoginButton();

	}


	@Then("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		waitHelper.WaitForElement(loginPage.welcomeHome, 100);
		loginPage.welcomeHome.isDisplayed();


	}

	@When("^I Click on Uom button$")
	public void i_Click_on_Uom_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uom, 1000);
		loginPage.clickUom();


	}

	@When("^click on register button$")
	public void click_on_UOM_register_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomRegister, 1000);
		loginPage.clickUomRegister();


	}

	@Then("^select uomType$")
	public void select_uomType() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomType, 4000);
		loginPage.selectUOMType();

	}

	@Then("^I enter UomModel as \"([^\"]*)\"$")
	public void i_enter_UomModel_as(String arg1) throws Throwable {
		waitHelper.WaitForElement(loginPage.uomModel, 4000);
		//WebDriverWait wait = new WebDriverWait(driver, 100);
		///wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("id"))));
		loginPage.enterUomModel(arg1);
	}

	@Then("^I enter description as \"([^\"]*)\"$")
	public void i_enter_description_as(String arg1) throws Throwable {
		waitHelper.WaitForElement(loginPage.uomDescription, 4000);
		loginPage.enterDescription(arg1);
	}

	@Then("^submit Uom Registration$")
	public void submit_Uom_Registration() throws Throwable {
		//waitHelper.WaitForElement(loginPage.uomRegister, 10);
		loginPage.submitUomRegister();
	}
	@Then("^clik on UOM HOME button$")
	public void clik_on_UOM_HOME_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomHome, 100);
		loginPage.clickUomHome();
	}

	@Then("^clik on UOM DATA button$")
	public void clik_on_UOM_DATA_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomData, 10);
		loginPage.clickUomData();
	}

	@Then("^clik on Export_To_Excel button$")
	public void clik_on_Export_To_Excel_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomExportExcel, 1000);
		loginPage.clickUomExcelExport();
		Thread.sleep(1000);
	}

	@Then("^clik on Download_PDF button$")
	public void clik_on_Download_PDF_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomDownloadPDF, 1000);
		loginPage.clickUomDownloadPDF();
		Thread.sleep(1000);
	}

	@Then("^clik on UOM HOME(\\d+) button$")
	public void clik_on_UOM_HOME_button(int arg1) throws Throwable {
		waitHelper.WaitForElement(loginPage.uomHome2, 1000);
		loginPage.clickUomHome2();
	}
	@Then("^click on UOM HOME_Again button$")
	public void click_on_UOM_HOME_Again_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.uomHome3, 1000);
		loginPage.clickUomHome3();
	}


	@Then("^click on myAccount button$")
	public void click_on_myAccount_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.myaccount, 100);
		loginPage.clickMyaccount();

	}


	@Then("^click on logout button$")
	public void click_on_logout_button() throws Throwable {
		waitHelper.WaitForElement(loginPage.logout, 100);
		loginPage.clickLogout();

	}


//	@When("^I am logged in$")
//	public void i_am_already_logged_in() throws Throwable {
//	    loginPage.logoutBtn.isDisplayed();
//	}
//
//	@When("^I Click on Sign out$")
//	public void i_Click_on_Sign_out() throws Throwable {
//	    loginPage.clickLogoutButton();
//	    waitHelper.WaitForElement(loginPage.userName, 60);
//	}

//	@Then("^I got log out from the application and land on sign in page$")
//	public void i_got_log_out_from_the_application_and_land_on_sign_in_page() throws Throwable {
//		loginPage.userName.isDisplayed();
//	}
//
//	@Then("^I choose Electronincs>Headphones and headphones list out$")
//	public void i_choose_Electronincs_Headphones_and_headphones_list_out() throws Throwable {
//	    loginPage.clickHeadphonesLnk();
//	}
//
//	@Then("^I add first availabe headphone to cart$")
//	public void i_add_first_availabe_headphone_to_cart() throws Throwable {
//	    loginPage.AddHeadphoneToCart();
//	}
//
//	@Then("^I search \"([^\"]*)\" and add second available item to cart$")
//	public void i_search_and_add_nd_available_item_to_cart(String arg1) throws Throwable {
//	    loginPage.enterSearchItemandAddToCart(arg1);
//	}
//
//	@Then("^I clear cart items if any$")
//	public void i_clear_cart_items_if_any() throws Throwable {
//	    loginPage.clearCartItemifExist();
//	}
//
//	@Then("^I Select cart from home and remove the earlier added headphones$")
//	public void i_Select_cart_from_home_and_remove_the_earlier_added_headphones() throws Throwable {
//	    loginPage.cartButton.click();
//	    loginPage.itemList.get(1).click();
//	}
//
//	@Then("^I Reduce the Quantity of the macbook pro product to one and proceed to checkout$")
//	public void i_Reduce_the_Quantity_of_the_macbook_pro_product_to_one_and_proceed_to_checkout() throws Throwable {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].innerText='1'",driver.findElement(By.className("a-dropdown-prompt")));
//	}
//
//	@Then("^I search different \"([^\"]*)\" from the search bar$")
//	public void i_search_different_from_the_search_bar(String arg1) throws Throwable {
//	    loginPage.itemSearchField.sendKeys(arg1);
//	    loginPage.itemSearchField.submit();
//	    Thread.sleep(5000);
//	}
	
}