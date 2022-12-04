package zoo;

public class TestAnimal {

    public static void main(String[] args) {

        Predator tiger = new Predator("Тиг", 5, "джунгли", 50.00, "мясо");
        Predator hyena = new Predator("Хайна", 4, "пустыня", 40.00, "мясо");
        Predator bear = new Predator("Миша", 8, "тайга", 60.00, "мясо");

        System.out.println(tiger);
        System.out.println(hyena);
        System.out.println(bear);
        tiger.eat();
        tiger.equals(hyena);

        Herbivore gazelle = new Herbivore("Мирка", 2, "Африка", 8.00, "трава");
        Herbivore giraffe = new Herbivore("Пит", 3, "Африка", 4.00, "листья");
        Herbivore giraffe2 = new Herbivore("Пит", 3, "Африка", 4.00, "листья");
        Herbivore horse = new Herbivore("Ласточка", 1, "ферма", 20.00, "сено");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        gazelle.eat();
        System.out.println(giraffe.equals(giraffe2));

        Amphibian frog = new Amphibian("Квак", 1, "болото");
        Amphibian alreadyFreshwater = new Amphibian("Ши", 1, "болото");

        System.out.println(frog);
        System.out.println(alreadyFreshwater);
        alreadyFreshwater.eat();

        Flying peacock = new Flying("Пава", 2, "Африка", "не летает");
        Flying penguin = new Flying("Пингви", 2, "Арктика", "не летает");
        Flying dodo = new Flying("Дуду", 2, "Арктика", "не летает");

        System.out.println(penguin);
        System.out.println(peacock);
        System.out.println(dodo);
        dodo.hunt();

        Flyingless gull = new Flyingless("Галка", 1, "Россия", "летают");
        Flyingless albatross = new Flyingless("Альба", 1, "Россия", "летают");
        Flyingless falcon = new Flyingless("Полет", 1, "тайга", "летают");

        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        falcon.fly();
    }
}
