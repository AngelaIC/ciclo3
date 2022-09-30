package edu.udea.main.model;

import edu.udea.main.enums.Enum_Concept;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "concept")
    private Enum_Concept concept;
    @Column
    private float amount;
    @OneToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;
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

    public Transaction() {
    }

    public Transaction(Enum_Concept concept, float amount, Enterprise enterprise, Date createdAt, Date updatedAt) {
        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Enum_Concept getConcept() {
        return concept;
    }

    public void setConcept(Enum_Concept concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
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
