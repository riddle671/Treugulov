package lesson8;

public class Car {
    int c;
    String b;

    static int count;

    public Car(int c1, String b2) {
        count++;
        this.c = c1;
        this.b = b2;

    }

    public static void showcast(){
        Car ca1 = new Car(1,"fdf");
        ca1.c++;
       count++;
    }






    }








