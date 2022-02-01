# InvestecUI

On this framework BDD is implemented
Under the source folder we have packages 'Core', 'Page Objects' and 'Tools'
In the 'Core' package there's a Base.java class which sets up the Selenium WedDriver. Page Objects are also initialized here.
In the Page Objects package, here we have 'InvestecSearchPO.java and InvestecSignUp.java' which are the page objects.

Under the test folder we have packages: 'features, Runners and StepsDef'
In the feature package we have the .feature file which has all the steps which needs to be performed, this is the BDD approach
In the StepsDef package, here is a  small piece of code with a pattern attached to it or in other words a Step Definition is a java method in a class with an annotation above it. tis StepDef is linked to the feature file.
Finally Runner package, the class under this package executes our test cases by call both feature abd stepsdef packages.
