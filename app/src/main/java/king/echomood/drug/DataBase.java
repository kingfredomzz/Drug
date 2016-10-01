package king.echomood.drug;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class DataBase extends RealmObject {

    private  int quantity;
    @PrimaryKey
    private String name;
    private  String company;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
