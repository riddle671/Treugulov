package lesson8;

public class Car2 {

    public static final double pi = 3.14;
    int radius;


    public double areaСircle(int radius2){
        this.radius = radius2;
        double result1 = pi * radius2 * radius2;
        System.out.println(result1);
        return result1;
        }
        public static double circumference(int radius3){
            Car2 ca4 = new Car2();
            ca4.radius = radius3;
        double result2 = 2* pi * ca4.radius;
        System.out.println(result2);
        return result2;
        }
        public void result(int radius5){
            System.out.println("Радиус " + radius5 + "Площдь круга " + areaСircle(radius5) + "Длина окружности" + circumference(radius5));

        }




    }

