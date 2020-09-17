Feature: Testing the Login feature for the Nestaway Application

Background:
Given the browser is launched and application is loaded

	Scenario: Testing the Login feature with valid data
	
	##Steps to Login
	
	When the user click on  menubar
	And the user click on Login button
	And the user enter the Username
	And the user click on continue button
	And the user enter the password
	And the user click on login
	Then nestaway homepage is displayed

	##Steps to Select House
	
	When the user click on searchbar
	And the user click on the HSR layout
	And the user pick any House
	Then selected House page is displayed
	When the user click on the Book
	And the user click on the PaytokenAmount
	And the user click on the select this Bed
	And the user click on the movein date
	And the user pick any date
	And the user click on Boy
	And the user click on DebitCard
	And the user click on pay and Block this Bed
	
	##Steps to Payment page
	
	Then Paymentpage is displayed
	When the user enter Debitcard details
	And the user click on paybutton 