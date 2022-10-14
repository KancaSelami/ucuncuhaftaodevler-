package Entities;

public class Instructor {
    private int educatorId;
    private  String educatorName;
    private  String educatorLastName;

    public Instructor() {
    }

    public Instructor(int educatorId, String educatorName, String educatorLastName) {
        super();
        this.educatorId = educatorId;
        this.educatorName = educatorName;
        this.educatorLastName = educatorLastName;
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getEducatorName() {
        return educatorName;
    }

    public void setEducatorName(String educatorName) {
        this.educatorName = educatorName;
    }

    public String getEducatorLastName() {
        return educatorLastName;
    }

    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
}
