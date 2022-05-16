> _Note: Combined + Reorganized notes from lecture, etc... NOT finished._ 
<hr>

### Database 
- an organized collection of data, stored in an organized format
- Allows us to input, manage, organize, and retrieve data quickly
- Traditionally organized into tables with records (rows) and fields (columns)
- Data = intersection between rows and columns

### RDBMS: Relational Database Management System**
- A database management system that upholds specified relationships between tables
- It includes functions that maintain the security, accuracy, integrity, and consistency of the data
- accessed using **SQL (Structured Query Language)**, the standard language for relational database sytems. 
    - several different dialects of SQL include 
        - MySQL
        - PostgreSQL
        - OracleSQL
        - Microsoft SQL Server
<hr>

### Cardinality
Cardinality describes the numerical relationship between 2 tables. Types of cardinality: 
- **1 : 1 (one to one)**
    - Individual records are associated with only 1 other record
    - Can be created by using a primary key and a unique foreign key
    - Ex: Social Security
- **1 : n** or **n : 1** (**1 to many** or **many to 1**)
    - Individual records in one table are associated with many records in the other (1 way)
    - A primary key linked to a non-unique foreign key
    - Ex: Beehive to bees
- **n : n (many to many)**
    - Records in both tables are associated with many records in the other (2 way)
    - This is best represented using a join table
    - Ex: Students and courses

<hr>

### Normalization
Database Normalizatio is a design pattern for databases that aims to reduce both duplicate data and redundancy (all our data in our db is structured with referential integriy) 
- it ensures _referential integrity_ (Establishing relationships between tables through use of PKs and FKs is called "referential integrity")

**Levels of Normalization**  

0. 0 Normal Form: No normalization
    - a single mass of chaos as your database (you have everything in one table)
1. 1st Normal Form: All data must be atomic, and should have a unique identifier (has PKs)
    - _Atomic Data_: Data that has been broken down into the smallest possible unit
2. 2nd Normal Form: In 1st NF in addition to having no partial dependencies 
    - Which means all values must identified by a single column (no composite keys)
    - there should not be any field with any table that can qualify as a candidate key
   	- candidate keys are unique and not null columns that can become a primary key
3. 3rd Normal Form: In 2nd NF in addition to having no transitive dependencies
    - Which means no column is dependent on a column that is not the primary key
    - should be no composite keys (if you do have this, then you need to make an additional table aka split current table into two)
	- ensure that there is no reduction of data duplication by having solid foreign key relationships



<hr>

## SQL (Structured Query Language)
### **Sublanguages**
![SQL Sublangauges](https://media.geeksforgeeks.org/wp-content/uploads/20210920153429/new.png)
1. Data Definition Language (DDL) 
    - A sublanguage for creation/alteration of table structure
    - Commands: CREATE, ALTER, DROP, TRUNCATE
2. Data Manipulation Language (DML) 
    - Pertains to the changing/modification of the data within a table
    - Commands: INSERT, SELECT, UPDATE, DELETE
    - Referred to as CRUD operations (Create, Read, Update, Delete)
3. Data Query Language (DQL)
    - Kind of a sublanguage, depends on who you talk to
    - Only 1 command: SELECT
4. Data Control Language (DCL)
    - Regulates access to data (provides security) by imposing restrictions like user permissions
    - Commands: GRANT, REVOKE
5. Transaction Control Language (TCL) 
    - Pertaining to work on the database and finalizing or reverting changes
    - Commands: COMMIT (persist data), ROLLBACK (revert data), SAVEPOINT, SET TRANSACTION (used to set isolation level)

### **Constraints**
SQL constraints are used to specify rules for the data in a table. They limit the type of data that can go into a table, ensuring the accuracy and reliability of the data in the table. If there is any violation between the constraint and the data action, the action is aborted.

**6 kinds:**
1. **Primary Key:** Data in this column(s) is unique, not null, and uniquely identifies all records in the table
2. **Foreign Key:** Any column(s) in a table referencing a primary key in another table
    - Establishes relationship between 2 columns in the same table or between different tables
3. **Unique:** No duplicate values
    - Null is not counted, you can still have multiple nulls
4. **Not Null:** Make sure a column does not contain null values
5. **Default:** Will default the column to some specified value of your choosing
6. **Check:** Adds an extra condition on inserted data (like x > 5)

### **Joins**
Join tables are useful in describing many to many relationships (refer to [Cardinality](#cardinality))
- A "**join**" operation is what we use to bring the data of two tables together
- Several types of joins:  
    - _Inner Join_: Only shows records with the compared value existing in both tables  
    - _Full Outer Join_: Fully join all tables together, substituting nulls where data is absent
    - _Left/Right Join_: All data from the left/right table paired with the other and substituting nulls where necessary
    - _Cross Join_: Cartesian cross product of recrods from both tables, so you get a list of permutations from the tables
    - _Self Join_: Any join that acts on only 1 table

```
SELECT <columns> FROM <left> <JOIN TYPE> JOIN <right>
ON <left.column> = <right.column>;
```


### **SQL Basic Commands**
```
CREATE TABLE employee (
  employee_id SERIAL PRIMARY KEY,
  first_name VARCHAR (50) NOT NULL,
  last_name VARCHAR (50) NOT NULL,
  email VARCHAR (55) UNIQUE NOT NULL DEFAULT 'N/A',
  salary INTEGER NOT NULL
);

INSERT INTO employee (first_name, last_name, salary)
  VALUES ('John', 'Smith', 50000);
INSERT INTO employee (first_name, last_name, email, salary)
  VALUES ('Jane', 'Doe', 'jane.doe@gmail.com', 150000);

SELECT * FROM employee;
SELECT first_name, last_name FROM employee;

SELECT first_name || ' ' || last_name FROM employee
  WHERE salary > 100000;

UPDATE employee SET email = 'email2@work.com'
  WHERE first_name = 'John' AND last_name = 'Smith';
```


### Subqueries 
Subqueries (aka nested queries) are combined SQL statements that can be used within WHERE clauses, column selector list, FROM clause 

### Views 
- When we execute a query, we generate a result set.
    - Sometimes we may frequently use that result set as a base for executing other queries.
- **Views** are just the result sets of saved queries that have a name and can be referenced by other queries.
    - Views act as a sort of "virtual table".