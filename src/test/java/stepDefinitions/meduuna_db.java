package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DatabaseUtility;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class meduuna_db {

    List<Object>actualData;
    @Given("kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();
    }

    @And("kullanici tum yeni kayitli bilgileri ceker {string}ve {string}")
    public void kullaniciTumYeniKayitliBilgileriCekerVe(String query, String columnName) {

        actualData=DatabaseUtility.getColumnData(query,columnName);
    //    System.out.println(actualData);
    }

    @Then("kullanici kullanici bilgilerini dogrular")
    public void kullaniciKullaniciBilgileriniDogrular() {
assertTrue(actualData.contains(DatabaseUtility.registrant));
    }
}
