package lesson5.student;

public class StudentTest1{
    public static void main(String[] args) {
        Student st1 = new Student(456, "Ivan", "Dorn", 1965, 4.5, 5.6,9.8);
        Student st2 = new Student(456,"ina", "rar",5);
        st2.matem = 1.1;
        st2.ekon = 9.9;
        st2.inyaz = 8.8;
        Student st3 = new Student();
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);







    }

}


