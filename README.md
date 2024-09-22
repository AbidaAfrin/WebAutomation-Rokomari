# WebAutomation-Rokomari
 Rokomari website automation with selenium

## 💻Technology Used
- **Programming Language**: Java
- **Browser Automation**: Selenium Webdriver
- **Test Runner**: TestNG Framework
- **IDE**: Intellij idea
- **Test Reporting Tool**: Allure

## 📝Automation Step:
1. Sign Up using Google
2. Select লেখক from the menu
3. Select হুমায়ুন আহমেদ
4. Filter Categories like সমকালীন উপন্যাস, রচনা সংকলন ও সমগ্র
5. Scroll Down and go to Next Page (IF Have)
6. Add to the cart any book
7. Click Cart Icon
8. Go to the Shipping page
9. Provide your Shipping Information
10. Log out

## 📋Steps to Implement the Test Suite:
1. Clone the repository
2. Open the project in an IDE (Intellij, Eclipse etc.)
3. Use Maven for dependency management and project structure: Add the Selenium, TestNG, Dotenv and allure dependencies to your pom.xml.
4. Run the tests

## ⚠️Warning
You have to provide your own Email address and Password.

## 📜 Generate Test Report
Write the following code in the Terminal:
```bash
  allure generate ./allure-results/ --clean 
```
This command generates the Allure report from the ./allure-results/ folder and cleans up any previous reports.
```bash
  allure open ./allure-report/
```
This command opens the generated Allure report from the ./allure-report/ folder in the default web browser.

These commands are typically used after running the tests to view the generated Allure reports.