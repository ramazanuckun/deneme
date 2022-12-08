@us18
Feature: US 18 Admin olarak; Yeni Physicians Oluştur / Güncelle / Görüntüle ve Sil

  Background: Ortka adimlar
    Given Ramazan "https://medunna.com/"'ee gider

  Scenario: TC_01 Admin, doktorların bilgilerini görebilmelidir.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Physcians yazisinin doktorlarin bilgilerini gorur

  Scenario: TC_02 Admin, SSN kimliğine göre kayıtlı bir kişiyi seçebilir/arayabilir.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    Then Ramazan Create a new Staff butonuna tiklar ve Create or edit a Staff panelinin acildigini dogrular
    And Ramazan Use Search checkbox tiklar
    And Ramazan SSN satirina kayitli kullanici olan "staffSSN" girer
    Then Ramazan Search User butonuna tiklar ve User found with search SSN yazisini dogrular



  Scenario: TC_03 , Doktorların bilgilerini "Edit Butonu" üzerinden düzenleyebilir.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan belirtilen kullanicinin edit butonuna tiklar

  Scenario: TC_04 Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan belirtilen kullanicinin edit butonuna tiklar
    And Ramazan kullanicinin bilgilerini firsname,lastname,doldurur,birtdate,phone,address,gender doldurur

  Scenario:TC_05 Admin Doktor için bir uzmanlık alanı seçebilmeli.
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan belirtilen kullanicinin edit butonuna tiklar
    And Ramazan doktor icin uzmanlik alani secebilir

  Scenario:TC_06 Admin, doktorun profil resmini sağlayabilir.
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan belirtilen kullanicinin edit butonuna tiklar
    And Ramazan doktor icin profil resmi saglayabilir

  Scenario:TC_07 Admin, doktorun Muayene ücretini girebilmelidir. (Exam fee)
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan belirtilen kullanicinin edit butonuna tiklar
    And Ramazan kullanicinin bilgilerini firsname,lastname,doldurur,birtdate,phone,address,gender doldurur
    And Ramazan doktor icin uzmanlik alani secebilir
    And Ramazan doktor icin profil resmi saglayabilir
    And Ramazan doktorun muayene ucretini girer
    And Ramazan belirtilen doktorun bilgilerini kaydeder

  Scenario:TC_08 Admin mevcut doktorları silebilir.

    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan Physicians uzerine gelir ve tiklar
    And Ramazan delete butonuna tiklar ve belirtilen doktoru siler
    And Ramazan A Physician is deleted with identifier yazisini gorur
