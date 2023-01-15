package ralli;

public class Sponsor {

    private String name;
    private int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = supportAmount;
    }

    public void sponsorRace() {
        supportAmount = 0;
    }

    @Override
    public String toString() {
        return name + ", с суммой участия: " + supportAmount;

    }
}
