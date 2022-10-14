import Bussiness.CatagoryManager;
import Bussiness.CourseManager;
import Bussiness.InstructorManager;
import DateAccess.catagoryDao.HipernateCatagoryDao;
import DateAccess.course.JdbcCourseDao;
import DateAccess.instructor.HypernateInstructorDao;
import Entities.Catagory;
import Entities.Course;
import Entities.Instructor;
import Logging.DateBaseLogger;
import Logging.FileLogger;
import Logging.Ilogger;
import Logging.MailLogger;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        //öncelikler katagorilerimizi olusturalim.
        Catagory catagory=new Catagory(1,"Spor");
        Catagory catagory1=new Catagory(2,"Sanat");
      //  Catagory catagory2=new Catagory(3,"Sanat");
        //burada ayni isimde katagory ismi girildi ve hata calisti.
        List<Catagory> catagories=new ArrayList<>();
        Ilogger[] iloggers={new DateBaseLogger(),new FileLogger(),new MailLogger()};
        CatagoryManager catagoryManager=new CatagoryManager(new HipernateCatagoryDao(),catagories,iloggers);
        catagoryManager.add(catagory);
        catagoryManager.add(catagory1);
    //    catagoryManager.add(catagory2);

        //simdik kurslari olusturalim.

        Course course=new Course(11,"Futbol",1200);
        Course course1=new Course(12,"Basketbol",1500);
     //   Course course2=new Course(22,"basketbol",1500);
        List<Course>courses=new ArrayList<>();
        CourseManager courseManager=new CourseManager(new JdbcCourseDao(),courses,iloggers);
        courseManager.add(course);
        courseManager.add(course1);
       // courseManager.add(course2);
        //ayni isimde kurs ismi olusturuldu ve hata calisti.

        // simdik egitmenleri olusturalim.
        Instructor instructor=new Instructor(111,"Selami","Kanca");
        Instructor instructor1=new Instructor(112,"Selami","Adigüzel");
      //  Instructor instructor2=new Instructor(113,"selami","kanca");
        List<Instructor>instructors=new ArrayList<>();
        InstructorManager instructorManager=new InstructorManager(new HypernateInstructorDao(),iloggers,instructors);
        instructorManager.add(instructor);
        instructorManager.add(instructor1);
     //   instructorManager.add(instructor2);
        //ayni isim ve soyisimde egitmen sisteme eklenemedi harfleri kucuk veya buyuk olsada.
      System.out.println("  ZOR OLSADA YOLLAR ÜZERINDEN GECTIKCE DÜZLESIR VE ASILMASI KOLAYLASIR::: ... ");





    }
}