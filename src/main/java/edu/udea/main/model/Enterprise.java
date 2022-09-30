package edu.udea.main.model;

import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;
import java.util.Date;


@Entity

public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Unique
    private String name;
    @Unique
    private String document;
    @Column
    private String phone;
    @Column
    private String address;
    @OneToOne
    @JoinColumn(name = "transactions_id")
    private Transaction[] transactions;
    @Column
    private Date createdAt;
    @Column
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enterprise() {
    }

    public Enterprise(@Unique String name, @Unique String document, String phone, String address, Transaction[] transactions, Date createdAt, Date updatedAt) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
