package lesson5.emplo;

 public class Employee {
    int id;
    String surname;
    public int age;
    int salary;
    String departament;
    public static int z = 10;



     public Employee(int id, String surname, int age, int salary, String departament) {
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



    public static void hoop() {
        System.out.println("gavno");
    }


}
