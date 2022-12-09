package zoo;

import java.util.Objects;

import static zoo.Validation.validateValue;

public abstract class Animal  {

    private String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = validateValue(name);
        this.age = validateInt(age);
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Животное спит");
    }

        public static int validateInt(int value) {
        return value == 0 ? 1 : value;
    }

    public abstract void go();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateValue(name);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Животное по кличке " + name + ", возрастом " + age + " лет ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
