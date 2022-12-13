package ralli;

import java.util.Objects;

import static ralli.Validate.validateEngineVolume;
import static ralli.Validate.validateValue;

public abstract class TransportRalli {

    private final String brand;
    private final String model;
    private double engineVolume;

    public TransportRalli(String brand, String model, double engineVolume) {
        this.brand = validateValue(brand);
        this.model = validateValue(model);
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    @Override
    public String toString() {
        return "Транспортное средство " + brand + " " + model + ", с объемом двигателя " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportRalli that = (TransportRalli) o;
        return Double.compare(that.engineVolume, engineVolume) == 0 && Objects.equals(brand, that.brand) && Objects.equals(model, that.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void printType();
}

