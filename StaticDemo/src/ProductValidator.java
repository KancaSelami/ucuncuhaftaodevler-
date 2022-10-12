public class ProductValidator {
    // bir fonksiyonun statik yapilmasi o fonksiyonun her yerden cagirilmasini saglar.
    //bir fonksiyonun statik yapilmasi o fonksiyonun surekli bellekte calisiyor sekilde durmasi demektir.
    //static olmaz ise kullanildiginda calisir kullanilmazsa bellekten silinir.
    // ve biz burada bir bilgi girseydik o bilgi herkezde ayni olarak kalirdi.
static {

    System.out.println("static yapici bloc calisti");

    }

    public ProductValidator() {
        System.out.println("yapici blok calisti.");
        //bu sinifin statik fonksiyonu calistirildiginda bu yapici blok calismaz. statik olmayan fonk . calistirildiginda calisir.
    }
    //eger biz static olan programla bilrikte yapici blokta calissin istiyorsak yapici bloku statik olarak tanimliyoruz.

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;

        } else
            return false;
    }
    public void bisey(){


    }
}