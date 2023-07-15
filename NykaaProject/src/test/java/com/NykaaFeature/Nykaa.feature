Feature: We can buy a product using Nykaa application

Scenario: user signin the account 

Given user Launch The Application
When user Click The Sign in button
And user Click The Sign in with Mobile/Email
And user Enter Email Or Phone Number
And User Click The proceed Button
And user Enter The OTP Which Coming To Mobile Number Or Email
And user Click The Verify Button

Scenario: user Select The Product

When user Drag Mouse Over The Item And Click The Product Title
And Page Navigate to the Next Window
And user Select The Product From The List Of Products
And page Navigate To The Next Window
And user Click The Add To Bag Button
And user Click The Proceed Button To Purchase the Product

Scenario: user Buy A Product

When user Click Deliver Here Button
And user select The cash On delivery
And user Place the Order

