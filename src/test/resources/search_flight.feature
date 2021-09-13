Feature: Booking a hotel in marritto website

Scenario: Search hotel in homepage
Given Launch the browser and enter the url
When Click on our brands in homepage
And Verify if the JWMarriott is listed in the list or not 
Then User navigate to another page

Scenario: Verifies the address
Given Launch the browser and enter the maritto url
When Enter the destination in the destination field "Bangalore"
When Click on find hotels in the homepage
And Verify the address in the first hotel "Bengaluru"


Scenario: Verify the mobile service key
Given  Launch the browser and enter the maritto url in
When Click on Member benefits under member benefits
When verify the mobile key and mobile check in "Mobile Check-In/Services"

