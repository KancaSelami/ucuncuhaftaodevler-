
package einteritancedemo;


public class EinteritanceDemo {

   
    public static void main(String[] args) {
      KrediUI krediUI=new KrediUI();
      krediUI.KrediHesapla(new AskerKrediHesapla());
      
      /*+hesaplama islemini ayri bir sinifta yapmak ve hesaplanacak turleri if ile degilde siniflar ile birbirinden ayirip hesaplama islemlerini
  yeni bir sinif olusturuldugunda onun sisteme eklenmesini dsaha kolay hale getirecektir.    
*/
      
      
     /*                                          T.K,Ö.K,A.K hesaplanacak krediler
                                  BaseKRedi sinifi hesaplama islemi kredi turleri buraya extend edildi.     
             KrediUI ise bu basekredi hesaplama islemini yapan sinifi cagiran sinif buradaki komut ile base kredi cagirilir ve her turden kredi hesabi kolaylikla yapilir
      yeni kredi turleri yeni bir sinif olusturularak base kredi sinifina extend edilerek sisteme dahil eddilmis olur.
      
      
      */ 
    }
    
}
