public class Student extends User{

    private String branch;

    public Student(int id, String name, int age, String branch, int schoolNumber) {
        super(id, name, age);
        this.branch = branch;
        this.schoolNumber = schoolNumber;
    }

    private int schoolNumber;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
}
