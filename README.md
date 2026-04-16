# Stock Management System

This repository contains two parts:

* **Desktop Application** for inventory operations
* **Web Dashboard** for report visualization and analytics

Users can use either module separately or use both together.

---

## Repository Structure

* `Stock_Management_System` — desktop application
* `stock-report-web` — web dashboard

---

## Desktop Application

Folder: `Stock_Management_System`

### Main Functions

* Add products
* View products
* Sell products
* Auto-restock products
* Delete products
* Generate inventory and profit reports
* Create and manage the main inventory database

### Requirements

To run the desktop source code, users need:

* Java
* Maven
* JavaFX-compatible environment

### How to Run

#### Option 1: Run in an IDE

1. Open `Stock_Management_System` in IntelliJ IDEA or another Java IDE
2. Load the Maven project
3. Wait for dependencies to finish loading
4. Run the main application class

#### Option 2: Run with Maven

Open a terminal inside `Stock_Management_System` and run:

```
mvn clean javafx:run
```

### Desktop Database

The desktop application uses a local SQLite database file, typically named `inventory.db`.

If the database file does not exist, the application can create it automatically during runtime.

### Recommended Use

Use the desktop application if you want to perform full inventory operations and generate the working database.

---

## Web Dashboard

Folder: `stock-report-web`

### Main Functions

* Login and registration
* Summary cards
* Sales and profit charts
* Top product visualization
* Upload/select a `.db` file
* Dashboard-style report viewing

### Requirements

To run the web dashboard source code, users need:

* Java
* Maven

The web dashboard is built with Spring Boot, so it must be run locally from source.

### How to Run

#### Option 1: Run in an IDE

1. Open `stock-report-web` in IntelliJ IDEA or another Java IDE
2. Load the Maven project
3. Wait for dependencies to finish loading
4. Run the Spring Boot main application class

#### Option 2: Run with Maven

Open a terminal inside `stock-report-web` and run:

```
mvn spring-boot:run
```

Then open:

```
http://localhost:8080
```

### Default Login

When initialized for the first time, the web module creates a default admin account:

* username: `admin`
* password: `admin123`

Users can also register a new account from the register page.

### Database Usage

The web dashboard reads a selected desktop-generated SQLite database file and displays the data visually.

Typical workflow:

1. Run the desktop application
2. Create or update inventory and sales data
3. Run the web dashboard
4. Log in
5. Upload/select the generated `.db` file
6. View the charts and report summary

### Recommended Use

Use the web dashboard if you want to visualize report data in a more modern and interactive format.

---

## Which Part Requires Java?

### Web Dashboard

The web dashboard source code requires Java and Maven.

### Desktop Application

The desktop source code also requires Java, Maven, and JavaFX.

If a packaged desktop version is distributed separately in the future, end users would not need to compile the source code manually.

---

## Recommended Usage

* Use `Stock_Management_System` for inventory operations
* Use `stock-report-web` for report visualization
* Use both together for the full workflow

---

## Notes

* Runtime-generated files such as databases, temporary files, and build outputs are not required for source distribution
* The desktop application is the main database producer
* The web dashboard is the main visualization interface

---

## Summary

This project combines:

* a desktop stock management system
* a web dashboard for report analytics

Use the desktop module to manage products and sales.
Use the web module to visualize database records in charts and summary cards.
