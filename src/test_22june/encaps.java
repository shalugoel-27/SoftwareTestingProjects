package test_22june;

public class encaps {
    public static void main(String[] args) {
        Student id = new Student();

        System.out.println();
    }
}
class Employee{
    private int id;
   private String name;
  private Long  salary;

    public Employee(int id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}