3:00 to 3:30 --->Actions
3:30 to 4:30 --->TestNG Basics & Seq execution
4:30 to 4:50 --->Breakout
4:50 to 5:00 --->Break
5:00 to 5:30 --->Parallel  execution
5:30 to 5:45 --->Breakout
5:45 to 6:00--->Java wait


preRequsites:
 TestNg plugin-compiling and execution of testcases
 dependencies-developing the script

 Verify Maven Surefire Plugin inside pom.xml. If not, add the following plugin
<build>
    <plugins>

        <!-- Compiler -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>17</source>
                <target>17</target>
            </configuration>
        </plugin>

        <!-- Test Execution -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.5</version>
            <configuration>
                <suiteXmlFiles>
                    <suiteXmlFile>testng.xml</suiteXmlFile>
                </suiteXmlFiles>
            </configuration>
        </plugin>

    </plugins>
</build>

 steps for converting normal script to TestNG:
1)convert main mtd into normal method
 a)remove static,string args
 b)remove main and give a valid method name(mthd name should not be same as class name)
 2)add @Test before the method and import it

 
To create a snippet do ctrl+shift+p then type configure snippet--->new global snippet--->give the file name,delete the already existing data and add the below file

{
  "TestNG XML": {
    "prefix": "testngxml",
    "body": [
      "<!DOCTYPE suite SYSTEM \"https://testng.org/testng-1.0.dtd\" >",
      "<suite name=\"DemoSuite\">",
      "    <test name=\"DemoTests\">",
      "        <classes>",
      "            <class name=\"com.demo.SampleTest\"/>",
      "        </classes>",
      "    </test>",
      "</suite>"
    ],
    "description": "Generate a TestNG XML template"
  }
}

Create testng.xml File
Right click project → New File → testng.xml

Usage of Snippets
Open any XML file
Type → testngxml
Press Enter

Open Maven Project in Terminal
Right click on project
Select → Open in Integrated Terminal
Type → mvn clean test
Press Enter

Verify Output
Check Terminal logs
Verify that the testcases should be executed in sequential manner
Verify test execution status (PASS/FAIL)
