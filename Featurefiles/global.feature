Feature: Page Opening feature

  Background: Launch Url and Go to library section from dashboard

    Given Go to url
    When user enter username and pasword and click login
    Then for correct credentials it logged IN then hit go to library

  # Scenario: Test the main five menus   // SKIPPING TIS SCENARIO

   # When pickup the menus from the main page
   # And validate the menus from expected menus
   # Then if matched it should move to next scenario and if not then it should throw an error messgae

  Scenario: Test the menu and sub menus of Global Master

    Given Go to Global Master icon and hit it
    Then  Check all the sub menus of Global Master