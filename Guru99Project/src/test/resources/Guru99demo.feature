Feature: Validate the Guru99 login page
Scenario: Validate the Guru99 using invalide login and invalide password
Given User navigate the Guru99 URL
When User enter invalide user name and invalide password
And User enter login Button
Then User validate error message After login