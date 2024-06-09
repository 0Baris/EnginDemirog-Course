public class Instructor extends User{

    public Instructor(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
    }

    private String department;


    public String getBranch() {
        return department;
    }

    public void setBranch(String department) {
        this.department = department;
    }
}
