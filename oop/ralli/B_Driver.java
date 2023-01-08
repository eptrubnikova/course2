package ralli;

public class B_Driver<A extends Car> extends Driver implements Participating {

    private A car;

    public A getCar() {
        return car;
    }

    public void setCar(A car) {
        this.car = car;
    }

    public B_Driver(String name, String categoryLicence) {
        super(name, categoryLicence);
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
        System.out.printf("%s заправлет авто", getName());
    }

    public String toString() {
        return "Водитель " + getName();
    }

}
