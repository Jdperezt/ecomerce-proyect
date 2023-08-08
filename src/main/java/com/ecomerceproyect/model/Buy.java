package com.ecomerceproyect.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "buy")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private LocalDateTime receipDate;
    private LocalDateTime deliverDate;

    private double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "buy")
    private DetailBuy detailBuy;

    public Buy() {
    }

    public Buy(Integer id, String number, LocalDateTime receipDate, LocalDateTime deliverDate, double total) {
        this.id = id;
        this.number = number;
        this.receipDate = receipDate;
        this.deliverDate = deliverDate;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getReceipDate() {
        return receipDate;
    }

    public void setReceipDate(LocalDateTime receipDate) {
        this.receipDate = receipDate;
    }

    public LocalDateTime getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(LocalDateTime deliverDate) {
        this.deliverDate = deliverDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DetailBuy getDetailBuy() {
        return detailBuy;
    }

    public void setDetailBuy(DetailBuy detailBuy) {
        this.detailBuy = detailBuy;
    }

    @Override
    public String toString() {
        return "buy{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", receipDate=" + receipDate +
                ", deliverDate=" + deliverDate +
                ", total=" + total +
                '}';
    }
}
