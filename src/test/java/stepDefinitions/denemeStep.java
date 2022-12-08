package stepDefinitions;

import base_url_setup.MedunnaBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class denemeStep extends MedunnaBaseUrl {
    Response response;
    @Given("Ramazan meduuna ile baglanti kurar")
    public void ramazanMeduunaIleBaglantiKurar() {

      //  spec.pathParams("first","c-test-items","second",380442);
String url="https://medunna.com/c-test-items";
        Response response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get(url);
        response.prettyPrint();

    }

    @And("Ramazan test_item olusturur")
    public void ramazanTest_itemOlusturur() {



    }
}
