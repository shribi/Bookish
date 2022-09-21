                        -------------------------------BOOKISH-------------------------------

Bookish is a web application which helps in buying books online.
It becomes more user-friendly when it is web application which does not involve any type of remote installation.
The application is built using the Java's Framework known as Spring Boot with Java's Embedded Database called H2 for data management.    

How to use??
-> Download the Git.  
-> Open the folder in Microsoft Visual Studio.     
-> Run the command, "mvnspring-boot:run", in the Terminal.  
-> Go to any browser which supports HTML 5.0 such as Microsoft Edge, Google Chrome etc.,  
-> Type the URL- "http://localhost:8080/loginnew.html" in your browser you will be lead to the login page of the app.  
-> If you have logged in before, enter the login details to log in else you have to register to our website.  
-> Once you login you can navigate to various locations.  
-> For purchasing any product please navigate to the Shop page and you can add products you wish to the cart.  
-> Once you have decided to puchase, navigate to the Cart page and finalize your products and click Continue.  
-> Now, you will be asked to enter the Billing address and once you complete the address will be stored in the database.  
-> After placing Successfully, you can navigate to home page or log-out.    

To check with the database, enter the URL in your browser:
http://localhost:8080/h2-console/login.jsp

-> Enter the SQL commands to cross check the orders.    

***************ONLY FOR ADMINS***************  
-> Navigate to:
    src -> main -> resources -> data.txt

-> Find the admin email and password and login with those details...  
-> Initially write the SQL commands into the H2 console and proceed as above.  
-> Admin has the permission to add books remove books and their Genres.     

Enjoyy while using the application.....


