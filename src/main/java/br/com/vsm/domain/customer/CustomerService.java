package br.com.vsm.domain.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

     public Customer findByDocument(long document) {
        return customerRepository.findByDocument(document);
    }

    public List<Customer> findAll(){
         return customerRepository.findAll();
    }

    public Customer save(Customer customer){
         return customerRepository.save(customer);
    }
}
