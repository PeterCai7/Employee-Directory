# Employee-Directory
This is an app for Employee Directory based on Spring REST and Hibernate.

---

### Development Process 
1. Set up Database Dev Environment. 2.Create Spring Boot project using Spring Initializer. 3. Get list of employees and so on.

### Application Architecture

png comming soon...

### Integrating Hibernate and JPA

- Manual configuration is error-prone and easy to make simple mistakes. Spring boot can rescue this once you have those entries in place, JDBC Driver: mysql-connector-java, Spring Data(ORM): spring-boot-starter-data-jpa. Then you should just put your DB connection info in application.properties.

- Java Persistence API (JPA): Only a specification, a set of interfaces and requires an implementation to be usable.

- Vendor Implementations: Hibernate, EclipseLink;

- Benefits of JPA: You are not locked to vendor's implementation. Maintain portable, flexible code by coding to JPA interface.

- Auto Data Source Configuration: In Spring Boot, Hibernate is default implementation of JPA. EntityMnager is similar to Hibernate SessionFactory and serve as a wrapper for a session object.

### DAO Techniques

- Version 1: Use EntityManager but leverage native Hibernate API.
- Version 2: Use EntityManager and standard JPA API.
- Version 3: Spring Data JPA.


