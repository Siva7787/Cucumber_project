@sanity
Feature: feature to test google search

@smoke
Scenario Outline: verify google search box

Given user on google search page
When user enters search <item> in search box
And clics on the search button
Then user able to get perticular serch information

Examples:
|item|
|shiva|
|flowers|
|freejobalert|
