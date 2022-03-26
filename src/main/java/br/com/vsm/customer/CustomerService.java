package br.com.vsm.customer;


import br.com.vsm.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerService extends AbstractService<Customer> {

     CustomerRepository customerRepository;

    public Customer findByDocument(String document){
        return customerRepository.findByDocument(document);
    }
}
