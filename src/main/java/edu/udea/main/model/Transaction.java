package edu.udea.main.model;

import edu.udea.main.enums.Enum_Concept;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@ToString
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "concept", nullable = false)
    private Enum_Concept concept;
    @Column(name = "amount", nullable = false, length = 95)
    private float amount;
    @OneToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;
    @CreationTimestamp
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    public Transaction() {
    }

    public Transaction(Long id, Enum_Concept concept, float amount, Enterprise enterprise, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.concept = concept;
        this.amount = amount;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
