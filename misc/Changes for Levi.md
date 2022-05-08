# Fixes for JaCoCo

Example as if you were testing your project 0 (that is what I am using).


> Remeber to change your project name

**inside pom.xml**:

```
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.revature</groupId>
  <artifactId>project0</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>project0</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <dependencies>
    <!-- https://mvnrepository.com/artifact/org.mockito/mockito-all -->
	<dependency>
	    <groupId>org.mockito</groupId>
	    <artifactId>mockito-all</artifactId>
	    <version>1.10.19</version>
	    <scope>test</scope>
	</dependency>
	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.13.2</version>
	    <scope>test</scope>
	</dependency>
	<dependency>
		<groupId>org.postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<version>42.3.5</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/log4j/log4j -->
	<dependency>
		<groupId>log4j</groupId>
		<artifactId>log4j</artifactId>
		<version>1.2.17</version>
	</dependency>
  </dependencies>

<build>
  <plugins>
    <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.5</version>
      <executions>
        <execution>
          <goals>
            <goal>prepare-agent</goal>
          </goals>
        </execution>
        <!-- attached to Maven test phase -->
        <execution>
          <id>report</id>
          <phase>test</phase>
          <goals>
            <goal>report</goal>
          </goals>
        </execution>

        <execution>
          <id>jacoco-check</id>
          <goals>
            <goal>check</goal>
          </goals>
          <configuration>
            <rules>
              <rule>
                <element>PACKAGE</element>
                <limits>
                  <limit>
                    <counter>LINE</counter>
                    <value>COVEREDRATIO</value>
                    <minimum>0.9</minimum>
                  </limit>
                </limits>
              </rule>
            </rules>
          </configuration>
        </execution>

      </executions>
    </plugin>
  </plugins>
</build>
</project>
```



**inside test/java/com/revatre/AppTest.java**:
> My Main driver = App.java
> Therefore my test file for my main driver is AppTest.java

```
package com.revature;

import static org.junit.Assert.assertTrue;

import com.revature.drivers.App;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        App obj = new App(); //This line is very important.
        assertTrue(true);
    }
}
```

**From the terminal run mvn test:**

```
project0 git:(dev) x mvn test
```
> Your branch `dev in my case` might be different

New files show up under the target folder.
Right click one of the html files and reveal in finder.
Open the file from the finder window
