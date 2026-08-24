# TCSS 305 – Assignment 1a: Introduction

**UW Tacoma | Autumn 2026**

## Assignment Instructions

Full instructions available at:
https://cfb3.github.io/TCSS305-26-AUTUMN/assignments/a1a/

## Project Structure

```
src/edu/uw/tcss/
├── app/
│   └── StarterApplication.java
└── model/
    ├── Item.java          (interface - do not modify)
    └── StoreItem.java     (implement this)

test/java/edu/uw/tcss/
├── app/
│   └── StarterApplicationTest.java  (do not modify)
└── model/
    └── StoreItemTest.java           (do not modify)

project root/
├── executive-summary.md   (your submission notes)
└── README.md              (this file)
```

## Running Tests

1. Open `StoreItemTest.java` or `StarterApplicationTest.java` in IntelliJ
2. Click the green play button next to the class name
3. All tests should pass when your implementation is complete

`StarterApplicationTest` covers `StarterApplication.isBlue`, which does **not** currently
satisfy its own description. Read the failures, then fix `isBlue`.
