
@smoke
Feature: Testing Login functionality to the application

#comments

#Background: Optinal, You have to put all the common steps
#Description: What is the requirement.
Scenario: User can Login using the correct username and password


When User clicks the Sign in button
And User Enters the email
And User Enters the password
And User Clicks on the Sign In button
Then The user is successfully logged in and username is displayed 
And User is navigate to home page

@Smoke01
Scenario: User is able to search the products
Description: This scernario tests how to search products.
When User click on the Search box and searches for "iPhone"
And User clicks on the search Button
Then User will find the specific item

@Regression
Scenario: User is able to click on the latest products from the home page
Description: This scenario checks the lates product
When User clicks on the latest producyt from the homepage
Then User is able to see the latest product

Scenario: User is able to click on the cart button
When User clicks on the cart button
Then User is navigated to the Cart Page

Scenario: This scenario will run without Given and When 
Then I want to check user is able to pay for the item