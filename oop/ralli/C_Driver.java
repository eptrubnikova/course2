package ralli;

public class C_Driver <B extends Truck> extends Driver implements Participating {

    private B truck;

    public B getTruck() {
        return truck;
    }

    public void setTruck(B truck) {
        this.truck = truck;
    }

    public C_Driver(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.printf("%s начинает гонку", getName());

    }

    @Override
    public void stop() {
        System.out.printf("%s завершает гонку", getName());

    }

    @Override
    public void refuel() {
        System.out.printf("%s заправляет авто", getName());

    }

    public String toString(B truck) {
        System.out.println("Водитель " + getName() + " допущен к управлению " + truck.getBrand() +
                " " + truck.getModel() + " и будет участвовать в заезде");
        return null;
    }
}
