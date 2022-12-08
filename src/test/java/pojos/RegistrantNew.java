package pojos;

public class RegistrantNew {

private String Ssn;
private String FirstName;
private String LastName;
private String Login;
private String Email;
private String Password;
private String saveData;

    public RegistrantNew() {
    }

    public String getSsn() {
        return Ssn;
    }

    public void setSsn(String ssn) {
        Ssn = ssn;
    }

    @Override
    public String toString() {
        return "RegistrantNew{" +
                "Ssn='" + Ssn + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Login='" + Login + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", saveData='" + saveData + '\'' +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSaveData() {
        return saveData;
    }

    public void setSaveData(String saveData) {
        this.saveData = saveData;
    }

    public RegistrantNew(String ssn, String firstName, String lastName, String login, String email, String password, String saveData) {
        Ssn = ssn;
        FirstName = firstName;
        LastName = lastName;
        Login = login;
        Email = email;
        Password = password;
        this.saveData = saveData;
    }
}
