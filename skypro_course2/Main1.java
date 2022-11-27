import transports.Automobile;

import java.time.LocalDate;

public class Main1 {

    public static void main(String[] args) {

        LocalDate.now().getMonthValue();

        Automobile auto1 = new Automobile("Lada", "Granta", 1.7, "желтая", 2015, "Россия", "механика", "а051нм155", "универсал", 5, "летняя");
        Automobile auto2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", " ", "О555ТА152", "", 6, "зимняя");
        Automobile auto3 = new Automobile("BMW", "Z8", 3.0, "черный", 2021, "Германия", null, " ", "", 4, "летняя");
        Automobile auto4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механика", "а066ХН155", "универсал", 5, "летняя");
        Automobile auto5 = new Automobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "механика", "О051НЕ155", "универсал", 5, "летняя");
        Automobile auto6 = new Automobile(null, "Avante", 0, null, 0, "Южная Корея", null, " ", "", 4, "летняя");
        Automobile auto7 = new Automobile();

        Automobile.Insurance auto1Insurance = new Automobile.Insurance(2022, 1_000, "215789516");
        Automobile.Insurance auto2Insurance = new Automobile.Insurance(2021, 3_000, "f21586");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
        System.out.println(auto6);
        System.out.println(auto7);

        Automobile.Insurance.verifyValidity(auto2Insurance.getValidity());
        Automobile.Insurance.verifyNumber(auto2Insurance.getNumber());
    }
}
