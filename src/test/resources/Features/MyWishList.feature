@MyWishList
Feature: WishList

  Scenario: I want to Create account and Add Item to my Wishlist

    Given I am on the application homescreen
    And I Click Sign In
    And I successfully register account being navigated to my homepage
    And I see LinkText My Wishlist is displayed
    When I Click on LinkText My Wishlist
    And I see Top Sellers list on left hand panel
    And I Click the first item on the Top Sellers list
    And I add selected item to my wishlist
    And I get a confirmation message that Item is added to wish list
    When I view my wishlist page
    Then Item should be displayed on my wishlist

