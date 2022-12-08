package stepDefinitions.DB_StepDefs;

import org.junit.Assert;
import org.junit.Test;
import utilities.DatabaseUtility;
import utilities.ReadTxt;

import java.util.ArrayList;
import java.util.List;

public class DB_Test02 {

    @Test
    public void name() {

        //1-DataBase ile baglanti kur
        DatabaseUtility.createConnection();
        String query="select *from physician";
        System.out.println(DatabaseUtility.getColumnNames(query));
        //[id, first_name, last_name, birth_date, phone, gender, blood_group, adress,
        // description, created_date, user_id, country_id, cstate_id,
        // created_by, last_modified_by, last_modified_date, speciality, exam_fee, image, image_content_type]

// Id lere ulasma

        System.out.println("========= ID LIST=============");
        List<Object>idlist=DatabaseUtility.getColumnData(query,"id");
        System.out.println(idlist+"\n");

        String filaname1="src/test/resources/testdata/DoktorID.txt";
        WriteToTxt.savePhysicianIds(filaname1,idlist);//
        //ID leri dogrulama

List<Object>actualPhysician= ReadTxt.returnPhysicianIDsList(filaname1);
List<Object>expectedPhysicianIDs=new ArrayList<>();
expectedPhysicianIDs.add(229037);
expectedPhysicianIDs.add(362086);
       // Assert.assertTrue("Id ler uyusmuyor",actualPhysician.contains(expectedPhysicianIDs));



        //Doctor isimlerine ulasma ve kaydetme
        System.out.println("=======PHYSICIAN LIST========");
        List<Object>nameList=DatabaseUtility.getColumnData(query,"first_name");
        System.out.println(nameList+"\n");
        String filaname2="src/test/resources/testdata/DoctorName.txt";
        WriteToTxt.savePhysicianFirstName(filaname2,nameList);

        //isimleri dogrulama
        List<String>actualPhyscianNames=ReadTxt.returnPhysicianFirstName(filaname2);
        List<String>expectedPhysicianNames=new ArrayList<>();
        expectedPhysicianNames.add("swaggar");
       Assert.assertTrue("Isimler uyusmuyor",actualPhyscianNames.contains(expectedPhysicianNames));


    }
}
