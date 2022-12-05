package zoo;

import java.util.Objects;

public class Amphibian extends Animal {

    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        this.habitat = validateValue(habitat);
    }

    public void eat (){
        System.out.println("Животное питается насекомыми.");
    }

    public  void go(){
        System.out.println("Гуляет в траве.");
    }

    public String hunt() {
        return " охотится ";
    }

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
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
