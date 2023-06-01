package com.example.assu.repository;

import com.example.assu.model.CartographieDesRisques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartographieDesRisquesRepo extends JpaRepository<CartographieDesRisques, Integer> {
}
