package ru.mrkotyaka.jdbcdemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Builder
//@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Date date;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne(optional = false)
    @ToString.Exclude
    private Customer customer;
}
