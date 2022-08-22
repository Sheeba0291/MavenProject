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
And Click Create Lead Link
And Type CompanyName as <companyName>
And Type FirstName as <firstName>
And Type LastName as <lastName>
When Click CreateLead button
Then Verify Page Title

Examples:
|companyName|firstName|lastName|
|IBM|Sheeba|M Karthik|
|CTS|Karthik|T R|
|IBM|Sheeba|M Karthik|