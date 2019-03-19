
## Test project using Serenity-BDD and Cucumber
Set up the serenity.conf file before running.

For example:
Fill in the website base URL: `webdriver.base.url = "https://www.mywebsite.org"`  
Choose to run webdriver in headless mode or not: `headless.mode = false`

The project includes webdriver binaries to run the tests.

## Test execution
Execute `gradle clean test` to run the test.  
Currently there might be some problems running this with JDK 11.  
Gradle version 4 or 5 with JDK 8 should work.
https://github.com/gradle/gradle/issues/8286  


##Test report
After running the tests, the results can be found in: ../target/site/serenity/index.html

### The project directory structure
The project has build scripts for Gradle, and follows the standard directory structure used in most Serenity projects:

```
src
  + main
  + test
    + java                          Test runners and supporting code
    + resources
      + features                    Feature files
        + featureA                    Feature file subdirectories 
          feature_A.feature  
      + webdriver                   Bundled webdriver binaries
        + linux
        + mac
        + windows
          chromedriver.exe          OS-specific Webdriver binaries
          geckodriver.exe

```

