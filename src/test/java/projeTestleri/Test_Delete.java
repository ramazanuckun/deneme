package projeTestleri;

import base_url_setup.MedunnaBaseUrlProje;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.TestItemPojo;

import static io.restassured.RestAssured.given;
import static utilities.Authentication2.generateToken;

public class Test_Delete extends MedunnaBaseUrlProje {
    @Test
    public void name() {

      //Given Ramazan url ile baglanti kurar
        spec.pathParams("first","c-test-items","second",380442);
//And Ramazan delete islemi yapabilmek icin send the reguest and the response yapar
        TestItemPojo expectedData=new TestItemPojo("cannn","Gut hastasi",2154,"uric asit 100","uric asit 200");
        System.out.println(expectedData);
        Response response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).when().delete("/{first}/{second}");
        response.prettyPrint();
        //Then Ramazan delete dogrulamasi yapar
        JsonPath json=response.jsonPath();

}}
