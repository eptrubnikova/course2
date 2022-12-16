package zoo;

import static zoo.Validation.validateValue;

public class Flyingless extends Bird{

    private String typeMovement;

    public Flyingless(String name, int age, String habitat, String habitat1) {
        super(name, age, habitat);
        this.typeMovement = validateValue(habitat);
    }


    @Override
    public void eat() {
        System.out.println("питается рыбой");
    }

    @Override
    public void go() {
        System.out.println("летают");
    }

    public void fly() {
        System.out.println("летают");
    }

    @Override
    public void hunt() {
        System.out.println("охотятся");
    }

    @Override
    public String getHabitat() {
        return typeMovement;
    }

    @Override
    public void setHabitat(String habitat) {
        this.typeMovement = validateValue(habitat);
    }

    @Override
    public String toString() {
        return super.toString() + " охотится";
    }
}
