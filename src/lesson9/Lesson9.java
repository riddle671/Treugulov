package lesson9;

public class Lesson9 {

    int a = 1;
    static int b = 2;
     void abc (int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Lesson9.b);

    }

    public static void main(String[] args) {
        Lesson9 les = new Lesson9();
        les.abc(4);


    }



    }










