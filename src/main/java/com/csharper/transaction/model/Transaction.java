package com.csharper.transaction.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private Long UserId;

    @Column(nullable = false)
    private Long ProductId;

    @Column(nullable = false)
    private Double Amount;

    @Column(nullable = false)
    private LocalDateTime TransactionDate = LocalDateTime.now();
}
