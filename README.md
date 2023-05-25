# CrudApiExercise

Repository https://github.com/Dsuraj17/CrudApiExercise.git

1.	Import project into eclipse
          • File -> Import -> Maven -> Existing Maven Projects -> Browse Project from      cloned location (task)
          • Create a pull request for 'master' on GitHub by visiting: https://github.com/Dsuraj17/CrudApiExercise/pull/new/master

2.	Right click on project in eclipse and then Maven -> Update Projects

3.	Update database credential and other configuration into application.properties available in src/main/java/resources
          spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
          spring.datasource.url=jdbc:mysql://localhost:3306/crudapi?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
          spring.datasource.username=root
          spring.datasource.password=
          spring.jpa.show-sql=true
          spring.jpa.hibernate.ddl-auto=update
          spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
          server.port=9090
          
          •	Create a table in your database – crudapi

          •	Change mysql username and password as per your installation
          open src/main/resources/application.properties
          change spring.datasource.username and spring.datasource.password 
          as per your mysql installation

          •	Build and run the app using maven
          mvn package-
          java -jar target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar
          Alternatively, you can run the app without packaging it using –
          mvn spring-boot:run

          •	The app will start running at http://localhost:9090/

4.	Right click on Application.java file and run as Java Application
Once Sprint Boot Application will be started successfully then we

          •	can call following Endpoints by using POSTMAN

5.	To get Student call following endpoint with GET Request type in postman

          •	To get List of students- http://localhost:9090/students
          •	To get by id- http://localhost:9090/student/{Id}

6.	To Create New Student use following url with POST Request type in postman

          •	To add a Student- http://localhost:9090/student

            	set content type as in header as application/json
            	set request body as raw with JSON payload
            {
                "id": 1,
                "name": "Rajesh",
                "age": 21,
                "phone": 1234567890,
                "status": 1,
                "created": "2023-05-25",
                "modified": "2023-05-25"
            }

7.	To update Student in database, use following url with PUT Request type in postman

          •	Set request body as raw with JSON payload
          {
                "id": 1,
                "name": "Shubham",
                "age": 28,
                "phone": 7854825294,
                "status": 1,
                "created": "2023-05-25",
                "modified": "2023-05-25"
          }
          •	To Update - http://localhost:9090/student/{id}
          •	set content type as in header as application/json


8.	To delete a particular Student from database, use following url with DELETE Request type in postman

          •	To Delete -http://localhost:9090/student/{id}

Note - Replace with actual id


