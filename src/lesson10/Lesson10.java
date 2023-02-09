package lesson10;

import  lesson5.emplo.*;
import static lesson5.emplo.Employee.z;

public class Lesson10 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12,"fgf",343,664,"ghgh");
        System.out.println(emp1.age);
        System.out.println(Employee.z);
        System.out.println(z);
        Employee.z = 19;





    }}