#Author: your.email@your.domain.com
#Keywords Summary :

Feature: email functionality

	Background: navigation to correct url
	Given the user navigates to the correct url 
	And the loaded page displays current title "Let's Talk Tea"


Scenario Outline: the user is unable to send email 
  And the form displays name label with mandatory asterisk
  And the form displays email label with mandatory asterisk
  And the form displays subject label with mandatory asterisk
  And the form displays message label with mandatory asterisk
  When the user enters name <name> email <email> subject <subject> and message <message> in empty input fields
  Then name <name> email <email> subject <subject> and message <message> details are visible in fields
  Then the user confirms email not sent upon clicking submit button 
  
  
  Examples:
|name    | email          | subject           | message           |
|Michael | mike@gmail.com | automation Testing| It is a great day |

  
  
 

  
  
  	
