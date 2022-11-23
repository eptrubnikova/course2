public class Main1 {

    public static void main(String[] args) {

        Automobile auto1 = new Automobile("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Automobile auto2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Automobile auto3 = new Automobile("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Automobile auto4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Automobile auto5 = new Automobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Automobile auto6 = new Automobile(null, "Avante", 0, null, 0, "Южная Корея");
        Automobile auto7 = new Automobile();

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
        System.out.println(auto6);
        System.out.println(auto7);
    }
}
