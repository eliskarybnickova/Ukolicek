public class Animal {
    private String name;
    private int age;
    private Race Race;

    public Animal(String name, int age, Race race) {
        this.name = name;
        this.age = age;
        Race = race;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Race='" + Race + '\'' +
                '}';
    }
}