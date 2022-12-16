package ralli;

public abstract class Driver {

    private String name;
    private boolean driverLicence;
    private int experience;

    public Driver(String name) {
        this.name = Validate.validateValue(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validate.validateValue(name);
    }

    public boolean isDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(boolean driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Validate.validateValue(experience);
    }
}
