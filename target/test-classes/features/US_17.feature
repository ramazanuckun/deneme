@US17
Feature: US17 Admin olarak ,yeni test ogeleri olusturabilir



  @US17_TC01
  Scenario: TC01 Admin yeni test ogeleri olusturabilir


    Given Ramazan "https://medunna.com/"'ee gider
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan test&items secer
    And Ramazan create a new test item yazisi uzerine gelir ve tiklar
    And Ramazan Create or edit a Test Item sayfasinin acildigini dogrular

  Scenario: TC_02 Kullanici kayit formunu doldurur
    Given Ramazan "https://medunna.com/"'ee gider
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan test&items secer
    And Ramazan create a new test item yazisi uzerine gelir ve tiklar
    And Ramazan name,description,price,Default min value,default max value girer
    And Ramazan cread data olusturur ve gunceller
    And Ramazan A new Test Item is created with identifier yazisini gorur

  Scenario: TC_03 kullanici test ogelerini goruntuleyebilir
    Given Ramazan "https://medunna.com/"'ee gider
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan test&items secer
    And Ramazan test&ogelerini goruntuleyebilir

  Scenario: TC_04 kullanici test ogelerini silebilir
    Given Ramazan "https://medunna.com/"'ee gider
    When Ramazan User sign in butonuna tiklar
    And Ramazan ilk sign in yazisina tiklar
    And Ramazan username bolumune gecerli bir "Team15@gmail.com" girer
    And Ramazan password bolumune gecerli bir "Batch[81]&T15" girer
    And Ramazan sign in butonuna tiklayip oturum acar
    And Ramazan items&titles ikonuna tiklar
    And Ramazan test&items secer
    And Ramazan delete ikonuna tiklayarak bir test ogelerini siler
    And Ramazan A Test Item is deleted yazisini gorur