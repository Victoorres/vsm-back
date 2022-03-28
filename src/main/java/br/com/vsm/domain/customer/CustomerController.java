package br.com.vsm.domain.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public ResponseEntity findCustomers() {
        return ResponseEntity.ok().body(customerService.findAll());
    }

    @GetMapping("/{document}")
    public ResponseEntity findCustomerByDocument(@PathVariable("document") long document) {
        return ResponseEntity.ok().body(customerService.findByDocument(document));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
