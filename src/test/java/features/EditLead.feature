Feature: Login to the LeafTaps Application

Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
And Click on the Login Button
And Verify the Homepage is displayed

@sanity
Scenario Outline: Create Lead with Multiple data
Given Click CRMSFA
And Click Leads Hyperlink
And Click Find Leads Link
And Enter First name as 'Sheeba'
And Click Find leads button
And Click on first resulting lead
And Verify Page Title
And Click Edit
And Change the company name as <companyName>
When Click Update
Then Confirm the changed name appears

Examples:
|companyName|
|VirtusPolaris|
|TestLeafNew|
