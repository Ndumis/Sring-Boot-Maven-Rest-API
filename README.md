# Sring-Boot-Maven-Rest-API

Create a maven spring boot application with four restful operations.  
The four operations should be a put, post, get, delete.  

1. Put - The put function should take a user object as a @RequestBody with the following fields - firstName, lastName, contactNumber and write this user object into a file  
2. Post - The post function should take a user object as a @RequestBody and update the file with new user details. 
3. Get - The get function to return the user object from the file. 
4. Delete - The delete function should delete the  user file. 5. Store the project in a git repository and push the git repository to bitbucket or GitHub and share the repository with us.  

Important Note: All the operations should save and retrieve data from a file not a database

****************************************************************************************************************************************************************************
Database is called user.accdb.

Located with the project file.

Make sure to change application.properties under resource folder. The url should point to your project location.

*******************************************************************************************************************************************************************************
Functions
*******************************************************************************************************************************************************************************
GET: http://localhost:8080/user/

POST: http://localhost:8080/add/
{
	"firstName": "",
	"lastName": "",
	"contactNumber": ""
}

PUT: http://localhost:8080/update/id
{
	"firstName": "",
	"lastName": "",
	"contactNumber": ""
}

DELETE: http://localhost:8080/delete/id
