# connecting-java-mysql
Connecting Java with MySQL DB. Using Maven for project dependencies, Spring JPA Repositories for MVC abstraction 
<br/>
<br/>
This demo/test is meant to display the abstractions possible while connecting a Java application to a database (here MySQL) 
<br/>
The application connects to the MySQL DB financial_data
<br/>
<br/>
<br/>

- Use command to add a new index_composition to the database

$ curl localhost:8080/demoJulien/add -d closePrice=6000 -d composition=40 -d indexName=CAC40 -d instrumentID=LVMH -d validFrom=2021-03-29 -d valideTo=2021-03-30 -d weight=0.01
<br/>
<br/>
<br/>

- Use command to fetch all the index_composition objects from the database

$ curl 'localhost:8080/demoJulien/all'
<br/>
<br/>
<br/>
<br/>




The index_composition table structure :

CREATE TABLE index_composition (<br/>
	id integer NOT NULL,<br/>
	close_price numeric(50,30) NULL,<br/>
	composition numeric(50,30) NULL,<br/>
	index_name varchar(255) NULL,<br/>
	instrument_id varchar(255) NULL,<br/>
	valid_from date NULL,<br/>
	valid_to date NULL,<br/>
	weight numeric(50,30) NULL<br/>
);
