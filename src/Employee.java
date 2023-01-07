import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private double salary;
    private int department;
    private int id;
    public static int count = 0;

    public Employee(String surname, String name, String patronymic, double salary, int department) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        this.id = id;
        id = count++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "ФИО = " + surname + " " + name + " " + patronymic + ", зарплата = " + salary +  "₽" +
                ", отдел = " + department + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id
                && Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name)
                && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic, salary, department, id);
    }
}
