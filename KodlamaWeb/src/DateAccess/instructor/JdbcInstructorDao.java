package DateAccess.instructor;

import Entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc uzerinden ogretmen eklendi : " + instructor.getEducatorLastName());

    }
}
