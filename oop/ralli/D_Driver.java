package ralli;

public class D_Driver <T extends BusRalli> extends Driver implements Participating{

    private T bus;

    public D_Driver(String name, String categoryLicence, T bus) {
        super(name, categoryLicence);
        this.bus = bus;
    }

    public T getBus() {
        return bus;
    }

    public void setBus(T bus) {
        this.bus = bus;
    }

    @Override
    public void start() {
        System.out.printf("Водитель %s начинает гонку", getName());
    }

    @Override
    public void stop() {
        System.out.printf("%s завершает гонку", getName());
    }

    @Override
    public void refuel() {
        System.out.printf("%s заправляет авто", getName());
    }

    public String toString(T bus) {
        System.out.println("Водитель " + getName() + " допущен к управлению " + bus.getBrand() +
                " " + bus.getModel() + " и будет участвовать в заезде");
        return null;
    }
}
