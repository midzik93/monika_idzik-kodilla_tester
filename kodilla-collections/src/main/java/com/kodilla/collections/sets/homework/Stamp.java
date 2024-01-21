package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double dimension;

    private boolean stamped;

    public Stamp(String name, double dimension, boolean stamped) {
        this.dimension = dimension;
        this.name = name;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getDimension() {
        return dimension;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(dimension, stamp.dimension) == 0 && stamped == stamp.stamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimension=" + dimension +
                ", stamped=" + stamped +
                '}';
    }
}
