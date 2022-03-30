package com.example.demo.model;

import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productId")
    private UUID productId;

    @Column(name = "productName")
    private String productName;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "productType")
    private String productType;

    @Column(name = "productImage")
    private String productImage;

    @Column(name = "productPrice")
    private long productPrice;

    @Column(name = "productOwner")
    private UUID productOwnerId;



    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.EAGER, optional = false, targetEntity = User.class)
    private User user;


}