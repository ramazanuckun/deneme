package projeTestleri;

import base_url_setup.MedunnaBaseUrl;
import base_url_setup.MedunnaBaseUrlProje;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.TestItemPojo;

import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication2.generateToken;

public class Test_Olustur extends MedunnaBaseUrlProje {

    @Test
    public void name() throws JsonProcessingException {
//Given Ramazan set the url yapar


        spec.pathParam("first","c-test-items");

//Ramazan post islemi yapabilmek icin expected data olusturur

        TestItemPojo expectedData=new TestItemPojo("cannn","Gut hastasi",2154,"uric asit 100","uric asit 200");
        System.out.println(expectedData);

//And Ramazan send reguest and the response yapar
        Response response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.prettyPrint();
        //Ramazan do assertion islemi yapar
        // 1-Validation
        response.then().assertThat().statusCode(201).body("name",equalTo(expectedData.getName()),
                "description",equalTo(expectedData.getDescription()),"price",equalTo(expectedData.getPrice()),
                "defaultValMin",equalTo(expectedData.getDefaultValMin()),"defaultValMax",equalTo(expectedData.getDefaultValMax()));

//2-Validation

        JsonPath json=response.jsonPath();

        assertEquals(json.getString("name"),expectedData.getName());
        assertEquals(json.getString("description"),expectedData.getDescription());
        // assertEquals(Optional.of(json.getInt("price")),expectedData.getPrice());
        assertEquals(json.getString("defaultValMin"),expectedData.getDefaultValMin());
        assertEquals(json.getString("defaultValMax"),expectedData.getDefaultValMax());
//3-Validation

        HashMap<String,Object> actualData=response.as(HashMap.class);
        assertEquals(actualData.get("name"),expectedData.getName());
        assertEquals(actualData.get("description"),expectedData.getDescription());
        assertEquals(actualData.get("price"),expectedData.getPrice());
        assertEquals(actualData.get("defaultValMin"),expectedData.getDefaultValMin());
        assertEquals(actualData.get("defaultValMax"),expectedData.getDefaultValMax());
//5-Validation





//6-Validation
        Gson gson=new Gson();
        TestItemPojo actualDataWitGson=gson.fromJson(response.asString(),TestItemPojo.class);
        assertEquals(actualDataWitGson.getName(),expectedData.getName());
        assertEquals(actualDataWitGson.getDescription(),expectedData.getDescription());
        assertEquals(actualDataWitGson.getPrice(),expectedData.getPrice());
        assertEquals(actualDataWitGson.getDefaultValMin(),expectedData.getDefaultValMin());
        assertEquals(actualDataWitGson.getDefaultValMax(),expectedData.getDefaultValMax());
    }
}


