
package eabstract;


public class EAbstract {

    public static void main(String[] args) {
 WomanGameCalculator woman=new WomanGameCalculator();
 woman.hesapla();
 //bu abstract yapisi kullanilirken tanimlama soyle yapilirsa yeni siniflarin eklemesi ozelliklerin eklenmesi daha guzel olur.
 // GAmecCalculator gamecalculator=new WomenGameCalculator(); seklinde calistirilip yeni siniflar eklenerek islem kolayligi saglanir
 
 GameCalculator gameCalculator=new GameCalculator() {
     @Override
     public void hesapla() {
         System.out.println("puanniniz 95");
     }
 };
    }
    
}
