@BuyFish

Feature: Buy Fish


Scenario: Verify user remove item
Given the user is in the cart page
When he clicks the remove button
Then remove product

Scenario: Verify user can update cart
Given the user is in the cart page
When he clicks the update cart button
Then update cart

Scenario: Verify user can checkout item
Given the user is in the cart page
When he clicks the checkout button
Then checkout product