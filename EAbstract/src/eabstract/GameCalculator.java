/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eabstract;

/**
 *
 * @author selami
 */
public abstract class GameCalculator {
    //abstrackt bir sinifin icinde abstrackt komut veya final komutu olabilirde olmayabilirde.
    public abstract void  hesapla();
    //abstract sinifi bu hesaplama komuut her sinifta olacak ve farkli farkli demek abstract
    //abstrackt edilmis komut siniflarda olmak zorunda 
    
    public final void gameOver(){
    // final demek bu gameOver komutu degistirilemez herkez icin ayni demek
    
        System.out.println("oyun bitti.");
    }
    
}
