public class Main {
    public static void main(String[] args) {

        Person maksim = new Person("Максим", 1988, "Минск", "бренд-менеджер");
        Person anya = new Person("Аня", 1993, "Москва", "методист образовательных программ");
        Person katya = new Person("Катя", 0, "Калининград", "продакт-менеджер");
        Person artem = new Person("Артем", 1995, "Москва", "директор по развитию бизнеса");
        Person mister = new Person(null, 1955, "", "");

        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);

    }
}
