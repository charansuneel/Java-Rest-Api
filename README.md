# Java-Rest-Api
REST API (Representational State Transfer Application Programming Interface) is a technology that connect client to the servers. Upon requesting the servlet return the data in XML/JSON format. Here the servlet will send the state of the object so it is called rest. We can perform CRUD operation with the help of HTTP methods (Create - POST, Read - GET, Update - PUT, Delete - DELETE).

### Requirments
1. Java
2. Mongodb
3. Postman

## How to run
1. Run the TaskManagerApplication.java file of com.example.taskmanager package in the src/main/java folder.
2. To get all the tasks, Copy the url :-  http://localhost:8081/api/tasks and paste it in postman url box and change the request to get and then upon clicking the send button you will get all tasks info.
3. To create a task, Copy the url :-  http://localhost:8081/api and paste it in postman url box and change the request to put
   * Click on body below the url box
   * Select the raw format
   * copy paste the sample JSON data in the below text area. 
       sample data : {
“name”: ”install linux”,
“id”: “124”,
“assignee”:”John Smith”,
“project”:”Kaiburr”,
“startTime”: “2023-04-21 15:51:42.276Z”
}
   * And then upon clicking the send button you can see ok response (if data is updated successfully in database) or an error in case of unsuccessfull attempt.

4. To delete a task, Copy the url :-  http://localhost:8081/api/{id}
    * Replace the id by the task id
    * Paste it in postman url box and change the request to delete
    * Upon clicking the the send button you can see ok response (if data is updated successfully in database) or an error in case of unsuccessfull attempt.
5. To get task by name, Copy the url :-  http://localhost:8081/api/findByName/{name}
    * Replace the name with a part of task name(substring) that you are searching for ex: assignment
    * Paste it in postman url box and change the request to get
    * Upon clicking the the send button you can see all the tasks that are containing the assignment in their task name.
6. To get task by assignee, Copy the url :-  http://localhost:8081/api/findByAssignee/{assignee}
    * Replace the assignee with the assignee name that you are searching for ex: John Smith
    * Paste it in postman url box and change the request to get
    * Upon clicking the the send button you can see the top 10 tasks that are assigned by John Smith (sorted by starttime).
  
   
 
