Feature: Create User
  Me as automator
  I need to create a user in Utest.com
  To carry out transactions on the website

  Scenario Outline: Create user succesfully
    Given I want to open the webpage
    When Create a user in the Utest page
      | firstname   | lastname   | email   | month   | day   | year   | city   | zip   | country   | pass   | confirmpass   |
      | <firstname> | <lastname> | <email> | <month> | <day> | <year> | <city> | <zip> | <country> | <pass> | <confirmpass> |
    Then I validate creation succesfully

    Examples:
      | firstname | lastname | email                      | month | day | year | city     | zip   | country  | pass         | confirmpass  |
      | Leonel    | Mira     | leonelmira2323@hotmail.com | 01    | 23  | 1991 | Medellin | 05001 | Colombia | LeoElQueMira | LeoElQueMira |