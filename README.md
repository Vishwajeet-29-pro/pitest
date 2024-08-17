# JavaDsaWithTest

This repository demonstrates the integration of PIT (Pitest) for mutation testing along with unit testing using JUnit 5 and Mockito.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Running Tests](#running-tests)
- [Mutation Testing](#mutation-testing)
- [Reports](#reports)

## Introduction

This project showcases the implementation of data structure algorithms in Java with corresponding unit tests. Mutation testing is integrated using PIT to ensure the effectiveness of the test cases. The project uses Gradle for dependency management and build automation.

## Prerequisites

- Java 21
- Gradle 7.2 or higher

## Project Structure

```plaintext
JavaDsaWithTest/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── example/
│   └── test/
│       └── java/
│           └── org/
│               └── example/
├── build.gradle.kts
└── settings.gradle.kts
```
## Dependencies
The key dependencies used in this project are:

JUnit 5 for unit testing.
Mockito for mocking in unit tests.
PIT for mutation testing.
Refer to the build.gradle file for the complete list of dependencies.

## Running Tests
To run the tests using JUnit 5:

```
./gradlew clean test
```

## Mutation Testing
Mutation testing is performed using PIT, which evaluates the quality of your test cases by introducing small changes 
(mutations) into your code and checking if the tests fail.

To run the mutation tests:

```
./gradlew clean pitest
```

## Reports
The mutation testing results are generated as an HTML report. You can find the report in the following directory:

```
build/reports/pitest/
```
Open the index.html file in your browser to view the mutation testing results.