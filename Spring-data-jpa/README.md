##Working screenshots:

<img width="879" height="440" alt="image" src="https://github.com/user-attachments/assets/60a5e612-b552-43c7-a9e8-58d8be6394e8" />

<img width="781" height="489" alt="image" src="https://github.com/user-attachments/assets/f32fdca4-71ce-45eb-b279-816bcd1435f4" />

<img width="775" height="235" alt="image" src="https://github.com/user-attachments/assets/a11124ce-b711-406e-bc70-8030461cb7dc" />

<img width="223" height="350" alt="image" src="https://github.com/user-attachments/assets/00fb9f82-8b16-405e-8350-96968335b36a" />


<img width="703" height="425" alt="image" src="https://github.com/user-attachments/assets/c85e170b-d816-401e-8a19-ada484142faa" />


# Java Persistence Technologies: JPA vs. Hibernate vs. Spring Data JPA

This document outlines the differences between **JPA**, **Hibernate**, and **Spring Data JPA**, clarifying how they relate to each other in the Java ecosystem.

---

## 1. Java Persistence API (JPA)

### Definition
JPA (Java Persistence API) is a standard specification (a set of rules and guidelines) for managing relational data in Java applications. It allows developers to store, retrieve, update, and delete Java objects in a database.

### Key Characteristics
* **Specification Only:** Defined by the Java community (JSR 338). 
* **No Implementation:** It only provides interfaces, metadata, and standards. It cannot perform database operations on its own.
* **Requires a Provider:** To use JPA, you must pair it with an ORM implementation (like Hibernate).
* **Common Elements:** Core annotations like `@Entity`, `@Table`, and `@Id` belong to the JPA specification.

---

## 2. Hibernate

### Definition
Hibernate is a fully functional Object-Relational Mapping (ORM) framework for Java. 

### Key Characteristics
* **JPA Provider:** It is the most popular implementation of the JPA specification.
* **Data Conversion:** Automatically converts Java objects into database tables and generates the required SQL queries.
* **Advanced Features:** Provides built-in session management, transaction handling, caching (first-level and second-level), and optimized query execution.
* **Manual Control:** In a standalone Hibernate setup, the developer manually manages low-level components like `Session`, `Transaction`, `Commit`, and `Close`.

---

## 3. Spring Data JPA

### Definition
Spring Data JPA is a specialized framework module within the Spring ecosystem built directly on top of the JPA standard.

### Key Characteristics
* **Abstraction Layer:** It does not implement JPA itself. Instead, it adds a layer of abstraction on top of a JPA provider (such as Hibernate).
* **Eliminates Boilerplate:** Removes repetitive data access code by providing ready-made repository interfaces like `JpaRepository` and `CrudRepository`.
* **Automated Operations:** Automatically generates standard CRUD database operations and handles complex transaction management behind the scenes.

---

## Summary Comparison Matrix

| Feature | JPA | Hibernate | Spring Data JPA |
| :--- | :--- | :--- | :--- |
| **Type** | Specification / Standard | ORM Framework / Implementation | Abstraction Layer / Spring Module |
| **Purpose** | Defines the rules for Java ORM | Implements the rules and runs SQL | Simplifies repository layer boilerplate |
| **Can run alone?** | No (Requires an implementation) | Yes | No (Requires JPA & Hibernate) |
| **Key Component** | `@Entity`, `@Id`, `EntityManager` | `SessionFactory`, `Session`, `Query` | `JpaRepository`, `CrudRepository` |


