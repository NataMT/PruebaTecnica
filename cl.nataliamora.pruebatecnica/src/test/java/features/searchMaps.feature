#Author: Natalia Mora

Feature: Google search 
  As a google search user
  I want to search different features
  So the search should show me the different results


Scenario: The user should be able to use search bar
   Given The user is on url https://www.google.com
   When The user enters the word "Tokyo"
   And press enter
   Then The user should be able to see the results for "Tokyo"
   

Scenario: The user should be able to use maps
   Given The user is on the google results page for "Tokyo"
   When The user clicks on "maps" link at the top of results page
   Then The user should be able to see "Tokyo" on google maps