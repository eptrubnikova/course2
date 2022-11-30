public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;
    private String nameFlower;
    private static Flower[] flowers;

    public Flower() {
        this.flowers = new Flower[0];
    }

    Flower(String nameFlower) {
        this(nameFlower, "белый", "Россия", 1.00, 3);
    }

    Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {
        this.nameFlower = nameFlower;
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0 || cost == ' ') {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0 || lifeSpan == ' ') {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan() {
        if (lifeSpan <= 0 || lifeSpan == ' ') {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor() {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0 || cost == ' ') {
            this.cost = 1.00;
        } else {
            this.cost = cost;
        }
    }

    public String toString() {
        return nameFlower + " из " + country + ", цвет " + flowerColor + ", стоимость штуки " + cost + " рублей, срок стояния - " + lifeSpan + " дней.";
    }

    public static int findMinLifeSpan() {
        int min = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        System.out.println("Минимальная заработная плата у сотрудника " + min);
        return min;
    }

 }
