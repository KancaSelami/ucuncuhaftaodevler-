
package eabstractdemo;


public class EAbstractDemo {

   
    public static void main(String[] args) {
      CustomerManager customerManager=new CustomerManager();
     
    customerManager.getCustomers(new OracleDataManager());
    }
    
}
