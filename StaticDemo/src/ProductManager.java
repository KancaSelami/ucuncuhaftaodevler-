import java.time.Clock;

public class ProductManager {
    public void add(Product product){

   //ProductValidator un isVAlid programini static tanimladigimizdan oturu asagidaki gibi cagirabildik .
   if(ProductValidator.isValid(product)){
       System.out.println("urun bilgileri eklendi");
   }else {
       System.out.println("urun bilgileri gecersiz.");
   }
   //asagida ise static olmayan bir fonksiyon calistirildiginda yapici blok calisacaktir.

        ProductValidator validator=new ProductValidator();
        validator.bisey();
    }
// simdik ProductVAlidatorun icindeki bisey programini cagirabilmemiz icin ProductValid i new lememiz gerekiyor.

   //oldugu gibi.


}
