package java.customer;

import java.util.List;

/**
 * InMemory
 *  Go Back     Alt + -> (Arrow key)
 */
public class InMemoryCustomerRepository implements CustomerRepository{
    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
