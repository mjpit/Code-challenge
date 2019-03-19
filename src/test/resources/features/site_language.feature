# new feature
#    Tags: optional

      Feature: As a new visiter on the website I want to be able to select my language


      Scenario: Select Japanese language
        Given Yoko is on the homepage
        When she chooses "Japanese" as a language
        Then she can see the Japanese greeting