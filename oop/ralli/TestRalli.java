package ralli;

public class TestRalli {
    public static Truck[] trucks = new Truck[0];

    public static void main(String[] args) {

        BusRalli bus1 = new BusRalli("ПАЗ", "4234", 1.5);
        BusRalli bus2 = new BusRalli("ПАЗ", "6666", 1.7);
        BusRalli bus3 = new BusRalli("ПАЗ", "777", 1.8);
        BusRalli bus4 = new BusRalli("ПАЗ", "888", 1.6);

        System.out.println(bus1);
        bus2.startMoving();
        bus3.finishMoving();
        bus3.setSpeed(100);
        bus3.getMaxSpeed();
        bus1.setBesTime(2.5);
        bus1.getBestLapTime();
        bus2.pitStop(BusRalli.QUICK_REPAIR);

        Car car1 = new Car("Мазда", "px 7", 1.3);
        Car car2 = new Car("Ауди", "А6", 3.0);
        Car car3 = new Car("Сузуки", "Джимни", 1.5);
        Car car4 = new Car("Субару", "Трибека", 3.6);

        car1.pitStop(Car.REFUELING);
        car1.setSpeed(100);
        car2.setSpeed(110);
        car3.setSpeed(120);
        car4.setSpeed(130);
        car1.setBesTime(2.1);
        car1.getBestLapTime();
        car2.getMaxSpeed();

        Truck truck1 = new Truck("КамАЗ", "49252", 17.2);
        Truck truck2 = new Truck("КамАЗ", "5555", 17.9);
        Truck truck3 = new Truck("КамАЗ", "4444", 18.0);
        Truck truck4 = new Truck("КамАЗ", "3333", 16.7);

        truck2.setSpeed(110);
        truck1.setSpeed(120);
        truck3.setSpeed(130);
        truck4.setSpeed(140);
        truck2.getMaxSpeed();
        truck2.setBesTime(3.2);
        truck2.getBestLapTime();
    }


}
