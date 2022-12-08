package stepDefinitions.Api;

import base_url_setup.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.TestItemPojo;
import utilities.Authentication2;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.urlEncodingEnabled;
import static utilities.Authentication2.generateToken;

public class testStep extends MedunnaBaseUrl {
    @Given("Ramazan set the url yaparr")
    public void ramazanSetTheUrlYaparr() {
        spec.pathParams("first","c-test-items");

//Ramazan post islemi yapabilmek icin expected data olusturur

        TestItemPojo expectedData=new TestItemPojo("cann","Gut hastasi",2154,"uric asit 100","uric asit 200");
        System.out.println(expectedData);

//
        Response response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.prettyPrint();
    }

    @And("Ramazan post islemi yapabilmek icin expected data olustururr")
    public void ramazanPostIslemiYapabilmekIcinExpectedDataOlustururr() {

    }
}
