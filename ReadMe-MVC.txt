--Setup up a spring web app.
***Be sure you have m2e-wtp plugin for eclipse if you want to run on tomcat***
	(1) Choose File --> New Project --> maven-archetype-webapp
	(2) Add the spring dependencies that are in the pom.xml file
	(3) Alter the webapp/WEB-INF/web.xml in order to map the dispatcher servlet.
	(4) Create the Dispatcher Servlet within the WEB-INF directory (same as the web.xml)
		--Be sure to name it the same as the name defined in the <servlet-name> tag in web.xml
		--<servlet-name>springMVC</servlet-name>  ---> springMVC.servlet.xml
		(a) In the dispatcher servlet, create the context component scan tag and annotation-config tag
			--The compnent scan takes the package of classes that will be annotated (typically controllers)
		(b) Also in the dispatcher servlet, Create your view resolver.
	(5) Create a controllers package and a SimpleController.java
	(6) Create a views folder under the WEB-INF folder and create hello.jsp
	(7) For tomcat, you will need to right click the project and go to Properties --> Project Facets and check dynamic web project in order to get it to show for tomcat
	(8) To access the project you will need to go to Http://localhost:8080/SpringMvc/hello.htm 

--Annotation Based config
	(1) Deleted the WEB-INF/springmvc-servlet.xml and replaced it with a new config file (com.sample.config.AppConfig) and configured it in WEB-INF/web.xml	
	
	
--Creating repo
	(1) Issue git commands from git bash:
		--git remote add origin git@github.com:Deeze814/SpringMVC.git
		--git push -u origin master
	(2) If you get an error saying it couldnt push, make sure your account is added as a collaborator in the github repo
	(3) If it still fails, open the project .git/config and make sure the url is correct.
		--For SpringMVC I had to make the following change
			--[remote "origin"]
				url = git@github.com:Deeze814.SpringMVC.git --> url = git@github.com:Deeze814/SpringMVC.git
				
--Eclipse settings
	(1) To get the normal Project Explorer, go to Window --> Open Perspective --> JavaEE
	(2) Switched form Luna to Mars and downloaded the JavaEE edition from:
		http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2 