Feature: Search autocomplete suggestions

Scenario Outline: Auto-suggestions should appear in searchbar.

Given I am on the homepage
When I type <text>
Then <results> should appear in autocomplete suggestions

Examples:
|text|results|
|laptop|laptop computer|
|mac|macbook| 