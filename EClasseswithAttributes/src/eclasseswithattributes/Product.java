package eclasseswithattributes;

public class Product {

    //costruction metodunda getter setter yoktur tek satirda tanimlama yapilir
// atributes yada field denir bu bilgilere
    public Product(String name, String description, double price, int stochAmount, int id, String renk, String kod) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stochAmount = stochAmount;
        this.id = id;
        this.renk = renk;
        this.kod = kod;
        System.out.println("urun eklendi");
    }
public Product(){
}
    private String name;
    private String description;
    private double price;
    private int stochAmount;
    private int id;
    private String renk;
    private String kod;
}
/*
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStochAmount() {
        return stochAmount;
    }

    public void setStochAmount(int stochAmount) {
        this.stochAmount = stochAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
 */
