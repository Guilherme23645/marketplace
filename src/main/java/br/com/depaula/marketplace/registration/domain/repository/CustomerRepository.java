package br.com.depaula.marketplace.registration.domain.repository;

import java.util.List;

import br.com.depaula.marketplace.registration.domain.model.Customer;

public interface CustomerRepository {

    Customer save(Customer customer);
    
    List<Customer> findAll();

}
