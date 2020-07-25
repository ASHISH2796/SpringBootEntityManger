# SpringBootEntityManger
Spring Boot Example with Entity Manger
 Example of Using EntityManager for Adding data and fetching daa from dB have used H2 DB so no need to add Db config detail in application.properties
 Used EmployeeBootstarp componet to load data in db on Server Start.
 to verify http://localhost:8080/getEmployee
 have not added an UI level file we can check data insert and fetch in server console log
 
 
 Eg :2020-07-25 18:01:27.461  INFO 13664 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
BootStraping data....
Ashish Id : 1
Ashish Id : 2
Ashish Id : 3
Ashish Id : 4
2020-07-25 18:01:27.844  INFO 13664 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-07-25 18:01:27.844  INFO 13664 --- [           main] c.s.e.SpringBootEntityManagerApplication : Started SpringBootEntityManagerApplication in 4.774 seconds (JVM running for 6.974)
2020-07-25 18:02:04.044  INFO 13664 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2020-07-25 18:02:04.044  INFO 13664 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2020-07-25 18:02:04.056  INFO 13664 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 12 ms
[Employee [id=1, name=Ashish, designation=SDE], Employee [id=2, name=Rakesh, designation=Tester], Employee [id=3, name=Akash, designation=Analyst], Employee [id=4, name=Job, designation=SDE]]

 
