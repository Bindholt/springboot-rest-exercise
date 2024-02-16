package kea.exercise.productorderexercise.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="\"order\"")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate OrderDate;
    private boolean confirmed;
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLine> orderLines;

    public Order(int id, LocalDate orderDate, boolean confirmed, List<OrderLine> orderLines) {
        this.id = id;
        OrderDate = orderDate;
        this.confirmed = confirmed;
        this.orderLines = orderLines;
    }

    public Order(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
