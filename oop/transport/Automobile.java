package transport;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Automobile extends Transport {

    public Automobile(String brand, String model, int year, String country, String color, double speed,
                      String registrationNumber, String tire, String transmission, double engineVolume) {
        super(brand, model, year, country, color, speed);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.transmission = validateTransmission(transmission);
        this.registrationNumber = validateRegistrNumver(registrationNumber);
        this.tire=validateTire(tire);
    }

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

        public static void verifyNumber(String number) {
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

    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    private String tire;

    private Key key;
    private Insurance insurance;


// region validation

    public static double validateEngineVolume(double value) {
        return value <= 0 ? 1.5 : value;
    }

    public static String validateTransmission(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "автомат" : value;
    }

    public static String validateRegistrNumver(String registrationNumber) {
        String correctRegistrNumber = registrationNumber.toLowerCase();
        correctRegistrNumber = correctRegistrNumber.replace(" ", "");
        correctRegistrNumber = correctRegistrNumber.replace("-", "");

        String regex = "^[АВЕКМНОРСТУХавекмнорстух]{1}[0-9]{3}[АВЕКМНОРСТУХавекмнорстух]{2}[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);

        if (correctRegistrNumber.isBlank() || correctRegistrNumber.isEmpty()) {
            registrationNumber = " номер отсутствует ";
        } else if (matcher.matches() == true) {
            registrationNumber = correctRegistrNumber;
        } else if (matcher.matches() == false) {
            registrationNumber = " некорректный номер ";
        } else {
            registrationNumber = correctRegistrNumber;
        }
        return correctRegistrNumber;
    }

    public static String validateTire(String tire){
        if(LocalDate.now().getMonthValue() >=10&&tire =="летняя")
        {
            tire = "Для безопасной поездки смените шины на зимнюю резину";
        } else if(LocalDate.now().
                getMonthValue() <=3 && tire =="летняя")
        {
            tire = "Для безопасной поездки смените шины на зимнюю резину";
        } else if(LocalDate.now().getMonthValue() >=4&&LocalDate.now().getMonthValue() <=9&&tire =="зимняя")
        {
            tire = "Для безопасной поездки смените шины на летнюю резину";
        } else
        {
            tire = tire;
        }
        return tire;
    }
    //endregion



       public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validateTransmission(transmission);

    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateRegistrNumver(registrationNumber);
    }


    public String getTire() {
        return tire;
    }

    public void setTire() {
       this.tire = validateTire(tire);
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
        return super.getBrand() + " " + super.getModel() + ", " + super.getYear() + " год выпуска, сборка в " + super.getCountry() + ", "
                + super.getColor() + " цвет, объем двигателя — " + engineVolume + " л., коробка - " + transmission +
                ", регистрационный номер - " + registrationNumber + "\n резина - " + tire;
    }
}
