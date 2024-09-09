package EX_18082024.Collection;

public class Employee {

    private Integer id;

    private  String department;

    public Employee(Integer id, String department) {
        this.id = id;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
