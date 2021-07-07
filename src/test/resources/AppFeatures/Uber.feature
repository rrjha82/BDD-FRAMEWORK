@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking cab Sedan
Given user wants to seleact a car type "Saden" from uber application
When user select car "seden" and pick up point "Banglore" and drop location "pune"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD

@Regression @Smoke
Scenario: Booking cab SUV
Given user wants to seleact a car type "suv" from uber application
When user select car "seden" and pick up point "Banglore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD


@Production
Scenario: Booking cab for Mini
Given user wants to seleact a car type "Saden" from uber application
When user select car "seden" and pick up point "Banglore" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 USD
 

