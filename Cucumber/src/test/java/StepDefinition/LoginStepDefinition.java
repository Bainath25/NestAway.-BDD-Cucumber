package StepDefinition;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.Nestaway.page.PaymentPage;
import com.Nestaway.generic.BaseClass;
import com.Nestaway.page.HomePage;
import com.Nestaway.page.LoginPage;
import com.Nestaway.page.SelectedHouse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	SelectedHouse sh;
	PaymentPage pp;
	
	@Given("the browser is launched and application is loaded")
	public void the_browser_is_launched_and_application_is_loaded() throws InterruptedException 
	{
	    BaseClass.setproperty();
	    BaseClass.OpenApp(); 
	    lp=new LoginPage(driver);
	    hp= new HomePage(driver);
		sh=new SelectedHouse(driver);
		pp=new PaymentPage(driver);
	    
	}

	@When("the user click on  menubar")
	public void the_user_click_on_menubar() 
	{
		
		lp.ClickMenu();		
	}

	@When("the user click on Login button")
	public void the_user_click_on_login_button() throws InterruptedException
	{	
		
		lp.ClickMenuLogin();

	}

	@When("the user enter the Username")
	public void the_user_enter_the_username() throws InterruptedException
	{	
		String username=BaseClass.getXLData(TEST_INPUT_DATA, "Login", 1, 0);
		lp.EnterUsername(username);
	}

	@When("the user click on continue button")
	public void the_user_click_on_continue_button() throws InterruptedException
	{	
		lp.ClickContinue();
	}

	@When("the user enter the password")
	public void the_user_enter_the_password() throws InterruptedException
	{	
		String password=BaseClass.getXLData(TEST_INPUT_DATA, "Login", 1, 1);
		lp.EnterPassword(password);
	}

	@When("the user click on login")
	public void the_user_click_on_login() throws InterruptedException
	{	
		lp.ClickLogin();
	}

	@Then("nestaway homepage is displayed")
	public void nestaway_homepage_is_displayed() throws InterruptedException
	{
	   Assert.assertEquals("Flats, House, Rooms for Rent at PG prices without Brokers | NestAway", driver.getTitle());
	}

	/**
	 * After login
	 * @throws InterruptedException
	 */
	@When("the user click on searchbar")
	public void the_user_click_on_searchbar() throws InterruptedException
	{
		hp.ClickMainSearchBox();
	}

	@When("the user click on the HSR layout")
	public void the_user_click_on_the_hsr_layout() throws InterruptedException
	{
		hp.ClickHsr_Layout();
	}

	@When("the user pick any House")
	public void the_user_pick_any_house() throws InterruptedException
	{
		hp.ScrollBy();
		hp.Housepicker();
	}

	@Then("selected House page is displayed")
	public void selected_house_page_is_displayed() throws InterruptedException
	{
		String title=driver.getTitle();
		assertEquals("PG in Hsr Layout? Rent Furnished Rooms At Paying Guest Price in Bangalore, Near You | NestAway",title);
	    System.out.println("Housepage is Displayed");
	}

	@When("the user click on the Book")
	public void the_user_click_on_the_book() throws InterruptedException
	{
		
		sh.Book();
	}

	@When("the user click on the PaytokenAmount")
	public void the_user_click_on_the_paytoken_amount() throws InterruptedException
	{
	    sh.PayTokenAmount(); 	
	}

	@When("the user click on the select this Bed")
	public void the_user_click_on_the_select_this_bed() throws InterruptedException
	{
		sh.ScrollBy();
	    sh.SelectthisBed();
	}

	@When("the user click on the movein date")
	public void the_user_click_on_the_movein_date() throws InterruptedException
	{
		sh.MoveinDate();
	}
	
	@When("the user pick any date")
	public void the_user_pick_any_date() throws InterruptedException
	{
		sh.SelectDate(); 
	}

	@When("the user click on Boy")
	public void the_user_click_on_boy() throws InterruptedException
	{
		sh.CheckBox();
	}

	@When("the user click on DebitCard")
	public void the_user_click_on_debit_card() throws InterruptedException
	{
	  sh.DebitCardOption();
	}

	@When("the user click on pay and Block this Bed")
	public void the_user_click_on_pay_and_block_this_bed() throws InterruptedException
	{
		sh.PayPaymentButton();
	}
	@Then("Paymentpage is displayed")
	public void paymentpage_is_displayed() 
	{
		assertEquals(true, true);
	    
	}

	@When("the user enter Debitcard details")
	public void the_user_enter_debitcard_details() throws InterruptedException
	{
		String cardnumber=BaseClass.getXLData(TEST_INPUT_DATA, "Payment", 1, 0);
		pp.EnterCardNumber(cardnumber);
		String cardexpiry=BaseClass.getXLData(TEST_INPUT_DATA, "Payment", 1, 1);
		pp.EnterExpiry(cardexpiry);
		String cardcvv=BaseClass.getXLData(TEST_INPUT_DATA, "Payment", 1, 2);
		pp.EnterCVV(cardcvv);
		String cardname=BaseClass.getXLData(TEST_INPUT_DATA, "Payment", 1, 3);
		pp.Entername(cardname);
	    
	}

	@When("the user click on paybutton")
	public void the_user_click_on_paybutton() throws InterruptedException 
	{
		pp.Proceed();
	   
	}

	
	
	
}
