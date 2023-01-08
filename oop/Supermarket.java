import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Supermarket {

    private static final int MAX_SIZE = 5;

    private static final List<String> NAMES = List.of(
            "Иван Иванов",
            "Петр Петров",
            "Андрей Андреев",
            "Николай Николаев",
            "Сергей Сергеев",
            "Павел Павлов",
            "Евгений Евгеньев",
            "Владимир Владимиров",
            "Анатолий Анатольев",
            "Василий Васильев"
    );

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
        System.out.println();
        add("Иван Иванов", queue1, queue2);
        System.out.println("Первая очередь: " + queue1);
        System.out.println("Вторая очередь: " + queue2);
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == MAX_SIZE && queue2.size() == MAX_SIZE) {
            System.out.println("Нужно позвать Галю");
        } else if (queue1.size() > queue2.size()) {
            queue2.offer(name);
        } else if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        }
    }
}
