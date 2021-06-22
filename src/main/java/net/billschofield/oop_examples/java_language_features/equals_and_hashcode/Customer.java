package net.billschofield.oop_examples.java_language_features.equals_and_hashcode;

import java.util.List;

public class Customer {
    private String name;
    private String id;
    private List<Integer> previousOrderIds;

    public Customer(String name, String id, List<Integer> previousOrderIds) {
        this.name = name;
        this.id = id;
        this.previousOrderIds = previousOrderIds;
    }

    public void report() {
        System.out.println(name + "(id:" + id + ") has " + previousOrderIds.size() + " orders.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return !(id != null ? !id.equals(customer.id) : customer.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public String getName() {
        return name;
    }
}
