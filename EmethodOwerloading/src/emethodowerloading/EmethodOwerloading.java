/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emethodowerloading;

/**
 *
 * @author selami
 */
public class EmethodOwerloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesapla hesapla=new Hesapla();
        //tekbir method ile 2 farkli islemin yapilmasi methodowerloading.
        System.out.println(hesapla.topla(5, 2));
        System.out.println(hesapla.topla(5, 2, 1));
    }
    
}
