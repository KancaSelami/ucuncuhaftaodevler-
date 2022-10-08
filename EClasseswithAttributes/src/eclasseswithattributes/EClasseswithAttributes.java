
package eclasseswithattributes;


public class EClasseswithAttributes {

 
    public static void main(String[] args) {
       Product  Product = new Product("asus", "leptop", 1500, 5, 12415125, "sari", "sarilep");
        
       
    /*   product.setName("leptop");
       product.setId(1);
       product.setPrice(5000);
       product.setStochAmount(3);
       product.setDescription("asus leptop");
       
        ProductManager productmanager=new ProductManager();
        productmanager.Add(product);
        asagidaki yapida bircok urune extra ozelllik eklenecek ise bu cok zor olur .bunun kolay yolu vardir.
       productmanager.Add2(2, "laptop"," ada", 3, 4);
  simdi yazilacak sistemde sonradan ekleme cok basit.
getter setter metodu ile bu kolaylik saglanir
        System.out.println(product.getId()+ product.getDescription()+" isimli urunun fiyati= "+product.getPrice()+
                " stokta kalan miktar: "+product.getStochAmount());
        /*construction metodu ile urunun butun ozellikleri tek bir satirda girilebiliyor.eger yeni bir ozellik eklenir ise 
        bunu tum kodda uygulamak sadece o kodu constraction metoduna yazmak ile kolaylikla yapilabilir
        */
       
        
        
   
   
    }
    
}
