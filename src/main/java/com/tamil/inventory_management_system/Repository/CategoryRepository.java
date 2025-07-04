package com.tamil.inventory_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.inventory_management_system.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
