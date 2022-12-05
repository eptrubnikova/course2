package zoo;

import java.util.Objects;

public abstract class Mammal extends Animal {

    private String habitat;
    private Double speed;

    public Mammal(String name, int age, String habitat, Double speed) {
        super(name, age);
        this.habitat = validateValue(habitat);
        this.speed = validateDouble(speed);
    }

    public static Double validateDouble(Double value) {
        return value == null ? 5.00 : value;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateValue(habitat);
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = validateDouble(speed);
    }

    @Override
    public String toString() {
        return super.toString() + " обитает в " + habitat + ", развивает скорость " + speed + " км/ч";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return habitat.equals(mammal.habitat) && Objects.equals(speed, mammal.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed);
    }
}
