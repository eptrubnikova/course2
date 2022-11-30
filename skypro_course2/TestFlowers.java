import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestFlowers {

    public static Flower[] flowers = new Flower[0];

    public static void main(String[] args) {

        Flower rose = new Flower("Роза обыкновенная", " ", "Голандия", 35.59, ' ');
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15.00, 5);
        Flower peony = new Flower("Пион", "розовый", "Ангия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.50, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        flowers = new Flower[]{chrysanthemum, chrysanthemum, peony, peony, peony};
        System.out.println(Arrays.toString(flowers));

        System.out.println("Ваш букет состоит из : " +
                Arrays.stream(flowers)
                        .collect(Collectors.groupingBy(Flower::getNameFlower, Collectors.counting())));

        System.out.printf("Стоимость Вашего букета составляет : %.2f рублей" + "\n", Arrays.stream(flowers).collect(Collectors.summingDouble(Flower::getCost)));

        int min = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        System.out.println("Срок стояния букета - " + min + " дней");
    }
}

