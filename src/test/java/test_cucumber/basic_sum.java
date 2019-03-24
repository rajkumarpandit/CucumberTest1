package test_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class basic_sum {
    String op;
    int lnum1,lnum2,lsum;
    int expectedAnswer;


    @Given("^operation is \"([^\"]*)\"$")
    public void operation_is(String arg1) throws Exception {
        this.op=arg1;
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String arg1, String arg2) throws Exception {
        if(this.op.equals("addition"))
        {
            this.lsum=Integer.valueOf(arg1)+Integer.valueOf(arg2);
        }
        else if(this.op.equals("minus")){
            this.lsum=Integer.valueOf(arg1) - Integer.valueOf(arg2);

        }else if(this.op.equals("multiplication")){
            this.lsum=Integer.valueOf(arg1)* Integer.valueOf(arg2);
        }
    }

    @Then("^user gets \"([^\"]*)\"$")
    public void user_gets(String arg1) throws Exception {
        expectedAnswer=Integer.valueOf(arg1);
        assertEquals(expectedAnswer, this.lsum);
    }


}
