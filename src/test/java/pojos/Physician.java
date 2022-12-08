package pojos;

public class Physician {

    private Integer Id;
    private String FirstName;
    private String LastName;

    public Physician() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    @Override
    public String toString() {
        return "Physician{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public Physician(Integer id, String firstName, String lastName) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
    }
}



