package stepDefinitions.DB_StepDefs;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        //DBWork objesini oluştur.
        DBWork db = new DBWork();

        //Connection methodunu çağır.
        Connection con = db.connec_to_db("techproed", "postgres", "******");

        //Yeni table oluşturma methodunu çağır.
        db.createTable(con, "employees");


    }
}
