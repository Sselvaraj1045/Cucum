#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search and Place the order for products
 
  @PlaceOrder
  Scenario Outline: Product search experience in both home and offers page
  
    Given is on GreenCart Landing page
    When user searched with short name called <Name> and extracted actual name of product
    And added "3" items to checkout page
    Then user proceed to checkout and validate the <Name> items in checkout page
    And verify user able to apply promocode and place order
    
    
    Examples:
    
    | Name |
    | Tom  | 
    
    


