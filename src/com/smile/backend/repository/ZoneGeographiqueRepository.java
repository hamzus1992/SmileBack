package com.smile.backend.repository;

import com.smile.backend.model.ZoneGeographiqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneGeographiqueRepository extends JpaRepository<ZoneGeographiqueEntity, Long> {
}
