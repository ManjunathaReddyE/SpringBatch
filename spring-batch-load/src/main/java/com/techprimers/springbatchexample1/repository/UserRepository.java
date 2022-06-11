package com.techprimers.springbatchexample1.repository;

import com.techprimers.springbatchexample1.model.CategoryItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CategoryItems, Integer> {
}
