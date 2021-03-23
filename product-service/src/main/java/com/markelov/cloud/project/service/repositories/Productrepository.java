package com.markelov.cloud.project.service.repositories;

import com.markelov.cloud.project.service.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product, Long> {
}
