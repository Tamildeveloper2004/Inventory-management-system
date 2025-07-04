package com.tamil.inventory_management_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.inventory_management_system.Model.Category;
import com.tamil.inventory_management_system.Repository.CategoryRepository;
@Service
public class CategoryService {
        @Autowired
        CategoryRepository CatRepo;

        public List<Category> getallCategory() {
              return  CatRepo.findAll();
        }

        public Category addCategory(Category category) {
           return  CatRepo.save(category);  
        }

        public Category updatecategory(Category category) {
            return CatRepo.save(category);
        }
        public void deleteCategory(int id) {
            CatRepo.deleteById(id);
        }
       
    
    }

