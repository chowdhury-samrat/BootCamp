Feature: Complete Fedex registration process

Scenario: Sucessfull login with valid User information
Given User Launch Chrome Browser
When User opens Fedex Registration page URL "https://www.fedex.com/fcl/web/jsp/contactInfo1.jsp?appName=oadr&locale=ca_en&step3URL=https%3A%2F%2Fwww.fedex.com%2Ffcl%2FExistingAccountFclStep3&afterwardsURL=https%3A%2F%2Fwww.fedex.com%2Ffcl%2Foptionhome&programIndicator=bb11030210"
When User enters following required information for registration
| Samrat | Chowdhury | xyz@gmail.com | xyz@gmail.com | 2672 Capitoll Hill Cres | Calgary | T3J2V9 | 4032232323 | samchy | Adi2Sam | Adi2Sam | bangladesh |
When User add remaining information for State, Country, Secret question
When User acknowledge Terms and Conditions and click on Create a user ID tab button
Then Complete registration on fedex portal


