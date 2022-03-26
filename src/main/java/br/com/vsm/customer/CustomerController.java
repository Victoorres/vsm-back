package br.com.vsm.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> findCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/{document}")
    public Customer findCustomerByDocument(@PathVariable("document") String document) {
        return customerService.findByDocument(document);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Customer inactivateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
