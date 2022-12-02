package transport;

import java.time.LocalDate;

public class Main1 {

    public static void main(String[] args) {

        LocalDate.now().getMonthValue();

        Automobile auto1 = new Automobile("Lada", "Kalina", 2010, "Russia", "черный",
                80, "а154мм055", "летняя", "механика", 1.7);
        Automobile auto2 = new Automobile("Audi", "A8 50 L TDI quattro", 2020, "желтый", "Германия",
                90, "А451оР254", "зимняя", "автомат", 0);

        Automobile.Insurance auto1Insurance = new Automobile.Insurance(2022, 1_000, "215789516");
        Automobile.Insurance auto2Insurance = new Automobile.Insurance(2021, 3_000, "f21586");

        System.out.println(auto1);
        System.out.println(auto2);

        Automobile.Insurance.verifyValidity(auto2Insurance.getValidity());
        Automobile.Insurance.verifyNumber(auto2Insurance.getNumber());

        Train train1 = new Train("Ласточка", "B-901", 2011, "Russia", "",
                301, 3_500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Russia", "", 270,
                1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println(train1);
        System.out.println(train2);

        Bus bus1 = new Bus("ПАЗ", "3205", 2017, "Россия", "серый", 70);
        Bus bus2 = new Bus("ПАЗ", "4234", 2019, "Россия", "", 60);

        System.out.println(bus1);
        System.out.println(bus2);

    }

}
