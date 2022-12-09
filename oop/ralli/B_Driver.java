package ralli;

public class B_Driver<A extends Car> extends Driver implements Participating {

    private A car;

    public A getCar() {
        return car;
    }

    public void setCar(A car) {
        this.car = car;
    }

    public B_Driver(String name) {
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

    public String toString(A car) {
        System.out.println("Водитель " + getName() + " допущен к управлению " + car.getBrand() +
                " " + car.getModel() + " и будет участвовать в заезде");
        return null;
    }

}
