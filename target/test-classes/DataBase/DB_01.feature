Feature: databse test

  @DBTest

  Scenario Outline: kullanici db test
    Given kullanici connection kurar
    And kullanici tum yeni kayitli bilgileri ceker "<query>"ve "<columnName>"
    Then  kullanici kullanici bilgilerini dogrular
    Examples:
      | query | columnName |
      | select * from public.jhi_user | ssn |
