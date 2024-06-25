import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialise Alice and Bob
        Person alice = new Person("alice", 54, "Hi");
        Person bob = new Person("Bob", 56, "Hello");

        // Check if Alice is younger than Bob
        if (alice.age < bob.age) {
            System.out.println("Alice is younger than Bob.");
        } else if (alice.age > bob.age) {
            System.out.println("Alice is older than Bob.");
        } else {
            System.out.println("Alice is the same age as Bob.");
        }

        // Make some noise!
        alice.makeANoise();
        bob.makeANoise();
        alice.nap(5);

        // Inheritance
        System.out.println("\n");
        Student ryo = new Student("Ryo", 12, "Yay", false);
        Student chris = new Student("Chris", 26, "Let's go!", false);
        Student claire = new Student("Claire", 17, "Howdy", true);

        // Check Ryo works
        System.out.println("\n");
        ryo.nap(10);
        ryo.makeANoise();
        ryo.study();

        // Polymorphism and object handling
        System.out.println("\n");
        Dad koichi = new Dad("Koichi", 35, "Woo");
        koichi.nap(7);
        koichi.makeANoise();
        System.out.println(ryo.atSchool);
        koichi.sendToSchool(ryo);
        System.out.println(ryo.atSchool);

        // School example
        System.out.println("\n");
        School school = new School();
        school.enrolStudent(ryo);
        school.enrolStudent(chris);
        school.enrolStudent(claire);
        school.enrolStudent(koichi);
        school.enrolStudent(alice);
        school.enrolStudent(bob);

        int awardNumber = school.awardDegrees();
        System.out.println("There are " + awardNumber + " students with an award.");
        for (Student student: school.studentList) {
            if (student.degree) {
                System.out.println("Congratulations to " + student.name + "!");
            }
        }
    }
}
