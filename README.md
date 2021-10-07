# DemoProject
Steps to Run:
Pull the code from git repository
Go to ->src->test->Java->step definition->Test Runner
Right click on Test Runner->select Run as Junit test

Steps to get the Report:
Go to target->My Reports->xml report
Note: Out of 3 the first test case is failed as the amount is not matching with the given amount.

Question 1:
We can verify if the user is getting any error message without entering any amount and clicking on "Workout how much i borrow" utton
We can verify what is the maximum amount user is able enter for all text box
We can verify scenario by changing the 'Application type', 'Property you would like to buy'

Question2:
If its a part of larger test set, we can reuse the code or we can build custom library. We can use Grouping and parameterization.

Question 3:
When test fails we can use pageloadTimeout. Or we can use explicit wait where driver will wait for certain condition to met before moving to next step.


