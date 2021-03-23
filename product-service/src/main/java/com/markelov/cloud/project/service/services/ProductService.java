package com.markelov.cloud.project.service.services;

import com.markelov.cloud.project.service.models.Product;
import com.markelov.cloud.project.service.repositories.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductService(Productrepository productrepository) {
        this.productrepository = productrepository;
    }

    private Productrepository productrepository;

    public List<Product> findAll(){
        return productrepository.findAll();
    }
}
