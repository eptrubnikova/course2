package transport;

public class Train extends Transport{

    private double priceTicket;
    private int timeTravel;
    private String stationDeparture;
    private String stationArrival;
    private int wagonsAmount;

    public Train(String brand, String model, int year, String country, String color, double speed,
                 double priceTicket, int timeTravel, String stationDeparture, String stationArrival, int wagonsAmount, Double fuelPercentage) {
        super(brand, model, year, country, color, speed, fuelPercentage);
        this.priceTicket = validatePriceTicket(priceTicket);
        this.timeTravel = validateTimeTravel(timeTravel);
        this.stationDeparture = validateValue(stationDeparture);
        this.stationArrival = validateValue(stationArrival);
        this.wagonsAmount = validateWagonAmount(wagonsAmount);
    }

    public void refill(){
        System.out.println("Можно заправлять дизелем транспортное средство заправлено на " + fuelPercentage + "%");
    }

    //region validation

    public static double validatePriceTicket(double priceTicket){
        return priceTicket <= 0 ? 1_000 : priceTicket;
    }

    public static int validateTimeTravel(int timeTravel){
        return timeTravel<= 0 ? 1 : timeTravel;
    }

    public static int validateWagonAmount(int wagonsAmount){
        return wagonsAmount <= 0 ? 5 : wagonsAmount;
    }
    //endregion

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = validatePriceTicket(priceTicket);
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = validateTimeTravel(timeTravel);
    }

    public String getStationDeparture() {
        return stationDeparture;
    }

    public void setStationDeparture(String stationDeparture) {
        this.stationDeparture = validateValue(stationDeparture);
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = validateValue(stationArrival);
    }

    public int getWagonsAmount() {
        return wagonsAmount;
    }

    public void setWagonsAmount(int wagonsAmount) {
        this.wagonsAmount = validateWagonAmount(wagonsAmount);
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + getYear() +
                " года выпуска в " + getCountry() + ", скорость передвижения - " + getSpeed() +
                "км/ч, отходит от " + stationDeparture + " и следует до станции " + stationArrival+
                ". Цена поездки — " + priceTicket + " рублей, в поезде " + wagonsAmount + " вагонов.";
    }
}
