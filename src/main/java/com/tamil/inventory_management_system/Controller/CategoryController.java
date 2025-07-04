package com.tamil.inventory_management_system.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.inventory_management_system.Model.Category;
import com.tamil.inventory_management_system.Service.CategoryService;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService CatSer;

     @GetMapping("Category")
    public List<Category> getallCategory(){
      return CatSer.getallCategory();
    }
     
    @PostMapping("Category")
    public String addCategory(@RequestBody Category category){
        CatSer.addCategory(category);
        return"added";
    }

    @PutMapping("Category")
    public String updatecategory(@RequestBody Category category){
        CatSer.updatecategory(category);
        return "updated";
    }
  

 
    @DeleteMapping("Category/{id}")
    public String deleteCategoryt(@PathVariable int id){
        CatSer.deleteCategory(id);
        return "deleted";
    }

    
}
