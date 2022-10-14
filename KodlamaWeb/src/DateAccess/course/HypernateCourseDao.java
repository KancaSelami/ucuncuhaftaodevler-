package DateAccess.course;

import Entities.Course;

public class HypernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate uzerinden kurs loglandi : " + course.getCourseName());
    }
}
