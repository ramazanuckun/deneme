package base_url_setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseUrlProje {
    protected RequestSpecification spec;
    @Before
    public void setup(){

        spec=new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
    }
}

