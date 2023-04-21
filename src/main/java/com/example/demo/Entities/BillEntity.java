package com.example.demo.Entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "bills")
public class BillEntity {
    @Id
    private String number;
    private LocalDate date_bill;

    @Enumerated(EnumType.STRING)
    private Pay type_pay;

    private BigDecimal total;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer")
    private CustomerEntity customer;



    public BillEntity() {
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate_bill() {
        return date_bill;
    }

    public void setDate_bill(LocalDate date_bill) {
        this.date_bill = date_bill;
    }

    public Pay getType_pay() {
        return type_pay;
    }

    public void setType_pay(Pay type_pay) {
        this.type_pay = type_pay;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }
}
