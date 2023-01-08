package ralli;

import java.util.Arrays;
import java.util.List;


public class Car extends TransportRalli implements Competing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String nameBodyCar;

        BodyType(String nameBodyCar) {
            this.nameBodyCar = nameBodyCar;
        }

        public String getNameBodyCar() {
            return nameBodyCar;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + nameBodyCar;
        }
    }

    public static final String REFUELING = "заправка топливом";
    public static final String TIRE_CHANGE = "смена шин";
    public static final String DRIVER_CHANGE = "смена водителя";
    public static final String QUICK_REPAIR = "быстрый ремонт";
    public static final String[] ALL_ACTION = {REFUELING, TIRE_CHANGE, DRIVER_CHANGE, QUICK_REPAIR};
    private int speed;
    private double besTime;
    private BodyType bodyType;
    private B_Driver driver;
    private List<Car> cars;
    private final List<Mechanic<Car>> mechanics;

    public Car(String brand, String model, double engineVolume, B_Driver driver, Mechanic<Car>... mechanics) {
        super(brand, model, engineVolume);
        this.driver = driver;
        this.mechanics = Arrays.asList(mechanics);
    }

    public double getBesTime() {
        return besTime;
    }

    public void setBesTime(double besTime) {
        this.besTime = Validate.validateValue(besTime);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Validate.validateSpeed(speed);
    }

    public List<Mechanic<Car>> getMechanics() {
        return mechanics;
    }

    public B_Driver getDriver() {
        return driver;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void setDriver(B_Driver driver) {
        this.driver = driver;
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public void startMoving() {
        System.out.println("старт");
    }

    @Override
    public void finishMoving() {
        System.out.println("финиш");
    }


    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.printf("У автомобиля %s %s %s \n", getBrand(), getModel(), getBodyType());
        }
    }


    @Override
    public void pitStop(String action) {
        switch (action) {
            case REFUELING:
                System.out.println("Машина остановилась");
                System.out.println("Машину заправили топливом");
                System.out.println("Машина продолжила движение");
                break;
            case TIRE_CHANGE:
                System.out.println("Машина остановилась");
                System.out.println("Произвели смену шин");
                System.out.println("Машина продолжила движение");
                break;
            case DRIVER_CHANGE:
                System.out.println("Машина остановилась");
                System.out.println("Произвели смену водителя");
                System.out.println("Машина продолжила движение");
                break;
            case QUICK_REPAIR:
                System.out.println("Машина остановилась");
                System.out.println("Произвели смену необходимой детали");
                System.out.println("Машина продолжила движение");
        }
    }

    public void getDiagnosed() {
        System.out.printf("У автомобиля %s %s диагностика проведена \n", getBrand(), getModel());
    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
            System.out.printf("Автомобиль %s %s исправен \n", getBrand(), getModel());
        }

    @Override
    public List<?> mechanics() {
        return getMechanics();
    }

    @Override
    public void getBestLapTime() {
        System.out.println("У транспортного средства " + getBrand() + getBrand() + " лучшее время круга " + getBesTime());
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("У транспортного средства " + getBrand() + getBrand() + " макстимальная скорость " + getSpeed());
    }

    public String toString() {

        return "Автомобиль с водителем " + driver + "\n" + super.toString();
    }
}
