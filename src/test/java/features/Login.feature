Feature: Login to the LeafTaps Application

@smoke
Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login Button
Then Verify the Homepage is displayed

@sanity
Scenario: Negative Login
Given Type the username as 'Demo'
And Type the password as 'crms'
When Click on the Login Button
But Verify the Error message is displayed