package com.csharper.transaction.service;

import com.csharper.transaction.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ITransactionService{
    Transaction Create(Transaction model);
    List<Transaction> GetAll();
    Optional<Transaction> Get(long Id);
}
