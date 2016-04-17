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