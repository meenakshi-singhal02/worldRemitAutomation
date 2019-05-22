@sendMoney @ui @worldRemit
Feature: WorldRemit Send Money

@story_id
  Scenario Outline: Navigate to money Transfer Page
    Given I navigate to World Remit Hompage "WorldRemitURL"
    And I validate objects on World Remit Homepage
    And I select send from country as <sendFromCountry>
    And I select language as <language>
    When I should verify user select Country as <selectToCountry>
    And I start the money sending process
    Then I validate objects on Send Money Page
    And I should see money transfer page for <selectToCountry>


#Uncommit and add countries as per requirement

    Examples: 
      | selectToCountry | sendFromCountry		| 	language 			|
#			| "Albania" 			|	"Germany"  				| 	"English"			|
#			| "Jordan" 				|	"United States"   |		"English"			|
#			| "India" 				|	"Switzerland"    	|		"English"			|
			| "Philippines" 	|	"United Kingdom"	|		"English" 		|
