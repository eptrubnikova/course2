package ralli;

import java.util.Arrays;
import java.util.List;

public class Truck extends TransportRalli implements Competing {

    public enum LoadCapacity {
        N1(3.5f, null), N2(3.5f, 12f), N3(null, 12f);

        private Float cargo1;
        private Float cargo2;

        LoadCapacity(Float cargo1, Float cargo2) {
            this.cargo1 = Validate.validateFloat(cargo1);
            this.cargo2 = Validate.validateFloat(cargo2);
        }

        public Float getCargo1() {
            return cargo1;
        }

        public void setCargo1(Float cargo1) {
            this.cargo1 = cargo1;
        }

        public Float getCargo2() {
            return cargo2;
        }

        public void setCargo2(Float cargo2) {
            this.cargo2 = cargo2;
        }

        private String findLoadCapacity() {
            if (cargo1 == null) {
                System.out.println("Грузоподъемность свыше " + cargo2 + " тонн");
            } else if (cargo2 == null) {
                System.out.println("Грузоподъемность до " + cargo1 + " тонн");
            } else System.out.println("Грузоподъемность от " + cargo1 + " тонн до " + cargo2 + " тонн");

            return name();
        }


        @Override
        public String toString() {
            return findLoadCapacity();
        }
    }


    public static final String REFUELING = "заправка топливом";
    public static final String TIRE_CHANGE = "смена шин";
    public static final String DRIVER_CHANGE = "смена водителя";
    public static final String QUICK_REPAIR = "быстрый ремонт";
    public static final String[] ALL_ACTION = {REFUELING, TIRE_CHANGE, DRIVER_CHANGE, QUICK_REPAIR};
    private int speed;
    private double besTime;
    private LoadCapacity loadCapacity;

    private C_Driver driver;
    private final List<Mechanic<Truck>> mechanics;


    public Truck(String brand, String model, double engineVolume, C_Driver driver, Mechanic<Truck>... mechanics) {
        super(brand, model, engineVolume);
        setDriver(driver);
        this.mechanics = Arrays.asList(mechanics);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Validate.validateSpeed(speed);
    }

    public List<Mechanic<Truck>> getMechanics() {
        return mechanics;
    }

    public void setDriver(C_Driver driver) {
        this.driver = driver;
    }

    public double getBesTime() {
        return besTime;
    }

    public void setBesTime(double besTime) {
        this.besTime = Validate.validateValue(besTime);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("погнали");
    }

    @Override
    public void finishMoving() {
        System.out.println("приехали");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("данные не указаны");
        } else {
            System.out.printf("У грузового автомобиля %s %s %s \n", getBrand(), getModel(), getLoadCapacity());
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

        System.out.printf("Грузовой автомобиль %s %s исправен \n", getBrand(), getModel());
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

    @Override
    public String toString() {

        return "Грузовой автомобиль с водителем " + driver + super.toString();
    }
}
