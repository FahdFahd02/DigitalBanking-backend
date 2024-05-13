package org.sid.oulaizebankingbackend.repositories;

import org.sid.oulaizebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}