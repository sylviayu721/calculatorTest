

# Framework to Test A Basic Arithmetic Calculator User Interface
	
## Description
- Based on Calculator User Interface, I chose to use front end testing framework (Java+Seleinum+maven+TestNG);
- The project has 3 parts:
	- com.calculator.page contains one basic WebPage parent Class in which 3 basic common methods are defined, such as clickElement,verifyElementVisible and verifyElementText. CalculatorPage class be children class, in which specific methods will be defined, such as click every button and verify the result.
	
	- com.calculator.test contains one basic TCBase parent Class, in which two methods are defined, such as beforeTest and AfterTest. Calculator Children Class define all smoke and regression test cases.

	- com.calculator.utils contains methods and functions to write logs and read and load property file - Page_properties.json

## Two big bugs
Bug 1:when divisor number start from 1 and equal or more than two bits numbers will fail.
for example: 9/11, 9/12, 9/130 etc.

Bug 2:when Multiplicand number is equal or more than two bits and the last number is 1, then Multiplication function will fail.
for example: 21*3, 51*3, 621*3 etc.

## Attached AutomationTestResult.xls

