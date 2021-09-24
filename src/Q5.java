import java.util.*;
class Student {
    String firstName;
    double score;
    double age;

    public Student(String firstName, double score, double age) {
        this.firstName = firstName;
        this.score = score;
        this.age = age;
    }
}

class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.firstName.compareTo(s2.firstName);
    }
}

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.score == s2.score)
            return new FirstNameComparator().compare(s1, s2);
        else
            return (int) (s1.score - s2.score);
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Sumit",71,21));
        studentList.add(new Student("Divas", 78.8, 24));
        studentList.add(new Student("Gunjan", 86.5, 27));
        studentList.add(new Student("Rubal", 89.9, 22));
        Collections.sort(studentList, new ScoreComparator());

        for (Student s : studentList)
            System.out.println(s.firstName + " is " + s.age + " and has scored " + s.score);
    }
}