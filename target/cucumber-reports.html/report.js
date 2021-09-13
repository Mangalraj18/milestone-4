$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search_flight.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a hotel in marritto website",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search hotel in homepage",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;search-hotel-in-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on our brands in homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify if the JWMarriott is listed in the list or not",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User navigate to another page",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_stepdefinition.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 28818128300,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_stepdefinition.click_on_our_brands_in_homepage()"
});
formatter.result({
  "duration": 5361902600,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_stepdefinition.verify_if_the_jwmarriott_is_listed_in_the_list_or_not()"
});
formatter.result({
  "duration": 1990933900,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_stepdefinition.user_navigate_to_another_page()"
});
formatter.result({
  "duration": 1388198100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verifies the address",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;verifies-the-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Launch the browser and enter the maritto url",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter the destination in the destination field \"Bangalore\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click on find hotels in the homepage",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Verify the address in the first hotel \"Bengaluru\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_stepdefinition.launch_the_browser_and_enter_the_maritto_url()"
});
formatter.result({
  "duration": 26569293000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 48
    }
  ],
  "location": "Homepage_stepdefinition.enter_the_destination_in_the_destination_field_something(String)"
});
formatter.result({
  "duration": 9769434200,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_stepdefinition.click_on_find_hotels_in_the_homepage()"
});
formatter.result({
  "duration": 336472600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bengaluru",
      "offset": 39
    }
  ],
  "location": "Homepage_stepdefinition.verify_the_address_in_the_first_hotel_something(String)"
});
formatter.result({
  "duration": 16395637900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the mobile service key",
  "description": "",
  "id": "booking-a-hotel-in-marritto-website;verify-the-mobile-service-key",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "Launch the browser and enter the maritto url in",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on Member benefits under member benefits",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "verify the mobile key and mobile check in \"Mobile Check-In/Services\"",
  "keyword": "When "
});
formatter.match({
  "location": "Homepage_stepdefinition.launch_the_browser_and_enter_the_maritto_url_in()"
});
formatter.result({
  "duration": 33976232400,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_stepdefinition.click_on_member_benefits_under_member_benefits()"
});
formatter.result({
  "duration": 11279751400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile Check-In/Services",
      "offset": 43
    }
  ],
  "location": "Homepage_stepdefinition.verify_the_mobile_key_and_mobile_check_in_something(String)"
});
formatter.result({
  "duration": 3794248000,
  "status": "passed"
});
});