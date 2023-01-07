public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов", "Иван", "Иванович", 87_893, 2);
        employee[1] = new Employee("Орлов", "Алексей", "Федорович", 90_456, 4);
        employee[2] = new Employee("Шаталов", "Никита", "Петрович", 95_007, 1);
        employee[3] = new Employee("Селин", "Егор", "Григорьевич", 85_976, 5);
        employee[4] = new Employee("Михайленко", "Александр", "Даниилович", 80_000, 3);
        employee[5] = new Employee("Петров", "Владимир", "Викторович", 88_070, 4);
        employee[6] = new Employee("Нижнин", "Борис", "Николаевич", 120_005, 2);
        employee[7] = new Employee("Пирогов", "Артур", "Алексеевич", 78_000, 5);
        employee[8] = new Employee("Ломаносов", "Юрий", "Степанович", 105_050, 1);
        employee[9] = new Employee("Новиков", "Михаил", "Аркадьевич", 50_076, 2);

        System.out.println("Список всех сотрудников со всеми имеющимися по ним данными:");
        employeeAll(employee);
        System.out.println();

        sumSalary(employee);
        System.out.println();

        minSalary(employee);
        System.out.println();

        maxSalary(employee);
        System.out.println();

        averageSalary(employee);
        System.out.println();

        System.out.println("Список Ф.И.О. всех сотрудников:");
        employeeFIO(employee);
        System.out.println();
    }

    //список всех сотрудников со всеми имеющимися по ним данными
    public static void employeeAll(Employee [] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    //сумма затрат на зарплаты в месяц
    public static void sumSalary(Employee [] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum + "₽");
    }

    //сотрудник с минимальной зарплатой
    public static void minSalary(Employee[] employee) {
        double min = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата из сотрудников: " + min + "₽");
    }

    //сотрудник с максимальной зарплатой
    public static void maxSalary(Employee [] employee) {
        double max = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата из сотрудников: " + max + "₽");
    }

    //среднее значение зарплат
    public static void averageSalary(Employee [] employee) {
        double a = 0;
        for (int i = 0; i < employee.length; i++) {
            a = a + employee[i].getSalary();
        }
        a /= employee.length;
        System.out.println("Среднее значение зарплат сотрудников: " + a + "₽");
    }

    //список Ф.И.О. всех сотрудников
    public static void employeeFIO(Employee [] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurname()+ " " + employee[i].getName()  + " "
                    + employee[i].getPatronymic());
        }
    }
}