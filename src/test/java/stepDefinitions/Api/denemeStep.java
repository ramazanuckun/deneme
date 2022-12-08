package stepDefinitions.Api;

import base_url_setup.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.TestItemPojo;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class denemeStep extends MedunnaBaseUrl {
    @Test
    public void name() {
        String url="https://medunna.com/c-test-items/380442";
        Response response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(url);
        response.prettyPrint();

    }

    public static class TestOlustrStep extends MedunnaBaseUrl {
        @Given("Ramazan set the url yapar")
        public void ramazanSetTheUrlYapar() {
            spec.pathParams("first","c-test-items");

        }

        @And("Ramazan post islemi yapabilmek icin expected data olusturur")
        public void ramazanPostIslemiYapabilmekIcinExpectedDataOlusturur() {
            TestItemPojo expectedData=new TestItemPojo("ramazn","Gut hastasi",12345,"uric asit 100","uric asit 200");
            System.out.println(expectedData);

        }
    }
}
