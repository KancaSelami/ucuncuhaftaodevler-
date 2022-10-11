public class CustomerManager {
ICostomerDal iCostomerDal;

    public CustomerManager(ICostomerDal iCostomerDal) {
        this.iCostomerDal = iCostomerDal;
    }

    public void add(){
   iCostomerDal.add();

        }


        }





