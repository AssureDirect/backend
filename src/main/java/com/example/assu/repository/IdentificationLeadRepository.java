package com.example.assu.repository;

import com.example.assu.model.IdentificationLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificationLeadRepository extends JpaRepository<IdentificationLead, Integer> {
}
