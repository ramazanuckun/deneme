package stepDefinitions.DB_StepDefs;

import org.junit.Test;
import utilities.DatabaseUtility;

public class DB_Test {

    @Test
    public void name() {

        DatabaseUtility.createConnection();
        String query="select * from physician";
        //physician tablosundaki kolon (sutunu verir)isimlerinin verir
        System.out.println(DatabaseUtility.getColumnNames(query)+"\n");
//physician taplosundaki first_name sutunudaki datalari verir
        System.out.println(DatabaseUtility.getColumnData(query,"first_name")+"\n");

        //physician taplosundaki 100.satir ,16.hucredeki datayi verir
        System.out.println(DatabaseUtility.getCellValuewithRowsAndCells(query,100,16));
        String qery1="select * from physician where id=14733";
        //physician 14733 id li datanin bilgilerini verir list olarak verir
        System.out.println("1473 id li data:"+ DatabaseUtility.getRowList(qery1));


    }
}
