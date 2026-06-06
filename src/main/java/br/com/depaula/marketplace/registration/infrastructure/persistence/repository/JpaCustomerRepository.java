package br.com.depaula.marketplace.registration.infrastructure.persistence.repository;

import java.util.List;

import br.com.depaula.marketplace.registration.domain.model.Customer;
import br.com.depaula.marketplace.registration.domain.repository.CustomerRepository;

public class JpaCustomerRepository implements CustomerRepository {

    @Override
    public Customer save(Customer customer) {
        // Implementation for saving customer
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        // Implementation for finding all customers
        return List.of();
    }

}
