Feature: to check login functionality
Background: user is on login page
Given user open "Chrome" browserb with "D:\\software testing\\Automation Support\\chromedriver.exe" exe
Given user open "https://www.flipkart.com/"

@smokeTest
Scenario: to check login functionality
When user click on cancle login  button 
When user move to login button
When user click on my profile
When user enter "kadlagshubhangi@gmail.com" as username
When user enter "12shubha" as password
When user click on login button
Then Application shows profile to user