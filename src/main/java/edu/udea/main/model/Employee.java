package edu.udea.main.model;

import edu.udea.main.enums.Enum_RoleName;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@ToString
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Column(name = "email", nullable = false, unique = true, length = 95)
   private String email;
   @Enumerated(EnumType.STRING)
   @Column(name = "role", nullable = false)
   private Enum_RoleName role;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "enterprise_id")
   private Enterprise enterprise;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "transactions_id")
   private Transaction[] transactions;
   @UpdateTimestamp
   @Column(name = "updatedAt")
   private LocalDateTime updatedAt;
   @CreationTimestamp
   @Column(name = "createdAt")
   private LocalDateTime createdAt;

   public Employee() {
   }

   public Employee(Long id, String email, Enum_RoleName role, Enterprise enterprise, Transaction[] transactions, LocalDateTime updatedAt, LocalDateTime createdAt) {
      this.id = id;
      this.email = email;
      this.role = role;
      this.enterprise = enterprise;
      this.transactions = transactions;
      this.updatedAt = updatedAt;
      this.createdAt = createdAt;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Enum_RoleName getRole() {
      return role;
   }

   public void setRole(Enum_RoleName role) {
      this.role = role;
   }

   public Enterprise getEnterprise() {
      return enterprise;
   }

   public void setEnterprise(Enterprise enterprise) {
      this.enterprise = enterprise;
   }

   public Transaction[] getTransactions() {
      return transactions;
   }

   public void setTransactions(Transaction[] transactions) {
      this.transactions = transactions;
   }

   public LocalDateTime getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(LocalDateTime updatedAt) {
      this.updatedAt = updatedAt;
   }

   public LocalDateTime getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
   }
}
