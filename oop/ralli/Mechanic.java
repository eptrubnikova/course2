package ralli;

public class Mechanic<T extends TransportRalli> {

    private String name;
    private String companyName;

    public Mechanic(String name, String companyName) {
        this.name = name;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void doService(T transport) {
        transport.service();
    }

    public void doRepair(T transport) {
        transport.repair();
    }

    @Override
    public String toString() {
        return name + ", из компании " + companyName;
    }
}
