
package epolimorfizm;






public class CustomerManeger {
    private BaseLogger logger;
   public CustomerManeger (BaseLogger logger){
    this.logger=logger;
    }
    public void add(){
    
        System.out.println("Müsteri eklendi.");
        this.logger.log("log mesaji");
    }
}
