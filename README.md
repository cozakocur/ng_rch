Instruction how to create ready to run version of automated tests using Java and Maven.

##Setup

1 .Install Java development kit 11 from:

https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html

2. After install add Java to the system path, instruction for Windows:

https://javatutorial.net/set-java-home-windows-10

3. Install Maven with adding to the system path:

https://maven.apache.org/install.html

4. Using https://chocolatey.org/ you can install google chrome driver as browser for tests:

`choco install chromedriver`

5. In console you will see where your chromedriver will be installed then just add the path to `chromedriver.exe` as system path (like Java and Maven before).

6. Now you should clone repository for example using command:

`git clone git@github.com:rchowaniak/NG-recru.git`

7. If everything goes well, move to the directory where is the repository of our tests, open there command line and put command:

`mvn clean verify`

Now in the console you will see informations about tests - that tests passed or failed.

After everything goes successfully in the folder of test repository will be new folder called `target`. In this folder you should go into `/site/serenity/` and open `index.html` for example in Google Chrome browser.

Now you can see full report of our two tests that was done with the features, data and stories writes in cucumber.
