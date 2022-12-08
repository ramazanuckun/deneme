package stepDefinitions.DB_StepDefs;

import org.junit.Test;
import utilities.DatabaseUtility;

import java.util.List;

public class DB_01 {
    @Test
    public void name() {
        DatabaseUtility.createConnection();
        String query="select *from public.jhi_user";

        List<Object>allData=DatabaseUtility.getColumnData(query,"ssn");

      //  System.out.println(allData);

List<String>columnNames=DatabaseUtility.getColumnNames(query);
        System.out.println(columnNames);

        for (int i = 0; i <columnNames.size() ; i++) {

            List<Object>allDataa=DatabaseUtility.getColumnData(query, columnNames.get(i));
            System.out.println(allDataa);

        }


    }
}
