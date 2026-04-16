# Stock Management System

This repository contains two modules:

- **Stock_Management_System** — desktop application
- **stock-report-web** — web dashboard

A ready-to-use `.exe` desktop release is also available in the **Releases** section on the right side of the repository page.

---

## Desktop Application

Folder: `Stock_Management_System`

Main functions:

- Add products
- View products
- Sell products
- Auto-restock products
- Delete products
- Generate inventory and profit reports
- Create and manage the main inventory database

Requirements:

- Java
- Maven
- JavaFX-compatible environment

Run with Maven:

    mvn clean javafx:run

Use this module for full inventory operations and database generation.

---

## Web Dashboard

Folder: `stock-report-web`

Main functions:

- Login and registration
- Summary cards
- Sales and profit charts
- Top product visualization
- Upload/select a `.db` file
- Dashboard-style report viewing

Requirements:

- Java
- Maven

Run with Maven:

    mvn spring-boot:run

Then open:

    http://localhost:8080

Default login:

- username: `admin`
- password: `admin123`

Use this module to visualize report data from a desktop-generated database file.

---

## Recommended Workflow

1. Run the desktop application
2. Create or update inventory and sales data
3. Run the web dashboard
4. Log in
5. Upload/select the generated `.db` file
6. View charts and summary data

---

## Notes

- The desktop module is the main inventory management system
- The web module is the visualization and analytics dashboard
- Runtime-generated files such as databases and build outputs are not required for source distribution
