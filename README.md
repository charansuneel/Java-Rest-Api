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

### Refer below images for easy understanding
1. Running the java server via eclipse ide.
    
    ![Screenshot (12)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/ebd4915a-c401-4349-aa05-2ab2b8cdbfb7)

2. Open the postman platform.
    
    ![Screenshot (13)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/231089b8-ccc6-4d64-aabc-3e363e43e79d)
    
3. Intially the database is empty.
    
    ![Screenshot (14)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/14ceeaa1-d51f-4c2a-b93b-5e186ac9f36e)

   After some updations to the data base.

    ![Screenshot (21)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/fbf21579-6ea8-4b48-951e-fa635e366b54)

    
4. Creating the task using put method.

    ![Screenshot (20)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/61e03487-f4ce-4c48-a852-f16be7dca695)


5. Deleting the task using delete method.

    ![Screenshot (19)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/68f45889-f2c2-4400-9df4-3f12feae9cbf)

6. Searching by task name.

    ![Screenshot (22)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/8a3253b5-2073-4179-9cd5-17c1babea2d2)

7. showing top 10 records of John Smith as assignee in sorted order by time.

    ![Screenshot (23)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/6cb43612-3e96-43ff-a59a-22a9e211fec8)

   showing top 10 records of John as assignee in sorted order by time.
    
    ![Screenshot (24)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/98d9f5ba-df28-4073-9109-109a7befdb17)


You can also see your database in mongodb compass.

![Screenshot (25)](https://github.com/charansuneel/Java-Rest-Api/assets/96193782/788cc27c-4ce6-45ad-8b66-5daac5a25d00)

  

  
   
 
