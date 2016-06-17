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

--Turn on bean validation
	(1) Get the Hibernate Validator dependency listed in this project's pom file.
	(2) If you are using Java based configuration, be sure to add the @EnableWebMvc annotation.
	(3) For message bundle based error messages:
		(a) Make your config class (AppConfig) extend WebMvcConfigurerAdapter
		(b) Define a new method in the config class that will override the newly extended WebMvcConfigurerAdapter.getValidator() 
		(c) Get a reference to the validator that references the new message.properties file using the two Spring Framework classes.
		(d) Create a new .properties file in the src/main/resources folder.
	
	
--Creating repo
	(1) Issue git commands from git bash:
		--git remote add origin git@github.com:Deeze814/SpringMVC.git
		--git push -u origin master
	(2) If you get an error saying it couldnt push, make sure your account is added as a collaborator in the github repo
	(3) If it still fails, open the project .git/config and make sure the url is correct.
		--For SpringMVC I had to make the following change
			--[remote "origin"]
				url = git@github.com:Deeze814.SpringMVC.git --> url = git@github.com:Deeze814/SpringMVC.git


--Importing project from Git into a new workspace
	(1) Create a new workspace folder (i.e. C:\Deeze814\Git\MVC)
	(2) Using Git bash, do a git init and then clone the repo into this new folder (\MVC)
	(3) Open Eclipse and point the workspace at the ..\Git\MVC folder
	(4) Go to File --> Import --> Existing Maven Projects, then path down to the Spring MVC project and import it
	(5) Right click the procject in the project explorer and go to Properties --> Project Facets
	(6) Click Java, JavaScript, and Dynamic Web Module
		--After clicking Dynamic Web Module, click the light blue text at the bottom that says 'Further Configuration Available'
		--Delete the 'WebContent' entry and replace it with the path that maven created the web.xml under 
			-- src\main\webapp
	(7) Now we need to tell Eclipse that our JARs are not located in the WEB-INF\lib folder but are on the classpath already
		--Right click the project in the Project Explorer and select Properties -> Deployment Assembly
		--Click 'Add' --> Java Build Path Entries --> Maven Dependencies.
	(8) Clean, build and start tomcat. You should see it pick up on the WebApplicationContext for namespace 'springmvc-servlet'
				
--Eclipse settings
	(1) To get the normal Project Explorer, go to Window --> Open Perspective --> JavaEE
	(2) Switched form Luna to Mars and downloaded the JavaEE edition from:
		http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2 

--Merging Git branches
	(1) Used sourcetree, downloaded Meld (http://meldmerge.org/)
	(2) In sourcetree, go to Tools --> Options --> Diff
	(3) Under 'External Diff Tool' and 'Merge Tool' select Custom
	(4) For 'Diff Command' enter the path to the meld.exe (C:\Program Files (x86)\Meld\Meld.exe)
	(5) For 'Arguments' enter $LOCAL $MERGED $REMOTE
	   --Since Meld does 3 way diff model, this will put:
	   		-Local changes on the left
	   		-Remote branch version on the right
	   		-Merged version in the middle
	(6) In sourcetree, check out the branch you want the merge to go INTO (master in my case)
	(7) Right click the branch you want to merge into your currently checkout out branch and select 'Merge XXX into XXX'
	(8) When you get the prompt saying conflicts occurred, go to the 'File Status' tab
	(9) Right click a conflicted file and choose, 'Launch External Merge Tool'
	(10) Resolve the conflict in Meld and save the file, then close Meld.
	(11) Once you have resolved and saved all conflicted files, do a git commit/git push 