public class Automobile {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Automobile() {
        brand = " default ";
        model = " default ";
        country = " default ";
        engineVolume = 1.5;
        color = "белый";
        year = 2000;
    }
    Automobile(String brand, String model, double engineVolume, String color, int year, String country) {


        if (model == null) {
            this.model = " default ";
        } else {
            this.model = model;
        }

        if (brand == null) {
            this.brand = " default ";
        } else {
            this.brand = brand;
        }

        if (country == null) {
            this.country = " default ";
        } else {
            this.country = country;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (color == null) {
            this.color = " белый ";
        } else {
            this.color = color;
        }
    }

    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", "
                + color + " цвет, объем двигателя — " + engineVolume + " л.";
    }
}
