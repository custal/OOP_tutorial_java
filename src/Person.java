public class Person {
    public String name;
    public int age;
    public String noise;

    public Person(String name, int age, String noise) {
        this.name = name;
        this.age = age;
        this.noise = noise;
    }

    public void makeANoise() {
        System.out.println(this.name + " says '" + this.noise + "'.");
    }

    public void nap(int duration) {
        String zStr = "";
        for (int i = 0; i < duration; i++) {
            zStr += "z";
        }
        System.out.println(this.name + " says '" + zStr + "'.");
    }
}