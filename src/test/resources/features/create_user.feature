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
      | firstname | lastname | email                           | month | day | year | city     | zip   | country  | pass         | confirmpass  |
      | Capitan   | America  | capitan.america23test@gmail.com | April    | 15  | 1980 | Medellin | 05001 | Colombia | jH1hdvB4972t | jH1hdvB4972t |
      | Iron      | Man      | iron.man23test@gmail.com        | July    | 24  | 1998 | Medellin | 05001 | Colombia | B4972tjH1hdv | B4972tjH1hdv |