package com.bethehero.spring.repository;


import com.bethehero.spring.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository<Case,Long> {
}
