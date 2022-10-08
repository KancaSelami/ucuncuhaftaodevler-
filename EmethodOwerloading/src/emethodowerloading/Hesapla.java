/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emethodowerloading;

/**
 *
 * @author selami
 */
public class Hesapla {
    // burada ayni isim ile olan farkli iki islem metodunun ayni isim ile cagril masi ve 2 veya 3 sayiyi toplamanin ayni metod altinda tekbir metot ile 
    //cagirilmasina method owerloading denir.
    public int topla(int sayi1, int sayi2){
    
    return sayi1+sayi2;
    }
    public int topla (int sayi1, int sayi2, int sayi3){
    
    return sayi1 + sayi2+ sayi3;
    }
}
