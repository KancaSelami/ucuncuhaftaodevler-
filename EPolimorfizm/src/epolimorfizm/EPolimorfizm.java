/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epolimorfizm;

/**
 *
 * @author selami
 */
public class EPolimorfizm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CustomerManeger customermaneger=new CustomerManeger(new EmailLogger());
       customermaneger.add();
       /* özet olarak log siniflari baselogger sinifina extend edildi . sonra bu base logger sinifini calistiracak olan customer manager sinifi olursuturuldu
       bu olusturulan custumer manager sinifinda 
       public CustomerManeger (BaseLogger logger){
    this.logger=logger; kodunu yazarak hangi tip logger yapilacagini ve bunun secilmesini saglayan yol olusturuldu . ve main sayfamizda
       CustomerManeger customermaneger=new CustomerManeger(new EmailLogger());
       customermaneger.Add();
       bu kodu yazarak hangi logger tipinin olusturulmasini ve islem yapilmasini sagladik . hepsini birden yazdirmadik sadece bir logger tipini olusturarak 
       onda islem yaptik yeni log tipleri bu sayede sisteme cok basit bir sekilde entegre edilecbilecek . örnegin : yeni bir log sinifi olusturulur . 
       bu olusturulan sinif baselogger sinifina extend edilerek sisteme dahil edilmis olur .
       */ 
    }
    
}
