package developer_learning_resources.languages_and_frameworks.java.equals_and_hashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer("Apple", "1", previousOrders(3)));
        customers.add(new Customer("Apple", "1", previousOrders(3)));
        customers.add(new Customer("Google", "2", previousOrders(2)));

        for (Customer customer : customers) {
            customer.report();
        }


        Customer result = find(customers, new Customer("Apple", "1", previousOrders(3)));
        result.report();
    }

    private static Customer find(Set<Customer> customers, Customer customerToFind) {
        for (Customer customer : customers) {
            if (customer.equals(customerToFind)){
                return customer;
            }
        }
        return null;
    }


    private static List<Integer> previousOrders(Integer numberOfPreviousOrders) {
        List<Integer> previousOrders = new ArrayList<>();
        for (int i = 0; i < numberOfPreviousOrders; i++) {
            previousOrders.add(i);
        }
        return previousOrders;
    }
}
