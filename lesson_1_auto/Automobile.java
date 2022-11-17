public class Automobile {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Automobile(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;

    }

    public String toString() {
        return brand + model + ", " + year + " год выпуска, сборка в " + country + ", "
                + color + " цвет, объем двигателя — " + engineVolume + " л.";
    }
}
