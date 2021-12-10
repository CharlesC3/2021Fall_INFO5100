package Question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Student Tina = new Student(1, "Tina", 2.3, new SimpleDateFormat("yyyy-MM-dd").parse("1997-11-01"));
        Student Kristen = new Student(2, "Kristen", 3.5, new SimpleDateFormat("yyyy-MM-dd").parse("2000-06-30"));
        Student Jason = new Student(3, "Jason", 3.6, new SimpleDateFormat("yyyy-MM-dd").parse("1995-01-21"));
        Student Andy = new Student(4, "Andy", 4.0, new SimpleDateFormat("yyyy-MM-dd").parse("2003-12-09"));
        List<Student> list = new ArrayList<>();
        list.add(Tina);
        list.add(Kristen);
        list.add(Jason);
        list.add(Andy);

        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(list, Main::NameComparator);
        for(Student student : list) print(student);

        System.out.println("Sort by ascending order of 'gpa'");
        Collections.sort(list, Main::GpaComparator);
        for(Student student : list) print(student);

        System.out.println("Sort by ascending order of 'dateOfBirth'");
        Collections.sort(list, Main::DateOfBirthComparator);
        for(Student student : list) print(student);
    }

    public static int NameComparator(Student a, Student b) {
        return a.name.compareTo(b.name);
    }

    public static int GpaComparator(Student a, Student b) {
        if(a.gpa > b.gpa) return -1;
        else if (a.gpa > b.gpa) return 0;
        else return 1;
    }


    public static int DateOfBirthComparator(Student a, Student b) {
        return a.dateOfBirth.compareTo(b.dateOfBirth);
    }

    public static void print(Student student) {
        System.out.print("ID: " + student.id + " Name: " + student.name + " Gpa: " + student.gpa + " DateOfBirth: " + student.dateOfBirth);
        System.out.println();
    }
}
