package step.definitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import org.testng.Assert;

public class DemoRestAPI {

    private final String Base_Url = "https://gorest.co.in/public/v2";
    String token = "46364650434b1d3a11beb1bfd6a6a94565717ef64de8e676ba1e5dc2ea2b5bbd";
    private Scenario scenario;
    private Object scenario1;

    @Before
    public void before(Scenario scenariocval) { this.scenario = scenariocval;}

    @Given("Create a User with {String}")
    public void getCallTo(String endPoint){
        RestAssured.given()
                .baseUri(Base_Url)
                .basePath(endPoint)
                .headers(("Authorization"), "Bearer ",token);
    }

    @Then("Response Code should be {Integer}")
        public void responseCode(Integer statusCode){
        Assert.assertEquals(200,statusCode);
    }
}