package ralli;

import java.util.*;

import static ralli.Validate.validateEngineVolume;
import static ralli.Validate.validateValue;

public abstract class TransportRalli{

    private final String brand;
    private final String model;
    private double engineVolume;
    private final List<Sponsor> sponsors;
    private final Set<Mechanic> mechanics;

    public TransportRalli(String brand, String model, double engineVolume) {
        this.brand = validateValue(brand);
        this.model = validateValue(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.sponsors = new ArrayList<>();

        mechanics= new HashSet<>();
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void printType();

    public void getDiagnosed() throws DiagnosticsException {
    }

    public abstract boolean service();

    public abstract void repair();

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }

//    public abstract Set<?> mechanics ();
//
//    public String mechanicsInfo() {
//        Set<?> mechanics = mechanics();
//        StringBuilder result = new StringBuilder();
//        if (!mechanics.isEmpty()) {
//            result.append("Механики: ");
//        }
//        int i = 0;
//        for (Object mechanic : mechanics) {
//            result.append(mechanics);
//            i++;
//            if (i != mechanics.size() - 1) {
//                result.append(" ,");
//            }
//        } return result.toString();
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder();
//        if (!sponsors.isEmpty()) {
//            result.append("Спонсоры: ");
//        }
//        for (int i = 0; i < sponsors.size(); i++) {
//            result.append(sponsors.get(i));
//            if (i != sponsors.size() - 1) {
//                result.append(" ,");
//            }
//        }
//        return result.append("\n").append(mechanicsInfo()).toString();
//    }

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
}


