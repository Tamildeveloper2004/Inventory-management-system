package com.tamil.inventory_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.inventory_management_system.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
