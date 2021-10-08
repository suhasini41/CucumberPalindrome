package palindrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	String  s,revStr;
	boolean flag;
	int n,rn;
	
	@Given("^a string$")
	public void a_string() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   s = "racecar";
	}

	@When("^reversed the string$")
	public void reversed_the_string() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   StringBuilder sb = new StringBuilder(s);
	   revStr = sb.reverse().toString();
	}

	@Then("^validate if the reversed string is same as the original string$")
	public void validate_if_the_reversed_string_is_same_as_the_original_string() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(s.equals(revStr))
	   {
		   flag = true;
	   }
	   else
		   flag = false;
	}

	@Then("^display the result$")
	public void display_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   if(flag==true)
	   {
		   System.out.println("The given string is a palindrome");
	   }
	   else
		   System.out.println("The given string is not a palindrome");
	}

	@Given("^a number$")
	public void a_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    n = 1221;
	}

	@When("^reversed a number$")
	public void reversed_a_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		int n1 = n;
		while(n1>10) 
		{
			rn = (rn + (n1%10))*10;
			n1 = n1/10;
		}
		rn = rn + n1;
	}

	@Then("^validate if the reversed number is equal to the original number$")
	public void validate_if_the_reversed_number_is_equal_to_the_original_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(n==rn)
		{
			flag=true;
		}
		else
			flag=false;
	    
	}
	@Then("^show the result$")
	public void show_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(flag==true)
		{
			System.out.println("The number is a palindrome");
		}
		else
			System.out.println("The number is not a palindrome");
	}



}
