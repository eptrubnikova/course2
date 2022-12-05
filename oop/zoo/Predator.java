package zoo;

public class Predator extends Mammal {

    private String typeFood;

    public Predator(String name, int age, String habitat, Double speed, String typeFood) {
        super(name, age, habitat, speed);
        this.typeFood = validateValue(typeFood);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = validateValue(typeFood);
    }


    @Override
    public void eat() {
        System.out.println("Животное ест " + typeFood + ", когда " + hunt());
    }

    @Override
    public void go() {

    }

    public String hunt() {
        return " охотится ";
    }
}
