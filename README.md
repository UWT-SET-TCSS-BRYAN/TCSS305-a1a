# TCSS 305 – Assignment 1a: Introduction

**UW Tacoma | Autumn 2026**

## Assignment Instructions

Full instructions available at:
https://cfb3.github.io/TCSS305-26-AUTUMN/assignments/a1a/

## Project Structure

```
a1a-<your-username>/
├── src/                          ← Source code
│   └── edu/uw/tcss/
│       ├── app/
│       │   └── StarterApplication.java
│       ├── model/
│       │   ├── Item.java             (interface - provided)
│       │   └── StoreItem.java        (implement this)
│       └── WRONG/                    (delete after verification)
│           ├── checkstyleRuleBreaker.java
│           └── InspectionTester.java
├── test/                         ← Unit tests
│   └── java/edu/uw/tcss/
│       ├── app/
│       │   └── StarterApplicationTest.java  (provided tests)
│       └── model/
│           └── StoreItemTest.java           (provided tests)
├── .idea/                        ← Checkstyle + inspection rules (do not edit)
├── .gitignore                    ← Files Git should not track
├── LICENSE                       ← Course license
├── README.md                     ← Links to assignment on course site
└── executive-summary.md          ← Your submission notes
```

## Running Tests

1. Open `StoreItemTest.java` or `StarterApplicationTest.java` in IntelliJ
2. Click the green play button next to the class name
3. All tests should pass when your implementation is complete

`StarterApplicationTest` covers `StarterApplication.isBlue`, which does **not** currently
satisfy its own description. Read the failures, then fix `isBlue`.
