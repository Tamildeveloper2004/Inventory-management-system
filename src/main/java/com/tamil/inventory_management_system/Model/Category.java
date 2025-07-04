package com.tamil.inventory_management_system.Model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Category {
    @Id
private int id;
private String name;
private String description;
public Category(int id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
}
public Category() {
}
@OneToMany(mappedBy="category")
@JsonManagedReference
private List<Product> product;


}
