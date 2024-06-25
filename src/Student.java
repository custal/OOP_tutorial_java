public class Student extends Person {
    public boolean atSchool;
    public boolean degree = false;

    public Student(String name, int age, String noise, boolean atSchool) {
        super(name, age, noise);
        this.atSchool = atSchool;
    }

    public void study() {
        System.out.println(this.name + " is studying hard.");
    }
}
