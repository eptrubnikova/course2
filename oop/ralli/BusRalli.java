package ralli;

import java.util.Set;

public class BusRalli extends TransportRalli implements Competing {

    public enum NumberSeats {
        VERY_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        VERY_BIG(100, 120);

        private Integer numberSeatsFrom;
        private Integer numberSeatsBefore;

        NumberSeats(Integer numberSeatsFrom, Integer numberSeatsBefore) {
            this.numberSeatsFrom = Validate.validateInteger(numberSeatsFrom);
            this.numberSeatsBefore = Validate.validateInteger(numberSeatsBefore);
        }

        @Override
        public String toString() {
            if (numberSeatsFrom == null) {
                System.out.println("Вместимость автобуса до " + numberSeatsBefore + " мест");
            } else
                System.out.println("Вместимость автобуса от " + numberSeatsFrom + " до " + numberSeatsBefore + " мест");

            return name();
        }
    }

    public static final String REFUELING = "заправка топливом";
    public static final String TIRE_CHANGE = "смена шин";
    public static final String DRIVER_CHANGE = "смена водителя";
    public static final String QUICK_REPAIR = "быстрый ремонт";
    public static final String[] ALL_ACTION = {REFUELING, TIRE_CHANGE, DRIVER_CHANGE, QUICK_REPAIR};
    private int speed;
    private double besTime;
    private NumberSeats numberSeats;
    private D_Driver driver;

    private Set<BusRalli> buses;

    public BusRalli(String brand, String model, double engineVolume, D_Driver driver) {
        super(brand, model, engineVolume);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Validate.validateSpeed(speed);
    }

    public Set<BusRalli> getBuses() {
        return buses;
    }

    public double getBesTime() {
        return besTime;
    }

    public void setBesTime(double besTime) {
        this.besTime = Validate.validateValue(besTime);
    }

    public NumberSeats getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(NumberSeats numberSeats) {
        this.numberSeats = numberSeats;
    }

    public D_Driver getDriver() {
        return driver;
    }

    @Override
    public void startMoving() {
        System.out.println("вперед");
    }

    @Override
    public void finishMoving() {
        System.out.println("стоп");
    }

    @Override
    public void printType() {
        if (numberSeats == null) {
            System.out.println("данные не указаны");
        } else {
            System.out.printf("У автобуса %s %s %s \n", getBrand(), getModel(), getNumberSeats());
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

    public void getDiagnosed() throws DiagnosticsException {
        throw new DiagnosticsException("Автобусы не проходят диагностику", this);

    }

    @Override
    public boolean service() {
        return false;
    }

    @Override
    public void repair() {
        System.out.printf("Автобус %s %s исправен \n", getBrand(), getModel());
    }


    public Set<?> mechanics() {
        return null;
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
        return "Автобус с водителем " + driver + "\n" + super.toString();
    }
}
