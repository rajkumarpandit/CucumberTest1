# CucumberTest1, 24-Mar-2019
#First Project for Cucumber Test Automation(windows)
#install maven
#add maven>bin --path in the path env variable
#ensure JAVA_HOME is  set with the JDK path
#Create Maven project in batch mode
#open command prompt
cd <to folder where you want to create your project>
#fire below command
mvn archetype:generate  -DarchetypeGroupId=io.cucumber -DarchetypeArtifactId=cucumber-archetype -DarchetypeVersion=2.3.1.2 -DgroupId=my_cucumber_proj -DartifactId=cucumber_proj1   -Dpackage=test_cucumber  -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false
#Output should be
#-----------------
#[INFO] ------------------------------------------------------------------------
#[INFO] BUILD SUCCESS
#[INFO] ------------------------------------------------------------------------
#[INFO] Total time:  18.399 s
#[INFO] Finished at: 2019-03-23T17:33:04+05:30
#[INFO] ------------------------------------------------------------------------
#Test the validity of the project 
#--------------------------------
cd cucumber_proj1
mvn test
#Output should be
#-------------------------------------------------------
# T E S T S
#-------------------------------------------------------
#Running test_cucumber.RunCucumberTest
#No features found at [classpath:test_cucumber]

#0 Scenarios
#0 Steps
#0m0.002s

#Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.25 sec

#Results :

#Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

#[INFO] ------------------------------------------------------------------------
#[INFO] BUILD SUCCESS
#[INFO] ------------------------------------------------------------------------
#[INFO] Total time:  25.228 s
#[INFO] Finished at: 2019-03-23T17:41:42+05:30
#[INFO] ------------------------------------------------------------------------
#Now download my project
#open intelliJ
#Choose open 
#Select the POM.xml file fromt the location where you have downloaded my project
#now run it in the IntelliJ folder
