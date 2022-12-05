package zoo;

public class Flying extends Bird {

    private final String typeMovement;

    public Flying(String name, int age, String habitat, String typeMovement) {
        super(name, age, habitat);
        this.typeMovement = validateValue(typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    @Override
    public void eat() {
        System.out.println("Питается зернами");
    }

    @Override
    public void go() {
        System.out.println(" гуляет");
    }

    public void walk(){
        System.out.println("гулять");
    }

    @Override
    public void hunt() {

    }

    @Override
    public String toString() {
        return super.toString() + " охотится";
    }
}
