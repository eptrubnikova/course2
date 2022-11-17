public class Main1 {

    public static void main(String[] args) {

        Automobile auto1 = new Automobile("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        Automobile auto2 = new Automobile("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Automobile auto3 = new Automobile("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Automobile auto4 = new Automobile("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Automobile auto5 = new Automobile("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(auto1 + "\n" + auto2 + "\n" + auto3 + "\n" + auto4 + "\n" + auto5);
    }
}
