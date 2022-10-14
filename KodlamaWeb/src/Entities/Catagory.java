package Entities;

public class Catagory {
    private int id;
    private  String catagoryName;

    public Catagory() {
        super();
    }

    public Catagory(int id, String catagoryName) {
        super();
        this.id = id;
        this.catagoryName = catagoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }
}
