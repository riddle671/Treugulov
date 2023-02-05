package lesson5.student;

public class Student {

        int id;
        String name;
        String famil;
        int cource;
        double matem;
        double ekon;
        double inyaz;


    public Student(int id, String name, String famil, int cource, double matem, double ekon, double inyaz) {
        this.id = id;
        this.name = name;
        this.famil = famil;
        this.cource= cource;
        this.matem = matem;
        this.ekon = ekon;
        this.inyaz = inyaz;
    }



    public Student (int id, String name, String famil, int cource){
        this.id = id;
        this.name = name;
        this.famil = famil;
        this.cource = cource;


    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", famil='" + famil + '\'' +
                ", cource=" + cource +
                ", matem=" + matem +
                ", ekon=" + ekon +
                ", inyaz=" + inyaz +
                '}';
    }


}













