public class Dad extends Person {
    public Dad(String name, int age, String noise) {
        super(name, age, noise);
    }
    @Override
    public void nap(int duration) {
        System.out.println(this.name + " says 'I don't take naps!'");
    }

    public void sendToSchool(Student student) {
        System.out.println("Time for school!");
        student.atSchool = true;
    }
}

