/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eyoutubeegitim;

/**
 *
 * @author selami
 */
public abstract class BaseKreditManager implements ICreditManager {

    public abstract void Calculator();
    // buradaki abstrak heryerde farklidir.

    public  void  Save() {
        //bu kismi her yerde ayni.
        System.out.println("kaydedildi.");
    }
}
