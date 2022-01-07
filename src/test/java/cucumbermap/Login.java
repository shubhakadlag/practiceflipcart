package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperation;

public class Login 
{
	// blonch
	@Given ("^user open \"(.*)\" browserb with \"(.*)\" exe$")
	public void bLounch(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
	    SeleniumOperation.browserLounch(input);
		
	}
	
	// open url
	@Given ("^user open \"(.*)\"$")
	public  void openApp(String url)
	{
		 Object[] input1=new Object[1];
 		input1[0]=url;
         SeleniumOperation.openApplication(input1); 
	}
	
	//click on cancle
	@When ("^user click on cancle login  button$")
	public  void clickOncancle()
	{
		  Object[] input2=new Object[1];
  		 input2[0]="//*[@class='_2KpZ6l _2doB4z']";
          SeleniumOperation.clickOnElement(input2);  
	}
	
	//move to login
	@When ("^user move to login button$")
	public  void moveTo()
	{
		 Object[] input3=new Object[1];
 		input3[0]="//*[@class='_28p97w']";
         SeleniumOperation.moveToElement(input3);
	}
	//  //click on my profile
	@When ("^user click on my profile$")
	public  void myProfile()
	{
		 Object[] input4=new Object[1];
         input4[0]="//*[text()='My Profile']";
         SeleniumOperation.clickOnElement(input4);
	}
	//username
	@When ("^user enter \"(.*)\" as username$")
	public  void uName(String uname)
	{
		  Object[] input5=new Object[2];
			input5[0]="(//*[@autocomplete='off'])[2]";
			input5[1]=uname;
		    SeleniumOperation.Sendkeys(input5);
	}
	//pwd
	@When ("^user enter \"(.*)\" as password$")
	public  void psw(String pswd)
	{
		 Object[] input6=new Object[2];
			input6[0]="//*[@type='password']";
			input6[1]=pswd;
		    SeleniumOperation.Sendkeys(input6);
}
	//login
	@When ("^user click on login button$")
	public  void clogin()
	{
		 Object[] input7=new Object[1];
 		input7[0]="(//*[@type='submit'])[2]";
         SeleniumOperation.clickOnElement(input7);   
		    
	}
	
	//application shows profile
	@Then ("^Application shows profile to user$")
	public void validate()
	{
		  Object[] input8=new Object[2];
			input8[0]="Shubhangi Tungar";
			input8[1]="//*[text()='Shubhangi Tungar']";
		    SeleniumOperation.validateLogin(input8);
	}
}
