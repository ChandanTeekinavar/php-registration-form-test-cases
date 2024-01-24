This Repo just Contains the test-scripts of php-registration form application.

The php-registration form application is in the another repo. The link for that Repo will be "https://github.com/ChandanTeekinavar/php-registration-form.git"

I have used Selenium, for automation testing.

Update the your application link on the test scripts.

And then package the test scripts. Hence I have used Assembly plugin in the Selenium. It will create a Jar file with all the Dependencies when you packages it. So that you can run it.

To package this maven project run "mvn clean package" command. It will create a jar file with all dependencies file in the target folder.To run that jar file give the command " java -jar (Give the name of the jar file which will be created after running the "mvn clean package" command)

I have pushed jenkinsfile to this repo. 
