package com.csharper.transaction.controller;

import com.csharper.transaction.model.Transaction;
import com.csharper.transaction.service.ITransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {
    private  final ITransactionService service;

    public TransactionController(ITransactionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> Create(@RequestBody Transaction transaction){
        return ResponseEntity.ok(service.Create(transaction));
    }

    @GetMapping("{Id}")
    public ResponseEntity<?> Get(@PathVariable Long Id){
       Optional<Transaction> transaction= service.Get(Id);
        if(transaction.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(transaction);
    }

    @GetMapping
    public ResponseEntity<?> Get(){
        return new ResponseEntity<>( service.GetAll(), HttpStatus.OK);
    }
}
