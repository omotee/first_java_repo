Feature: Retrieve a Quote
  As a customer
  I want to retrive and edit a quote
  So I can get cheaper Insurance

  Scenario: This is to retrieve already submitted quote
    Given that a customer is on the application homepage "Home"
    When he enters his details using email as "theveryperson2002@yahoo.com" password as "carInsurance" and dob as day "10", month "07", "1990"
    Then he should be taken to quotes page "Hi Tayo, welcome to your quotes"
