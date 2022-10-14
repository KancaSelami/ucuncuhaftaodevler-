package DateAccess.instructor;

import Entities.Instructor;

public class HypernateInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("hypernate uzerinden ogretmen eklendi : " + instructor.getEducatorLastName());
    }
}
