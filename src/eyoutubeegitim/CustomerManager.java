/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eyoutubeegitim;

/**
 *
 * @author selami
 */
public class CustomerManager {
   private Customer customer;
private ICreditManager iCreditManager;

    public CustomerManager(Customer customer, ICreditManager iCreditManager) {
        this.customer = customer;
        this.iCreditManager = iCreditManager;
    }

   
   
   
    public void Save( ){
        System.out.println("musteri kayit edildi "+customer.getName()+customer.getLastname());
    }
public void delete(){
    System.out.println("musteri silindi " + customer.getName()+customer.getLastname());
}
    public void GiveKredit(){
    this.iCreditManager.save();
        System.out.println("kredi verildi.");
    }
}
