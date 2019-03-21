@sanity
Feature: Login

In order to perform sucessful login
As a user
I want to enter correct username and password

#Scenario: In order to verify login to facebook
#		Given user navigates to facebook website
#		When  user validates the homepage title
#		Then  user entered "valid" username
#		And   user entered "valid" password
#	  Then  user "shouldbe" succesfully logged in

#Scenario: In order to verify login to facebook as Invalid user
#		Given user navigates to facebook website
#		When  user validates the homepage title
#		Then  user entered "invalid" username
#		And   user entered "invalid" password
#	  Then  user "shouldnot" succesfully logged in	  

# -------------------------------------------

#Scenario Outline: In order to verify login to facebook as Invalid user
#		Given user navigates to facebook website
#		When  user validates the homepage title
#		Then  user entered "<username>" username
#		And   user entered "<password> " password		
#	  Then  user "<logiType>" succesfully logged in	
#	  
#Examples:
#		| username | password | logiType |
#		| validUserName | validPassword | shouldbe |
#		| invalidUserName | invalidPassword | shouldnot |

# -------------------------------------------

Scenario Outline: In order to verify login to facebook as Invalid user
		Given user navigates to facebook website
		When  user validates the homepage title
		Then  user entered "<username>" username
		And   user entered "<password> " password
		And   user select the age category		
		| Age | Location |
		| below 18 | India |
		| above 18 | USA |
	  Then  user "<logiType>" succesfully logged in	
	  
Examples:
		| username | password | logiType |
		| validUserName | validPassword | shouldbe |
		| invalidUserName | invalidPassword | shouldnot |
		
		

