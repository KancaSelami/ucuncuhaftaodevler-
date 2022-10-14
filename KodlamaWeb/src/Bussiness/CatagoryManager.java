package Bussiness;

import DateAccess.catagoryDao.ICatagoryDao;
import Entities.Catagory;
import Logging.Ilogger;

import java.util.List;

public class CatagoryManager {
    private ICatagoryDao catagoryDao;
    private List<Catagory> catagories;
    private Ilogger[] iloggers;

    public CatagoryManager(ICatagoryDao catagoryDao, List<Catagory> catagories, Ilogger[] iloggers) {
        this.catagoryDao = catagoryDao;
        this.catagories = catagories;
        this.iloggers = iloggers;
    }

    public void add(Catagory catagory) throws Exception {
        for (Catagory ct : catagories) {
            if (catagory.getCatagoryName().equalsIgnoreCase(ct.getCatagoryName())) {
                throw new Exception("ayni isimde baska bir katagori ismi olustuurlamaz: "+catagory.getCatagoryName() );
            }continue;
        }
        for (Ilogger logla : iloggers) {
            logla.log(catagory.getCatagoryName());
        }

        catagories.add(catagory);

    }
}
