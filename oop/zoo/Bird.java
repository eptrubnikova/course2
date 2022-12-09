package zoo;

import java.util.Objects;

import static zoo.Validation.validateValue;

public abstract class Bird extends Animal {

    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = validateValue(habitat);
    }

    public abstract void hunt();

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateValue(habitat);
    }

    @Override
    public String toString() {
        return super.toString() + " обитает в " + habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
