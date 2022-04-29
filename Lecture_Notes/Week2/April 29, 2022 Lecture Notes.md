# April 29, 2022 Lecture Notes

## Multiplicity/Cardinality
Describes the relationships between entities on any given database. This is how we describe the cardinality/number of instances that can be associated with instances of another.

> Table A to Table B relationship descriptions

### Types of multiplicity
**1:1 (one-to-one)** - for one instance it can be associated with one other instance of a different entity.

> ex. person to SSN

**1:M (one-to-many / many-to-one)**

> ex. Teacher to students
For any one teacher, they can be associated to may students

**M:M (many-to-many)**

> ex. students to courses
> For many students, they have a number of courses.

**Why multiplicity in databases?**

* Establish referential integrity between our tables
* Reduce data reducdancy
* Strengthen the normalization of our tables

<hr/>

### What is a transaction?
A unit of work that is performed against a databaes.

> Each unit of work follows A.C.I.D.

**A**tomicity - all operations are performed successfully or not at all.
**C**onsitency - ensures the database changes state immediatelyafter a successful commit
**I**solated - Each unit of wor is performed independently of other transactions.
**D**urability - Results/Effects of a committed transaction persists in case of a system failure.

In order to prevent the following read phenomenas transactions have different isolation levels:

* **Dirty Read** - when a transaction reads data that has yet to be committed.
* **Non Repeatable Read** - Occurs when a transaction reads the same row twice but gets different values each time.
* **Phantom Read** - When two of the same queries are executed, but the rows retreived by each are different.

Transactions have isolation levels as follows:

* **Read uncommitted** (lowest level)
 * Ine transaction may not read not yet committed changes made by other transactions
 * Threfore transactions are not isolated from each other on this level and all read  phenomenas can occur. 
* **Read committed**
	* Ensures that all data read is committed as the moment that it is read.
	* Prevents dirty reads from occurring, but not non-repeatable reads or phantoms reads.
* **Repeatable Read** (most restrictive)
	* Transactions hold read locks on all rows it references and write locks on references rows on any type of update/delete operations
	* Prevents dirty reads and non-repeatable reads but doens't stop phantom reads from ccurring
* **Serialize** (highest level)
	* Guarantees an execution of operations to be concurrent and serially executed.
	* Prevents all the phenomenona from occurring.
