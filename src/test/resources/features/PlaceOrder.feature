Feature: Place order

Background: UserLogin
Given User is on login page
When User enters "standard_user" and "secret_sauce"
Then User should be on Home Page

Scenario: Add Item to cart
#Given User should be on Home page
When User add item to cart 
Then Item must be added

Scenario: Checkout Order
Given User is on cart page
When User do checkout
Then Should navigate to checkout page
