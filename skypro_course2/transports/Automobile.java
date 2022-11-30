package transports;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Automobile {

    public class Key {

        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isBlank() || remoteEngineStart.isEmpty()) {
                this.remoteEngineStart = "некорректные данные";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "некорректные данные";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {

        private int validity;
        private double price;
        private String number;

        public Insurance(int validity, double price, String number) {
            if (validity == 0) {
                this.validity = Integer.parseInt("некорректные данные");
            } else {
                this.validity = validity;
            }
            if (price == 0) {
                this.price = Double.parseDouble("некорректные данные");
            } else {
                this.price = price;
            }
            if (number == null || number.isBlank() || number.isEmpty()) {
                this.number = "Номер страховки некорректный!";
            } else {
                this.number = number;
            }
        }

        public static void verifyValidity(int validity) {
            if (validity < LocalDate.now().getYear()) {
                System.out.println("необходимо оформить новую страховку");
            } else {
                validity = validity;
            }
        }

        public static void verifyNumber (String number){
            if (number.length() < 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public int getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }
    }

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;
    private String transmission;
    private String registrationNumber;
    private String bodyType;
    private int numberOfSeats;
    private String tire;

    private Key key;
    private Insurance insurance;

    public Automobile() {
        this("default", "default", 1.5, "белый", 2000,
                "default", "default", "x000xx000", "default", 5, "летняя");
    }

    public Automobile(String brand, String model, double engineVolume, String color, int year,
                      String country, String transmission, String registrationNumber,
                      String bodyType, int numberOfSeats, String tire) {
        if (model == null) {
            this.model = " default ";
        } else {
            this.model = model;
        }

        this.brand = brand;


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

        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = " белый ";
        } else {
            this.color = color;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = " автомат ";
        } else {
            this.transmission = transmission;
        }

        String correctRegistrNumber = registrationNumber.toLowerCase();
        correctRegistrNumber = correctRegistrNumber.replace(" ", "");
        correctRegistrNumber = correctRegistrNumber.replace("-", "");

        String regex = "^[АВЕКМНОРСТУХавекмнорстух]{1}[0-9]{3}[АВЕКМНОРСТУХавекмнорстух]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);

        if (correctRegistrNumber.isBlank() || correctRegistrNumber.isEmpty()) {
            this.registrationNumber = " номер отсутствует ";
        } else if (matcher.matches() == true) {
            this.registrationNumber = correctRegistrNumber;
        } else if (matcher.matches() == false) {
            this.registrationNumber = " некорректный номер ";
        } else {
            this.registrationNumber = correctRegistrNumber;
        }

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (numberOfSeats <= 0) {
            System.out.println("ошибка");
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (LocalDate.now().getMonthValue() >= 10 && tire == "летняя") {
            this.tire = "Для безопасной поездки смените шины на зимнюю резину";
        } else if (LocalDate.now().getMonthValue() <= 3 && tire == "летняя") {
            this.tire = "Для безопасной поездки смените шины на зимнюю резину";
        } else if (LocalDate.now().getMonthValue() >= 4 && LocalDate.now().getMonthValue() <= 9 && tire == "зимняя") {
            this.tire = "Для безопасной поездки смените шины на летнюю резину";
        } else {
            this.tire = tire;
        }
    }

    private String getBrand() {
        return brand;
    }

    private String getModel() {
        return model;
    }

    private int getYear() {
        return year;
    }

    private String getCountry() {
        return country;
    }

    private String getBodyType() {
        return bodyType;
    }

    private int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = " белый ";
        } else {
            this.color = color;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = " автомат ";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        String correctRegistrNumber = registrationNumber.toLowerCase();
        correctRegistrNumber = correctRegistrNumber.replace(" ", "");
        correctRegistrNumber = correctRegistrNumber.replace("-", "");

        String regex = "^[ABCEHKMOPTYXавекмнортух]{1}[0-9]{3}[ABCEHKMOPTYXавекмнортух]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);

        if (correctRegistrNumber == null && correctRegistrNumber.isBlank() && correctRegistrNumber.isEmpty()) {
            this.registrationNumber = " номер отсутствует ";
        } else if (matcher.matches() == true) {
            this.registrationNumber = correctRegistrNumber;
        } else if (matcher.matches() == false) {
            this.registrationNumber = " некорректный номер ";
        } else {
            this.registrationNumber = correctRegistrNumber;
        }
    }

    public String getTire() {
        return tire;
    }

    public void setTire() {
        if (LocalDate.now().getMonthValue() >= 10 && tire == "летняя") {
            System.out.println("Для безопасной поездки смените шины на зимнюю резину");
        } else if (LocalDate.now().getMonthValue() <= 3 && tire == "летняя") {
            System.out.println("Для безопасной поездки смените шины на зимнюю резину");
        } else if (LocalDate.now().getMonthValue() >= 4 && tire == "зимняя") {
            System.out.println("Для безопасной поездки смените шины на летнюю резину");
        } else if (LocalDate.now().getMonthValue() <= 9 && tire == "зимняя") {
            System.out.println("Для безопасной поездки смените шины на летнюю резину");
        } else {
            this.tire = tire;
        }
    }

    public void changeTire() {
        if (LocalDate.now().getMonthValue() >= 10 && tire == "летняя") {
            System.out.println("Для безопасной поездки смените шины на зимнюю резину");
        } else if (LocalDate.now().getMonthValue() <= 3 && tire == "летняя") {
            System.out.println("Для безопасной поездки смените шины на зимнюю резину");
        } else if (LocalDate.now().getMonthValue() >= 4 && tire == "зимняя") {
            System.out.println("Для безопасной поездки смените шины на летнюю резину");
        } else if (LocalDate.now().getMonthValue() <= 9 && tire == "зимняя") {
            System.out.println("Для безопасной поездки смените шины на летнюю резину");
        } else {
            this.tire = tire;
        }
    }

    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", "
                + color + " цвет, объем двигателя — " + engineVolume + " л., коробка - " + transmission + ", тип кузова - " + bodyType
                + ", регистрационный номер - " + registrationNumber + ", количество мест - " + numberOfSeats + "" +
                "\n резина - " + tire;
    }
}
