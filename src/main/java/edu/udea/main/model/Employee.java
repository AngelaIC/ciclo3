package edu.udea.main.model;

import edu.udea.main.enums.Enum_RoleName;
import lombok.*;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", nullable = false)
   private Long id;

   @Unique
   private String email;
   @Enumerated(EnumType.STRING)
   @Column(name = "role")
   private Enum_RoleName role;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "enterprise_id")
   private Enterprise enterprise;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "transactions_id")
   private Transaction[] transactions;
   @Column
   private Date updatedAt;
   @Column
   private Date createdAt;

   public Employee() {
   }

   public Employee(Long id, @Unique String email, Enum_RoleName role, Enterprise enterprise, Transaction[] transactions, Date updatedAt, Date createdAt) {
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

   public Date getUpdatedAt() {
      return updatedAt;
   }

   public void setUpdatedAt(Date updatedAt) {
      this.updatedAt = updatedAt;
   }

   public Date getCreatedAt() {
      return createdAt;
   }

   public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
   }
}
