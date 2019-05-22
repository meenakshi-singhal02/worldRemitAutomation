Execution: It can be done in various ways.

Copy project in workspace

Command Prompt:

Go to project location and run following command
cd <workspace path>
mvn test -DCucumber.options="--tags @sendMoney "

RunnerTest.java:
We can simply execute from RunnerTest.java file from eclipse ide.

Testng.xml:
To execute test cases, we can right click and run testng.xml file, this also supports browser parameterization and parallel execution.

Note: For more reference please refer PetStoreProjectDescriptionDocument.docx