
public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Person(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        if (yearOfBirth > 0 || yearOfBirth != 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            System.out.println("Ошибка в дате рождения у " + this.name);
        }
        if (name == null || town == null || jobTitle == null) {
            System.out.println("Информация не указана");
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
