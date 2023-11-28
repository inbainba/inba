Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the browser and maximise the window
When To launch url of fb application
And To click the create new account button

#One dimensional map data
And To pass firstname in firstname text box
#Key     value
|firstname1|inba|
|firstname2|ram |
|firstname3|raja|
|firstname4|jn  |


And To pass secondname in secondname text box
#Two dimensional map data
And To pass mobileno or email in email text box
|password1|password2|password3 |
|345654   |iniune   |jnkjn34   |
| 345654  |knkj     |dkjjnks354|
|fhdfgtr  |345ert   |dfhtre    |
|ert      |34543    |dfbhgfd   |


And To create new password using new password text box
Then To close the chrome browser


