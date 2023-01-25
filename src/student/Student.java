package student;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "nombel=" + nombel +
                ", name='" + name + '\'' +
                ", famil='" + famil + '\'' +
                ", yearstudy=" + yearstudy +
                ", matem=" + matem +
                ", ekon=" + ekon +
                ", inyaz=" + inyaz +
                '}';
    }

    public Student(int nombel, String name, String famil, int yearstudy, double matem, double ekon, double inyaz) {
        this.nombel = nombel;
        this.name = name;
        this.famil = famil;
        this.yearstudy = yearstudy;
        this.matem = matem;
        this.ekon = ekon;
        this.inyaz = inyaz;
    }

    int nombel;
        String name;
        String famil;
        int yearstudy;
        double matem;
        double ekon;
        double inyaz;

        }





