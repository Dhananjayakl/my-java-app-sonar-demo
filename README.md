markdown# My Java App — SonarCloud CI/CD Demo

![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-white.svg)

## Overview

This project demonstrates how to integrate **SonarCloud** with **GitHub Actions** for continuous code quality analysis on a Java Maven project.

---

## Tech Stack

- Java 17
- Maven
- JUnit 4
- JaCoCo (Code Coverage)
- SonarCloud (Code Quality)
- GitHub Actions (CI/CD)

---

## Project Structure
my-java-app/
├── .github/
│   └── workflows/
│       └── sonar.yml
├── src/
│   ├── main/java/com/example/
│   │   ├── Calculator.java
│   │   └── UserService.java
│   └── test/java/com/example/
│       └── CalculatorTest.java
├── pom.xml
├── sonar-project.properties
└── README.md

---

## CI/CD Pipeline

The GitHub Actions workflow triggers on every push or pull request to `main` and `develop` branches.

### Pipeline Steps

1. Checkout source code
2. Set up JDK 17
3. Cache Maven and SonarCloud packages
4. Build and run tests (`mvn clean verify`)
5. Run SonarCloud analysis (`mvn sonar:sonar`)

---

## SonarCloud Analysis

SonarCloud scans the code for:

- **Bugs** — Code that is clearly wrong or will cause runtime errors
- **Vulnerabilities** — Security issues that can be exploited
- **Security Hotspots** — Code that needs manual security review
- **Code Smells** — Maintainability issues that make code harder to understand
- **Code Coverage** — Percentage of code covered by unit tests
- **Duplications** — Repeated blocks of code

---

## Quality Gate

The project uses SonarCloud's default Quality Gate. The pipeline will **fail** if:

- New bugs are introduced
- New vulnerabilities are found
- Code coverage drops below threshold
- Code smells exceed acceptable limit

---

## How to Run Locally

### Prerequisites
- Java 17+
- Maven 3.8+

### Build and Test

```bash
mvn clean verify
```

### Run Sonar Analysis Locally

```bash
mvn sonar:sonar \
  -Dsonar.projectKey=your_project_key \
  -Dsonar.organization=your_organization_key \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.token=your_sonar_token
```

---

## GitHub Secrets Required

| Secret Name | Description |
|---|---|
| `SONAR_TOKEN` | Authentication token from SonarCloud |

> Go to **GitHub Repo → Settings → Secrets and variables → Actions** to add the secret.

---

## Demo Scenarios

### Scenario 1 — Clean Code
Push the clean version of the code and observe SonarCloud Quality Gate **passing** with zero issues.

### Scenario 2 — Buggy Code
Push the buggy version of the code and observe SonarCloud detecting the following issues:

| Issue | Type | Severity |
|---|---|---|
| Hardcoded password | Security Hotspot | Critical |
| Integer division loses precision | Bug | Major |
| Empty catch block | Code Smell | Major |
| String compared with == | Bug | Major |
| Unused local variable | Code Smell | Minor |
| Unused private method | Code Smell | Minor |
| Public field instead of private | Code Smell | Minor |
| Null pointer risk | Bug | Major |
| Returning null instead of Optional | Code Smell | Minor |
| Duplicated lines | Code Smell | Minor |
| System.out instead of logger | Code Smell | Minor |
| High cognitive complexity | Code Smell | Major |

### Scenario 3 — Fixed Code
Fix all the issues flagged by SonarCloud and push again to see the Quality Gate **pass**.

---

## SonarCloud Dashboard

View the full analysis report on SonarCloud:  
🔗 [https://sonarcloud.io/project/overview?id=your_project_key](https://sonarcloud.io/project/overview?id=your_project_key)

---

## License

This project is for demonstration purposes only.