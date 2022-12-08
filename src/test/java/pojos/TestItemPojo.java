package pojos;

public class TestItemPojo {
/*
{
  "createdBy": "string",
  "createdDate": "2022-12-07T07:30:21.440Z",
  "defaultValMax": "string",
  "defaultValMin": "string",
  "description": "string",
  "id": 0,
  "name": "string",
  "price": 0
}
 */
    private String name;
    private String description;
    private Integer price;
    private String defaultValMin;

    public TestItemPojo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TestItemPojo{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    private String  defaultValMax;

    public TestItemPojo(String name, String description, Integer price, String defaultValMin, String defaultValMax) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.defaultValMin = defaultValMin;
        this.defaultValMax = defaultValMax;
    }
}
