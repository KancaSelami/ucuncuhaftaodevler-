package Bussiness;

import DateAccess.instructor.IInstructorDao;
import Entities.Instructor;
import Logging.Ilogger;

import java.util.List;

public class InstructorManager {
    private IInstructorDao iInstructorDao;
    private Ilogger[] iloggers;
    private List<Instructor> instructors;

    public InstructorManager(IInstructorDao iInstructorDao, Ilogger[] iloggers, List<Instructor> instructors) {
        super();
        this.iInstructorDao = iInstructorDao;
        this.iloggers = iloggers;
        this.instructors=instructors;
    }
    public void add(Instructor instructor)throws Exception{
        for (Instructor ins:instructors){
            if((instructor.getEducatorName().equalsIgnoreCase(ins.getEducatorName()))&&instructor.getEducatorLastName().equalsIgnoreCase(ins.getEducatorLastName())){
                throw new Exception("ayni isim ve soyisimde ogretmen eklenemez.");
            }

        }
        for (Ilogger logla:iloggers){
            logla.log(instructor.getEducatorName()+" "+instructor.getEducatorLastName()+" " +instructor.getEducatorId()+" numarasi ile sisteme eklendi.");
        }
        iInstructorDao.add(instructor);
        instructors.add(instructor);
    }
}
