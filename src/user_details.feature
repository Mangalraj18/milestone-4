
@FunctionalTest
Feature: User enter the details

@Trainbookin
Scenario Outline: Home page validating 
Given Initialize the browser with chrome
And Navigate to url site 
When User enters <from> <to> and date of booking
Then Verify that user is successfully enters into next page


Examples:
|from |     |to|
|Bangalore| |Mumbai|

@offers
Scenario: verify the highlighted word
Given User can prompt to the correct page
When click on offers link
Then The page moves into another page
When Verify the highlighted word
