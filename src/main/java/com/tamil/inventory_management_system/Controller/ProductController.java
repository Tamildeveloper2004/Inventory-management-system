package com.tamil.inventory_management_system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.inventory_management_system.Model.Product;
import com.tamil.inventory_management_system.Service.ProductService;

@RequestMapping
@RestController
public class ProductController {
    @Autowired
    private ProductService ProSer;

    @GetMapping("Product")
    public List<Product> getallProducts(){
        return ProSer.getallProducts();
    }
     
    @PostMapping("Product")
    public String addproduct(@RequestBody Product product){
        ProSer.addproduct(product);
        return "added";
    }

    @PutMapping("Product")
    public String updatepProduct(@RequestBody Product product){
        ProSer.updatepProduct(product);
        return "updated";
    }
      
    @DeleteMapping("Product/{id}")
    public String deleteProduct(@PathVariable int id){
        ProSer.deleteProduct(id);
        return "deleted";

    }

}
