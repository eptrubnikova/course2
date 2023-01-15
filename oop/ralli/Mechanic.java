package ralli;

import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(companyName, mechanic.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, companyName);
    }
}
