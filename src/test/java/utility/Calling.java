package utility;

public class Calling 
{
	public static void main(String[]args)
	{
		//blounch
				Object[] input=new Object[2];
				input[0]="Chrome";
				input[1]="D:\\software testing\\Automation Support\\chromedriver.exe";
			    SeleniumOperation.browserLounch(input);
			//enterurl
			    Object[] input1=new Object[1];
			    		input1[0]="https://www.flipkart.com/";
			            SeleniumOperation.openApplication(input1); 
			//click On cancle
			            Object[] input2=new Object[1];
			    		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
			            SeleniumOperation.clickOnElement(input2);    
			//move to login
			            Object[] input3=new Object[1];
			    		input3[0]="//*[@class='_28p97w']";
			            SeleniumOperation.moveToElement(input3);        
		   //click on my profile
			            Object[] input4=new Object[1];
			            input4[0]="//*[text()='My Profile']";
			            SeleniumOperation.clickOnElement(input4);
			//enter user name
			            Object[] input5=new Object[2];
						input5[0]="(//*[@autocomplete='off'])[2]";
						input5[1]="kadlagshubhangi@gmail.com";
					    SeleniumOperation.Sendkeys(input5);
			            
			 // enter password
					    Object[] input6=new Object[2];
						input6[0]="//*[@type='password']";
						input6[1]="12shubha";
					    SeleniumOperation.Sendkeys(input6);
					    
			//click on login
					    Object[] input7=new Object[1];
			    		input7[0]="(//*[@type='submit'])[2]";
			            SeleniumOperation.clickOnElement(input7);   
					
			//validate login
			            Object[] input8=new Object[2];
						input8[0]="Shubhangi Tungar";
						input8[1]="//*[text()='Shubhangi Tungar']";
					    SeleniumOperation.validateLogin(input8);
	}
	
	
}
