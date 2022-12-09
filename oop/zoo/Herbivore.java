package zoo;

import java.util.Objects;

import static zoo.Validation.validateValue;

public class Herbivore extends Mammal{

    private String typeFood;

    public Herbivore(String name, int age, String habitat, Double speed, String typeFood) {
        super(name, age, habitat, speed);
        this.typeFood = validateValue(typeFood);
    }

    @Override
    public void eat() {
        System.out.println("Животное ест " + typeFood + ", когда " + graze());
    }

    @Override
    public void go() {
        System.out.println("гуляет");
    }

    public String graze() {
        return "пасутся на лугу";
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = validateValue(typeFood);
    }

    @Override
    public String toString() {
        return super.toString() + ", питается " + typeFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }
}
