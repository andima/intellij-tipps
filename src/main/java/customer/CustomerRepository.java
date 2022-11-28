package java.customer;

import java.util.List;

/**
 * Go Back Alt + -> (Arrow key)
 */
public interface CustomerRepository {
    void save(Customer customer);
    Customer getById(int id);
    List<Customer> getAll();

}
