package ralli;

public class D_Driver <T extends BusRalli> extends Driver implements Participating{

    private T bus;

    public D_Driver(String name) {
        super(name);
    }

    public T getBus() {
        return bus;
    }

    public void setBus(T bus) {
        this.bus = bus;
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

    public String toString(T bus) {
        System.out.println("Водитель " + getName() + " допущен к управлению " + bus.getBrand() +
                " " + bus.getModel() + " и будет участвовать в заезде");
        return null;
    }
}
