package ralli;

public class D_Driver <T extends BusRalli> extends Driver implements Participating{

    private T bus;

    public D_Driver(String name, String categoryLicence) {
        super(name, categoryLicence);
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

    public String toString() {
       return "Водитель " + getName();
    }
}
