Feature: Tenant
I want to use this template for my feature file

 Scenario Outline: To Rent a home option
    Given user is logged into the website
    When the user selects "<location>" option a dropdown is visible
    Then the user selects "<city>" as option
    Then selects For tenants as option
    Then the user selects "<property_type>" option
    Then selects "<property_subtype>" as option
    Then selects a filter
    Then selects the desired property

    Examples:
      | location  | city       | property_type | property_subtype  |
      | All india | Hyderabad  | rent a home   | independent house |
      | All india | Mumbai     | rent a home   | apartment         |
      | All india | Bangalore  | rent a home   | villa             |


