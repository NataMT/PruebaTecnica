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


Scenario Outline: The user should be able to use search bar and use different features with the results
	Given The user is on url https://www.google.com
  When The user enters <word>
  And press enter
  Then The user should be able to see <results>
  And use <features> to see different outcomes
  
   Examples: 
      | word  	| results | features  |
      | "Tokyo" |   -			| search		|
      | "Tokyo" |  -			| images		|
      | "Tokyo" |  -			| news			|
      | "Tokyo" |  -			| maps			|
      

