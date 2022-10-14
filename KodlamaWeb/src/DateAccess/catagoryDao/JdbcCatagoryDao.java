package DateAccess.catagoryDao;

import Entities.Catagory;

public class JdbcCatagoryDao implements ICatagoryDao{
    @Override
    public void add(Catagory catagory) {
        System.out.println("Hipernate uzerinden catagory olusturuldu :" + catagory.getCatagoryName());

    }
}
