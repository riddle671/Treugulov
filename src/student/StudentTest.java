package student;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student(1,"Ivan", "Kurt", 1992, 6.6,5.4,3.6);
        Student st2 = new Student(2, "Tolya", "Parteev", 1990, 4.5,5.7,8.5);
        Student st3 = new Student(3, "Irina","Olegrova", 1995, 8.6,8.6,9.7);

        System.out.println("sredarif Ivan " + (st1.matem + st1.ekon + st1.inyaz)/3);
        System.out.println("sredarif Tolya " + (st2.matem + st2.ekon + st2.inyaz)/3);
        System.out.println("sredarif Irina " + (st3.matem + st3.ekon + st3.inyaz)/3);
    }
}
