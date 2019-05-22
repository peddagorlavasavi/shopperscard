package com.hcl.shopperscard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.shopperscard.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
