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
        System.out.println("Начинаю гонку");

    }

    @Override
    public void stop() {
        System.out.println("Завершаю гонку");

    }

    @Override
    public void refuel() {
        System.out.println("Заправляю авто");

    }

    public String toString(B truck) {
        System.out.println("Водитель " + getName() + " допущен к управлению " + truck.getBrand() +
                " " + truck.getModel() + " и будет участвовать в заезде");
        return null;
    }
}
