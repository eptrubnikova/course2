package transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double speed;
    protected Double fuelPercentage;

    public Transport(String brand, String model, int year, String country, String color, double speed, Double fuelPercentage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = validateColor(color);
        this.speed = validateSpeed(speed);
        this.fuelPercentage = validateDouble(fuelPercentage);
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = validateSpeed(speed);
    }

    public Double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(Double fuelPercentage) {
        this.fuelPercentage = validateDouble(fuelPercentage);
    }

    //region validation
    public static String validateColor(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "белый" : value;
    }

    public static Double validateSpeed (Double value) {
        return value == null ? 60 : value;
    }

    public static String validateValue(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "информация не указана" : value;
    }

    public static Double validateDouble(Double value) {
        return value == null || value.isNaN() ? 50.00 : value;
    }
    //endregion


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

