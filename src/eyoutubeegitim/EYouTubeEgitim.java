
package eyoutubeegitim;


public class EYouTubeEgitim {

 
    public static void main(String[] args) {
    /*   Customer customer=new Customer();
      customer.setId(123131);
      customer.setCity("Türkiye");
      customer.setName("selami");
      customer.setLastname("kanca");
      CustomerManager customerManager=new CustomerManager(customer);
      customerManager.Save();
      customerManager.delete();
     CrediManager crediManager=new CrediManager();
     crediManager.Calculator();
        Company company=new Company();
     company.setName("arcelik");
     company.setLastname("buzdolabi");
     company.setId(12235);
     
     CustomerManager customerManager1=new CustomerManager(new Person());
    Customer c1=new Customer();
    Customer c2=new Company();
    Customer c3=new Person();
    
     
        
    }
   */ 
    //simdik interface ile calisip benzer islemler yapan programlari bir cati altinda toplayacagiz.
    CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherKreditmanager());
    customerManager.GiveKredit();
    //suan musteri bilgileri ve hangi tip kredi verileceginin bilgileri tek bir satirda girilebiliyor. hesaplamasi 
    //yapilabiliyor
    // bir sinif birden fazla sinifi implemente edebilir
    //bir sinif sadece 1 sinifi extend edebilir
    
}}
