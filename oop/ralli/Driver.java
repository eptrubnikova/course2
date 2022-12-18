package ralli;

public abstract class Driver {

    private String name;
    private boolean driverLicence;
    private int experience;
    private String categoryLicence;

    public Driver(String name, String categoryLicence) {
        this.name = Validate.validateValue(name);
        this.categoryLicence = categoryLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validate.validateValue(name);
    }

    public String getCategoryLicence() {
        return categoryLicence;
    }

    public void setCategoryLicence(String categoryLicence) {
        this.categoryLicence = categoryLicence;
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
