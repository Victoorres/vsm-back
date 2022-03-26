package br.com.vsm.domain.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM customer c\n" +
            "WHERE c.document = :document", nativeQuery = true)
    Customer findByDocument(@Param("document") long document);
}
