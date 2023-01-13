package ralli;

import java.util.HashSet;
import java.util.Set;

public class TestRalli {

    public static void main(String[] args) throws LicenceException {

        Mechanic<Car> ivan = new Mechanic<>("Иван Иванов", "Reactor");
        Mechanic<Car> sidor = new Mechanic<>("Сидоров Сидор", "Mechanic");
        Mechanic<BusRalli> petr = new Mechanic<>("Петр Петров", "Best");
        Mechanic<BusRalli> ted = new Mechanic<>("Тед Петров", "Best");
        Mechanic<BusRalli> vika = new Mechanic<>("Вика Петрова", "Best");
        Mechanic<Truck> nika = new Mechanic<>("Ника Иванова", "Best");
        Mechanic<Truck> lika = new Mechanic<>("Лика Николаева", "Best");
        Mechanic<Truck> fika = new Mechanic<>("Фика Сидорова", "Best");

        Sponsor luk = new Sponsor("Люк", 100_000);
        Sponsor teodor = new Sponsor("Теодор", 500_000);
        Sponsor muk = new Sponsor("Мук", 300_000);

        D_Driver<BusRalli> tom = new D_Driver<>("Tom", "D");
        D_Driver<BusRalli> jonh = new D_Driver<>("Jonh", "D");


        BusRalli bus1 = new BusRalli("ПАЗ", "4234", 1.5, tom);
        BusRalli bus2 = new BusRalli("ПАЗ", "6666", 1.7, jonh);

//        bus1.getMechanics().add(new Mechanic("Никита", "Тайота"));
//        bus1.getMechanics().add(new Mechanic("Кирилл", "Тайота"));
//        bus1.getMechanics().add(new Mechanic("Никита", "Тайота"));
//        bus1.getMechanics().add(new Mechanic("Даниил", "Тайота"));
//        bus1.getMechanics().add(new Mechanic("Никита", "Тайота"));
//
//        for (Mechanic mechanic : bus1.getMechanics()) {
//            System.out.println(mechanic.getName());
//        }

//        System.out.println(bus1);
//        bus2.startMoving();
//        bus3.finishMoving();
//        bus3.setSpeed(100);
//        bus3.getMaxSpeed();
//        bus1.setBesTime(2.5);
//        bus1.getBestLapTime();
//        bus2.pitStop(BusRalli.QUICK_REPAIR);

        B_Driver<Car> nik = new B_Driver<>("Nik", "B");
        B_Driver<Car> vlad = new B_Driver<>("Vlad", "B");

        Car car1 = new Car("Мазда", "px 7", 1.3, nik);
        Car car2 = new Car("Ауди", "А6", 3.0, vlad);

        car1.addMechanic(sidor);
        car1.addMechanic(sidor);
        car1.addMechanic(ivan);

        System.out.println(Car.getServicedCar());
            
//        car1.pitStop(Car.REFUELING);
//        car1.setSpeed(100);
//        car2.setSpeed(110);
//        car3.setSpeed(120);
//        car4.setSpeed(130);
//        car1.setBesTime(2.1);
//        car1.getBestLapTime();
//        car2.getMaxSpeed();

        C_Driver<Truck> max = new C_Driver<>("Max", "C");
        C_Driver<Truck> vik = new C_Driver<>("Viktor", "C");

        Set<C_Driver<Truck>> set = new HashSet<>();
        set.add(max);
        set.add(max);
        set.add(vik);
        set.add(max);

//        System.out.println(Arrays.toString(set.toArray()));

        Truck truck1 = new Truck("КамАЗ", "49252", 17.2, vik);
        Truck truck2 = new Truck("КамАЗ", "5555", 17.9, max);

        Set<Truck> set1 = new HashSet<>();
        set1.add(truck1);
        set1.add(truck2);
        set1.add(truck2);
        set1.add(truck1);

//        System.out.println(Arrays.toString(set1.toArray()));

        truck1.getMechanics().add(nika);
        truck1.getMechanics().add(lika);
        truck1.getMechanics().add(fika);

        for (Mechanic<Truck> mechanic : truck1.getMechanics()) {
//            System.out.println(mechanic.getName());
        }

//        truck2.setSpeed(110);
//        truck1.setSpeed(120);
//        truck3.setSpeed(130);
//        truck4.setSpeed(140);
//        truck2.getMaxSpeed();
//        truck2.setBesTime(3.2);
//        truck2.getBestLapTime();

//        nik.toString(car2);
//        nik.start();

//        max.toString(truck1);

//        tom.toString(bus4);
//        tom.start();

//        System.out.println();
//
//        System.out.println(Car.BodyType.COUPE);
//        Truck.LoadCapacity loadCapacity = Truck.LoadCapacity.N1;
//        System.out.println(loadCapacity);
//
//        car1.setBodyType(Car.BodyType.PICKUP);
//        car1.printType();
//
//        truck2.setLoadCapacity(Truck.LoadCapacity.N1);
//        truck2.printType();
//
//        System.out.println(BusRalli.NumberSeats.BIG);
//        bus3.setNumberSeats(BusRalli.NumberSeats.AVERAGE);
//        bus3.printType();
//
//        getDiagnosed(car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4);
//        checkCategoryLicence(nik, tom);

        car1.addSponsor(luk);
        bus1.addSponsor(muk);

//        System.out.println(car1);
//        System.out.println(bus1);

        ServiceStation<Car, Truck> serviceCenter = new ServiceStation<>("ServiceCenter");
//        serviceCenter.addAuto(car1);
//        serviceCenter.addAuto(car2);
//        serviceCenter.addAuto(truck1);
//        serviceCenter.addAuto(truck2);

//        serviceCenter.doVehicleInspection();
    }


//    public static void getDiagnosed(TransportRalli... transportRallis) {
//        for (TransportRalli transportRalli : transportRallis) {
//            try {
//                transportRalli.getDiagnosed();
//            } catch (DiagnosticsException e) {
//                System.out.println("Проверка не проведена");
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//
//        public static void checkCategoryLicence (Driver...drivers) throws LicenceException {
//            for (Driver driver : drivers) {
//                if (driver.getCategoryLicence() == null || driver.getCategoryLicence().isEmpty() || driver.getCategoryLicence().isBlank()) {
//                    throw new LicenceException("Необходимо указать категорию прав!");
//                } else {
//                    System.out.println("Категория прав указана");
//                }
//            }
//        }

}



