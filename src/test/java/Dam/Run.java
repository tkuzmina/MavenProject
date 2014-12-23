package Dam;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/cucumber"},tags = "@Login")

public class Run {

	/*Scenario Outline: User cannot login without valid credentials
	Given User is on the login page
	When User enter <Password> 
	And 
	When User enter <Email>
	And 
	When User selects the LoginButton
	Then User should get an <Error>
	
	Examples: 
	|Email           |Password |         Error         |
	|"Tata@gmail.com"|"kjsdhgh"|"Invalid Username/Pass"|
	|"rnkjs"         |"sjfs"   |*/
}
