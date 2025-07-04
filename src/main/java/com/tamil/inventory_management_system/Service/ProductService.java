package com.tamil.inventory_management_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.inventory_management_system.Model.Product;
import com.tamil.inventory_management_system.Repository.ProductRepository;

@Service
public class ProductService {
        @Autowired
        ProductRepository ProRepo;

        public List<Product> getallProducts() {
           return ProRepo.findAll();
        }

        public Product addproduct( Product product) {
            return ProRepo.save(product);
        }

        public Product updatepProduct(Product product) {
            return ProRepo.save(product);
        }

        public void deleteProduct(int id) {
               ProRepo.deleteById(id);
        }
}
