package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Medunna_06Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_16_17_18 {


    Medunna_06Page medunna_06Page = new Medunna_06Page();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

//<US_17>

    @Given("Ramazan {string}'ee gider")
    public void ramazan_ee_gider(String url) {
        Driver.getDriver().get(url);
    }

    @When("Ramazan User sign in butonuna tiklar")
    public void ramazan_user_sign_in_butonuna_tiklar() {

        medunna_06Page.signInGiris.click();

    }

    @When("Ramazan ilk sign in yazisina tiklar")
    public void ramazan_ilk_sign_in_yazisina_tiklar() {
        medunna_06Page.signIn.click();
    }

    @When("Ramazan username bolumune gecerli bir {string} girer")
    public void ramazan_username_bolumune_gecerli_bir_girer(String username) {
        medunna_06Page.username.sendKeys(username);
    }

    @When("Ramazan password bolumune gecerli bir {string} girer")
    public void ramazan_password_bolumune_gecerli_bir_girer(String password) {
        medunna_06Page.password.sendKeys(password);
    }

    @When("Ramazan sign in butonuna tiklayip oturum acar")
    public void ramazan_sign_in_butonuna_tiklayip_oturum_acar() {
        medunna_06Page.sinInOnay.click();
    }

    @When("Ramazan items&titles ikonuna tiklar")
    public void ramazan_items_titles_ikonuna_tiklar() {
        medunna_06Page.itemTitlesIkonu.click();
    }

    @When("Ramazan test&items secer")
    public void ramazan_test_items_secer() {
        medunna_06Page.testItems.click();
    }

    @When("Ramazan create a new test item yazisi uzerine gelir ve tiklar")
    public void ramazan_create_a_new_test_item_yazisi_uzerine_gelir_ve_tiklar() {
        medunna_06Page.crateaTestItemsOlustur.click();
    }

    @When("Ramazan Create or edit a Test Item sayfasinin acildigini dogrular")
    public void ramazan_create_or_edit_a_test_ıtem_sayfasinin_acildigini_dogrular() {
        medunna_06Page.createoreditaTestItemYazisiGorunurlugu.isDisplayed();
    }

    @And("Ramazan name,description,price,Default min value,default max value girer")
    public void ramazanNameDescriptionPriceDefaultMinValueDefaultMaxValueGirer() {
        Faker faker1=new Faker();
        medunna_06Page.nameTestItems.sendKeys(faker1.name().firstName());
        medunna_06Page.descrictionTestItems.sendKeys("acil");
        medunna_06Page.priceTestItems.sendKeys("2580");
        medunna_06Page.defaultminValueTestItems.sendKeys("100");
        medunna_06Page.defaultmaxValuedescrictionTestItems.sendKeys("200");

    }

    @And("Ramazan cread data olusturur ve gunceller")
    public void ramazanCreadDataOlustururVeGunceller() {
        ReusableMethods.waitForClickablility(medunna_06Page.saveTestItems, 5);
        medunna_06Page.creadDataTestItems.sendKeys(Keys.ENTER);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", medunna_06Page.saveTestItems);
        // jse.executeScript("arguments[0].click();",medunna_06Page.saveTestItems);
        medunna_06Page.saveTestItems.click();
    }

    @And("Ramazan test&ogelerini goruntuleyebilir")
    public void ramazanTestOgeleriniGoruntuleyebilir() {

        List<WebElement> testogeleri = medunna_06Page.testogeleri;
        for (WebElement w : testogeleri
        ) {
            w.click();

        }
    }

    @And("Ramazan delete ikonuna tiklayarak bir test ogelerini siler")
    public void ramazanDeleteIkonunaTiklayarakBirTestOgeleriniSiler() {


        //  JavascriptExecutor jsee= (JavascriptExecutor) Driver.getDriver();
        //   jsee.executeScript("arguments[0].scrollIntoView(true);",medunna_06Page.delete
        //    );
        // medunna_06Page.deleteicinSonSayfaSirala.click();

        medunna_06Page.deleteicinSonSayfaSirala.click();
        ReusableMethods.waitFor(3);
        //ReusableMethods.jsScrollClick(medunna_06Page.endPage);
        ReusableMethods.jsScrollClick(medunna_06Page.delete);
        ReusableMethods.waitFor(2);
        medunna_06Page.deleteOnayTestItem.click();



    }

    /////////////////////////////////////////////18///18/18
    @And("Ramazan Physicians uzerine gelir ve tiklar")
    public void ramazanPhysiciansUzerineGelirVeTiklar() {

        medunna_06Page.physicians.click();
    }

    @And("Physcians yazisinin doktorlarin bilgilerini gorur")
    public void physciansYazisininDoktorlarinBilgileriniGorur() {
        medunna_06Page.physiciansGorunurlugu.isDisplayed();
    }

    @Then("Ramazan Create a new Staff butonuna tiklar ve Create or edit a Staff panelinin acildigini dogrular")
    public void ramazanCreateANewStaffButonunaTiklarVeCreateOrEditAStaffPanelininAcildiginiDogrular() {
        ReusableMethods.waitForClickablility(medunna_06Page.createaNewPhysician, 10);
        medunna_06Page.createaNewPhysician.click();
    }

    @And("Ramazan Use Search checkbox tiklar")
    public void ramazanUseSearchCheckboxTiklar() {
        medunna_06Page.checxbox.click();
    }

    @And("Ramazan SSN satirina kayitli kullanici olan {string} girer")
    public void ramazanSSNSatirinaKayitliKullaniciOlanGirer(String arg0) {
        medunna_06Page.useSearchButton.sendKeys("123-25-5689");

    }

    @Then("Ramazan Search User butonuna tiklar ve User found with search SSN yazisini dogrular")
    public void ramazanSearchUserButonunaTiklarVeUserFoundWithSearchSSNYazisiniDogrular() {
        medunna_06Page.searchUserOnay.click();
        //    Assert.assertTrue("yazi yok",medunna_06Page.userFoundScrollingText.isDisplayed());
    }

    @And("Ramazan belirtilen kullanicinin edit butonuna tiklar")
    public void ramazanBelirtilenKullanicininEditButonunaTiklar() {
        ReusableMethods.waitFor(15);
        medunna_06Page.deleteicinSonSayfaSirala.click();
        ReusableMethods.waitFor(9);
        ReusableMethods.jsScrollClick(medunna_06Page.physicianlocateSonSayfa);
    }

    @And("Ramazan kullanicinin bilgilerini firsname,lastname,doldurur,birtdate,phone,address,gender doldurur")
    public void ramazanKullanicininBilgileriniFirsnameLastnameDoldururBirtdatePhoneAddressGenderDoldurur() {
        medunna_06Page.namePhysician.clear();
        medunna_06Page.namePhysician.sendKeys(faker.name().firstName());
        medunna_06Page.lastnamePhysician.clear();
        medunna_06Page.lastnamePhysician.sendKeys(faker.name().lastName());
        medunna_06Page.birtDatePhysician.clear();
        medunna_06Page.birtDatePhysician.sendKeys("11/11/1980");
        ReusableMethods.waitFor(5);
        medunna_06Page.phonePhysician.clear();
        medunna_06Page.phonePhysician.sendKeys("0123456789");
        medunna_06Page.adressPhysician.clear();
        medunna_06Page.adressPhysician.sendKeys(faker.address().city());
        medunna_06Page.adressPhysician.sendKeys(Keys.PAGE_DOWN);
        Select select = new Select(medunna_06Page.genderPhysician);
        select.selectByIndex(0);

    }


    @And("Ramazan doktor icin uzmanlik alani secebilir")
    public void ramazanDoktorIcinUzmanlikAlaniSecebilir() {

        ReusableMethods.waitFor(5);
        WebElement doktoruzmanlik = medunna_06Page.specialityPhysician;
        Select select = new Select(doktoruzmanlik);
        select.selectByIndex(7);

    }

    @And("Ramazan doktor icin profil resmi saglayabilir")
    public void ramazanDoktorIcinProfilResmiSaglayabilir() {
        ReusableMethods.waitFor(5);
        String dosyaYolu = "C:\\Users\\hp\\Desktop\\image (1).png";

        medunna_06Page.fotodosyaPhysician.sendKeys(dosyaYolu);


    }

    @And("Ramazan doktorun muayene ucretini girer")
    public void ramazanDoktorunMuayeneUcretiniGirer() {
        ReusableMethods.jsScrollClick(medunna_06Page.examFeePhysician);
        medunna_06Page.examFeePhysician.clear();
        medunna_06Page.examFeePhysician.sendKeys("123456789");

    }

    @And("Ramazan belirtilen doktorun bilgilerini kaydeder")
    public void ramazanBelirtilenDoktorunBilgileriniKaydeder() {
        ReusableMethods.jsScrollClick(medunna_06Page.savePhysician);
    }

    @And("Ramazan delete butonuna tiklar ve belirtilen doktoru siler")
    public void ramazanDeleteButonunaTiklarVeBelirtilenDoktoruSiler() {

        medunna_06Page.deleteicinSonSayfaSirala.click();
        ReusableMethods.waitFor(3);
        //ReusableMethods.jsScrollClick(medunna_06Page.endPage);
        ReusableMethods.jsScrollClick(medunna_06Page.delete);
        ReusableMethods.waitFor(5);
        ReusableMethods.jsScrollClick(medunna_06Page.deleteOnayPhysician);
    }

    ////////////////US16//////////////16/16/16
    @And("Ramazan Room secenegini tiklar")
    public void ramazanRoomSeceneginiTiklar() {
        medunna_06Page.room.click();
    }

    @And("Ramazan Create a new  Room yazisini tiklar")
    public void ramazanCreateANewRoomYazisiniTiklar() {
        medunna_06Page.createNewRoom.click();
    }

    @And("Ramazan Create or edit a Room yazisini gorur")
    public void ramazanCreateOrEditARoomYazisiniGorur() {

        medunna_06Page.createOrEditAroom.isDisplayed();
    }

    @And("Ramazan sayfayi kapatir")
    public void ramazanSayfayiKapatir() {

        Driver.getDriver().close();
    }

    @And("Ramazan kullanici roomNumber doldurur ve")
    public void ramazanKullaniciRoomNumberDoldururVe() {
        medunna_06Page.roomNumberRoom.clear();
        medunna_06Page.roomNumberRoom.sendKeys(faker.random().hex());

    }

    @And("Ramazan roomType secer")
    public void ramazanRoomTypeSecer() {
        Select select=new Select(medunna_06Page.roomTypeSelectRoom);
        select.selectByIndex(3);
    }

    @And("Ramazan oda icin status secenegini tiklar")
    public void ramazanOdaIcinStatusSeceneginiTiklar() {

        medunna_06Page.statusRoom.click();
    }

    @And("Ramazan room icin fiyat ekler ve bos birakirsa This field is required. uyarisini gorur")
    public void ramazanRoomIcinFiyatEklerVeBosBirakirsaThisFieldIsRequiredUyarisiniGorur() {

        medunna_06Page.priceuyariIcinRoom.click();
        medunna_06Page.priceuyariIcinRoom.click();
        Assert.assertTrue(medunna_06Page.priceuyariYazisiIcinRoom.getText().contains("This field is required."));


        medunna_06Page.priceRoom.sendKeys("3232323");
    }

    @And("Ramazan Deciprition secenegini istege bagli ddoldurur")
    public void ramazanDecipritionSeceneginiIstegeBagliDdoldurur() {
        medunna_06Page.descriptionsRoom.sendKeys("istege bagli");
    }

    @And("Ramazan cread data bolumune gecmis tarih girer")
    public void ramazanCreadDataBolumuneGecmisTarihGirer() {
        ReusableMethods.jsScrollClick(medunna_06Page.creadDataRoom);
        Actions actions1=new Actions(Driver.getDriver());
        actions1.sendKeys("22").perform();

    }

    @And("Ramazan save bunonuna tiklar ve A new Room is created with identifier yazisini gorur")
    public void ramazanSaveBunonunaTiklarVeANewRoomIsCreatedWithIdentifierYazisiniGorur() {

        ReusableMethods.jsScrollClick(medunna_06Page.saveKaydetRoom);

        medunna_06Page.yeniOdaOlusturlduYazisiRoom.isDisplayed();
    }

    @And("Ramazan kullanici ayni tip odalari Room Type secenegine tiklar ve ayni tip odalari gorur secebilir")
    public void ramazanKullaniciAyniTipOdalariRoomTypeSecenegineTiklarVeAyniTipOdalariGorurSecebilir() {
        medunna_06Page.roomTypeTusuRoom.click();
    }

    @And("Ramazan edit secenegine tiklayarak son olusturulan odayi duzenler")
    public void ramazanEditSecenegineTiklayarakSonOlusturulanOdayiDuzenler() {
        medunna_06Page.roomTypeTusuRoom.click();
        ReusableMethods.waitFor(5);
        medunna_06Page.editSonSayfaRoom.click();

        medunna_06Page.priceRoom.sendKeys("7171");
        ReusableMethods.jsScrollClick(medunna_06Page.saveKaydetRoom);
    }

    @And("Ramazan delete butonunu kullanarak son duzenlenen odayi siler")
    public void ramazanDeleteButonunuKullanarakSonDuzenlenenOdayiSiler() {
        medunna_06Page.roomTypeTusuRoom.click();
        ReusableMethods.waitFor(5);
        medunna_06Page.deleteSonSayfaRoom.click();
        ReusableMethods.waitFor(5);
        medunna_06Page.deleteOnayRoom.click();
    }

    @And("Ramazan A Room is deleted yazisini gorur")
    public void ramazanARoomIsDeletedYazisiniGorur() {


    }


    @And("Ramazan A new Test Item is created with identifier yazisini gorur")
    public void ramazanANewTestItemIsCreatedWithIdentifierYazisiniGorur() {

        medunna_06Page.yeniTestItemOlusduYazisitestItem.isDisplayed();
    }

    @And("Ramazan A Test Item is deleted yazisini gorur")
    public void ramazanATestItemIsDeletedYazisiniGorur() {
        medunna_06Page.testItemSilindiYazisitestItem.isDisplayed();

    }

    @And("Ramazan A Physician is deleted with identifier yazisini gorur")
    public void ramazanAPhysicianIsDeletedWithIdentifierYazisiniGorur() {

        medunna_06Page.doktorsilindiYazisiPhysician.isDisplayed();
    }
}
