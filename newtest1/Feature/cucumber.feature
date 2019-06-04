Feature: Login testMeApp
@tag1
Scenario Outline: login to TestMeApp with the registered username and password
Given signinpage
When username is given as "<user>" 
And password is given as "<pass>"
Then Login

Examples: 
|user|pass|
|Lalitha|Password123|

@tag2
Scenario: he one where the user moves to cart without adding any item in it
Given signinpage
When username is given as "lalitha" 
And password is given as "Password123"
Then Login 
When search headphones
And try payment
Then TestMeApp dont show cart icon
