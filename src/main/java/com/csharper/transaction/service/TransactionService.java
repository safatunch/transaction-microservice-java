package com.csharper.transaction.service;

import com.csharper.transaction.model.Transaction;
import com.csharper.transaction.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements  ITransactionService {
    private final ITransactionRepository repository;

    public TransactionService(@Autowired ITransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Transaction Create(Transaction model){
        return repository.save(model);
    }

    @Override
    public List<Transaction> GetAll(){
        return  repository.findAll();
    }

    @Override
    public Optional<Transaction> Get(long Id){
        return  repository.findById(Id);
    }
}
