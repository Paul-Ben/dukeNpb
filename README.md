# dukeNpb
# Statement of result generation application.
## This is a spring boot application built for a generation of statement of results for a tertiary institution.
## Features:
- List of Student Statement
- Add Statement module
- View Statement of result
- Bulk upload Statements
- Search statement by Matric number

![Screenshot from 2024-04-04 21-29-39](https://github.com/Paul-Ben/dukeNpb/assets/92761584/feaeaf2a-6777-447e-8a60-c8953010c323)
  
![Screenshot from 2024-04-04 21-30-47](https://github.com/Paul-Ben/dukeNpb/assets/92761584/b85e8a56-008f-4ec4-9ebf-6e0c0003ce38)
![Screenshot from 2024-04-04 21-30-27](https://github.com/Paul-Ben/dukeNpb/assets/92761584/6a394c99-f0ef-41dd-8ef1-92fef8e2b380)
![Screenshot from 2024-04-04 21-30-04](https://github.com/Paul-Ben/dukeNpb/assets/92761584/92137d00-66e7-4ab4-85fb-082f0a2b2bc7)

## How to use:
1. Clone the repository to your local computer with the git clone command or download and extract the zip file to your computer
2. Navigate to the folder in rstatement/src/resources and edit the applications.properties file as follows:
   
- server.port = 8080
- spring.datasource.url=jdbc:mariadb://localhost:3306/gabriel _(i'm using mariadb you can use whatever database you like as long as you install the dependencies in the pom.xml file)_
- spring.datasource.username=yourdatabaseusername
- spring.datasource.password=yourdatabasepassword
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true

3. Navigate into the rstatement folder
4. In the _rstatement/src/main/java/com/gabriel/rstatement_ folder run the _RstatementApplication.java_ file
5. Once the application is running open your browser and navigate to the url
_http://localhost:8080/student_  to explore the application.
