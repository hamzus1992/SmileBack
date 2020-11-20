package com.smile.backend.repository;

import com.smile.backend.model.EtablissementEntity;
import com.smile.backend.model.PaysEntity;
import com.smile.backend.model.ZoneGeographiqueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaysRepository extends JpaRepository<PaysEntity, Long> {
    List<PaysEntity> findByZoneGeographique_Id(long zoneGeographique_id);
}
