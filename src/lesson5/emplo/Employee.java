package lesson5.emplo;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String departament;


     Employee(int id, String surname, int age, int salary, String departament) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }

    void uvelichit() {
        salary *= 2;
        System.out.println("Увеличение вдвое " + salary * 2);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", departament='" + departament + '\'' +
                '}';
    }

    public static void hoop() {
        System.out.println("gavno");
    }


}
