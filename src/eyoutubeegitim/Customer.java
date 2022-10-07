
package eyoutubeegitim;


public class Customer {

    public Customer() {
        System.out.println("musteri nesnesi baslatildi.");
    }
    
    private int id;
    private String name;
    private String lastname;
    
    private String city;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
