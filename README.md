

# Introduction
This is my homework for the interview of LogMeIn Automation developer position. It is a automation test project to test the web Calculator at http://output.jsbin.com/hudape/1/
	
## Description
- This java project utilize Seleinum+maven+TestNG. I use eclipse as my development IDE.
- To run it
	1. install eclipse
	2. install TestNG for eclipse
	3. open project in eclipse, right click test/testng-smoketest.xml, then select [Run As]->[TestNG Suite]
	4. test report can be found under test-output/index.html

## Test cases
- smoke 1: verify 1 + 2 = 3 and then delelte all
- smoke 2: verify 9 - 3 = 6 and then delelte all
- smoke 3: verify 4 * 5 = 20 and then delelte all
- smoke 4: verify 8 / 4 = 2;
- smoke 5: verify 7*1+6/2-0 = 10
- regression 1: verify 12*34+56/7=416
- regression 2: verify 78*19-46/23=1480
- regression 3: verify 99/3/11=3
- regression 4: verify 71*8=568;
- regression 5: verify 61-1-4=56
- regression 6: verify 45+4+5=54
- regression 7: verify 0/99=0
- regression 8: verify 9/0=Infinity
- regression 9: verify /=ERR

the test case and results can be found in CalculatorTestCases.xlsx

## Two bugs spotted in testing
Two test cases failed : 
- regression 3: verify 99/3/11=3 
	steps: input 99/3/11
	actual output: 3.193548387096774
	expected output: 3
- regression 4: verify 71*8=568
	steps: input 71*8
	actual output: 78
	expected output: 568



