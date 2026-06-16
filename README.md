# Financial Calculators

A Java console application with multiple financial calculators — including a mortgage calculator, annuity calculator, and future value calculator.

## About This Project

Created at **Year Up United — Learn to Code Academy (LTCA)** as a more advanced Java exercise. This project introduced financial math formulas and taught me how to structure an application with multiple specialized calculators using a shared interface.

## What I Learned

- Implementing real financial formulas (mortgage, annuity, future value) in code
- Using `Math.pow()` for compound interest calculations
- Formatting currency output with `printf` and `%,.2f`
- Organizing multiple calculators behind a shared `FinancialCalculator` class
- Building modular methods (`mortgageCalculator`, `mortgageTotalInterestCalculator`) that can be reused and tested independently

## How to Run

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

## Features

- **Mortgage Calculator** — computes monthly payment and total interest
- **Annuity Calculator** — calculates present/future value of annuity payments
- **Future Value Calculator** — determines the future value of an investment

## Tech Stack

- **Java**
- **Maven**
- **IntelliJ IDEA**
