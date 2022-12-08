@DB
Feature: Ramazan US_16 test caseleri Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)
  Background: Ortka adimlar
    Given Ramazan "https://medunna.com/"'ee gider
  Scenario: TC_01 Admin, yatan hastalar için yeni oda oluşturabilir.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan Create or edit a Room yazisini gorur


  Scenario: TC_02 Oda oluşturulurken "Room Number" mutlaka olmalı,
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan kullanici roomNumber doldurur ve
    And Ramazan roomType secer
  Scenario: TC  03 Oda icin status ayarlanabilir

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan oda icin status secenegini tiklar


  Scenario: TC_04 Fiyat eklenebilir olmali


    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan oda icin status secenegini tiklar
    And Ramazan room icin fiyat ekler ve bos birakirsa This field is required. uyarisini gorur


  Scenario: TC_05 Deciprition istege bagli olmali
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan oda icin status secenegini tiklar
    And Ramazan Deciprition secenegini istege bagli ddoldurur


  Scenario: TC_06 Negatif Test kullanici gecmis tarihli Created Date gun/ay/yil seklinde oda olustur
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan Create a new  Room yazisini tiklar
    And Ramazan kullanici roomNumber doldurur ve
    And Ramazan oda icin status secenegini tiklar
    And Ramazan room icin fiyat ekler ve bos birakirsa This field is required. uyarisini gorur
    And Ramazan cread data bolumune gecmis tarih girer
    And Ramazan save bunonuna tiklar ve A new Room is created with identifier yazisini gorur


  Scenario: TC_7 kullanici ayni tip odalari secebilir
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan kullanici ayni tip odalari Room Type secenegine tiklar ve ayni tip odalari gorur secebilir


  Scenario: TC_08 kullanici odalari duzenleyebilir ve guncelleyebilir
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan edit secenegine tiklayarak son olusturulan odayi duzenler

  Scenario: TC_09 kullanici odalari silebilir

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Room secenegini tiklar
    And Ramazan delete butonunu kullanarak son duzenlenen odayi siler
    And Ramazan A Room is deleted yazisini gorur
