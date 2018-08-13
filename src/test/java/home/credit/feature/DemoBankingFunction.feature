Feature: Verify main function of Demo guru bank

    Scenario: Verify 3 functions of Demo guru bank

        Given I login to Guru99 page
        And On Homepage, I open "New Customer" page
        When I create a new customer with information as following:
            | customerName | gender | dob        | address   | city | state | pin    | mobileNumber | email | password |
            | NameTest     | M      | 01/12/1980 | 123 PhuNu | LA   | CA    | 123456 | 0900111      | AUTO  | 123456   |
        Then I should see the new customer is created successfully
        When On Homepage, I open "New Account" page
        And I create a new account with information as following:
            | customerId | accountType | initialDeposit |
            | %new%      | Savings     | 501            |
        Then I should see the new account is created successfully
        When On Homepage, I open "Deposit" page
        When I deposit with infomation as following:
            | accountNo | amount | description |
            | %new%     | 100    | Verify      |
        Then I should see deposit work fine