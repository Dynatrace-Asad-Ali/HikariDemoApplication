# HikariDemoApplication
---

This demo application uses Springboot v2 and connects to MySQL database to retrieve data. The main purpose of this demo app is to demonstrate the usage of JMX metrics in the springboot app as it relates to Hikari db pool. In order to use this demo app, a MySql database is required. This database can be on a local machine or in the cloud. Once the MySql server is provisioned, please create a database using the following command:

```$xslt
create database testdb;
```

Once the database is created, please create a table called employee using the following command:

```$xslt
create table employee (empid int null, empname varchar20) null);
```

Insert dummy data into the employee table

```$xslt
insert into employee (101, 'John');
```


Once all the components of the database are in place, build the springboot application

```$xslt
mvn clean package
```

Once succesfully built, run the application

```$xslt
java -jar target/hikari-demo-project-0.0.1-SNAPSHOT.jar &
```

Once the app is up and running, you can test the app from a local brower or using wget command

```$xslt
http://localhost:8080/getemployee
```


