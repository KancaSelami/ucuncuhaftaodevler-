package DateAccess.course;

import Entities.Course;

public class JdbcCourseDao implements  ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc sistemi uzerinden course loglandi : " + course.getCourseName());
    }
}
