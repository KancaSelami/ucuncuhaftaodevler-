public class Main {
    public static void main(String[] args) {
ProductManager manager=new ProductManager();
Product product=new Product();
product.name="mause";
product.price=25;
product.id=23564;
manager.add(product);
// javada main sinifi haricinde siniflar static olamiyor.
        DataBaseHelper.Crud.Connection();
//yukarida static olmayan birsinifin static fonksiyonlarini calistitrabildik.inner static olarak geciyor
    }
}