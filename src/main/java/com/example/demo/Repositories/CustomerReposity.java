package com.example.demo.Repositories;

import com.example.demo.Entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReposity extends JpaRepository<CustomerEntity,Integer> {
}
