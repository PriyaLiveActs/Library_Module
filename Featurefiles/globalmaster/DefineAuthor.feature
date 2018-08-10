Feature: Define Author


    @scenario2
    Scenario: To Test the validation messages after hitting save button when all the fields are left blank
    When User Open Define Author page
    And  hit Save Button
    Then Verify the error messages
    @scenario1
    Scenario Outline: To Test the Author field with multiple inputs and verify the error messages
      When User Open Define Author Page
      And  Enter Input to "<AuthorName>" field
      Then Hit Save and Verify the input

      Examples:
        |AuthorName|
        |10th KING|
        |John.Snow@|
    @scenario3
     Scenario Outline: To test the Length of Author Field as its Max length is 50 Characters
       When User Open Define Author Page
       And Enter multiple "<length>" inputs to AuthorName field
       Then  Verify the length validations on inputs

       Examples:
         |length|
                 |SherlockHomes@123 & Alexender Author Name'ss garde|
                 |SherlockHomes@123 & Alexender Author Name'ss gardes1|
                 |SherlockHomes@123 & Alexender Author Name'ss gard   |
     @scenario4
    Scenario: To test the AuthorName field with duplicate Value
      When User Open Define Author Page
      And Enter the Authorname as "Jimme Lannister"
      Then While hitting save verify the message

