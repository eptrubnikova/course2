package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int year, String country, String color, double speed, Double fuelPercentage) {
        super(brand, model, year, country, color, speed, fuelPercentage);
    }

    public void refill(){
        System.out.println("Можно заправлять бензином или дизелем на заправке, транспортное средство заправлено на " + fuelPercentage + "%");
    }
}
