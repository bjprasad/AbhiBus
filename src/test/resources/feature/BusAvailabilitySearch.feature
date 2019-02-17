
Feature: To search the bus availablity from source to destination
 
  Scenario: Title of your scenario
    Given The user is in abhi bus home page
    When The user gives journey detals "<LeavingFrom>", "<GoingTo>"
    And The user submits the search
    Then The user should see the Leaving from  and Going to
    
    Examples:   
    |LeavingFrom|GoingTo|
    |Hyderabad|Chennai|
    |Hyderabad|Madurai|