import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Student> studentList = new ArrayList<>();

    // Type checking method
    public void enrolStudent(Person person) {
        if (person instanceof Student) {
            System.out.println(person.name + " has been enrolled at school");
            studentList.add((Student) person);
        } else {
            System.out.println(person.name + " says 'I'm not a student!'");
        }
    }

    // Overload method
//    public void enrolStudent(Student student) {
//            System.out.println(student.name + " has been enrolled to school");
//            studentList.add(student);
//    }
//
//    public void enrolStudent(Person person) {
//        System.out.println(person.name + " says 'I'm not a student!'");
//    }

    public int awardDegrees () {
        int awardNumber = 0;
        for (Student student : studentList) {
            if (student.atSchool) {
                student.degree = true;
                student.makeANoise();
                awardNumber += 1;
            } else {
                student.nap(5);
            }
        }

        return awardNumber;
    }
}
