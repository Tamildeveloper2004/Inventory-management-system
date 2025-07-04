package com.tamil.inventory_management_system.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Product {
    @Id
private int id;
private String name;
private int price;
private int quantityInStock;
public Product() {
}
public Product(int id, String name, int price, int quantityInStock) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantityInStock = quantityInStock;
}
@ManyToOne
@JoinColumn(name="category_id")
@JsonBackReference
private Category category;
}
