package demo.customer;


import java.util.List;

import static java.lang.System.out;

public class CustomerRepositoryStub implements CustomerRepository {
    @Override
    public void save(Customer customer) {
        out.println("customer saved");
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
