package hw6;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    int math;
    int economy;
    int eng;
    double avg;

    int sum;

}


class StudentTest {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        //id
        student1.id = 1;
        student2.id = 2;
        student3.id = 3;
        //name
        student1.name = "Misha";
        student2.name = "Maksim";
        student3.name = "Ivan";
        //surname
        student1.surname = "Krutii";
        student2.surname = "Oposhniy";
        student3.surname = "Kozlov";
        //year
        student1.year = 2019;
        student2.year = 2017;
        student3.year = 2010;
        //math
        student1.math = 8;
        student2.math = 7;
        student3.math = 11;
        //economy
        student1.economy = 10;
        student2.economy = 9;
        student3.economy = 6;
        //english
        student1.eng = 6;
        student2.eng = 8;
        student3.eng = 10;
        //sum
        student1.sum = student1.math + student1.economy + student1.eng;
        student2.sum = student2.math + student2.economy + student2.eng;
        student3.sum = student3.math + student3.economy + student3.eng;
        //avg
        student1.avg = student1.sum / 3.0;
        student2.avg = student2.sum / 3.0;
        student3.avg = student3.sum / 3.0;

        //student1 (Misha)
        System.out.println("------------------------------");
        System.out.println("id: " + student1.id);
        System.out.println("Name: " + student1.name);
        System.out.println("Surname: " + student1.surname);
        System.out.println("Year of study : " + student1.year);
        System.out.println("Math: " + student1.math);
        System.out.println("Economy: " + student1.economy);
        System.out.println("English: " + student1.eng);
        System.out.println("Average: " + student1.avg);
        System.out.println("------------------------------");
        //student1 (Maksim)
        System.out.println("id: " + student2.id);
        System.out.println("Name: " + student2.name);
        System.out.println("Surname: " + student2.surname);
        System.out.println("Year of study : " + student2.year);
        System.out.println("Math: " + student2.math);
        System.out.println("Economy: " + student2.economy);
        System.out.println("English: " + student2.eng);
        System.out.println("Average: " + student2.avg);
        System.out.println("------------------------------");
        //student1 (Ivan)
        System.out.println("id: " + student3.id);
        System.out.println("Name: " + student3.name);
        System.out.println("Surname: " + student3.surname);
        System.out.println("Year of study : " + student3.year);
        System.out.println("Math: " + student3.math);
        System.out.println("Economy: " + student3.economy);
        System.out.println("English: " + student3.eng);
        System.out.println("Average: " + student3.avg);
        System.out.println("------------------------------");

    }
}
