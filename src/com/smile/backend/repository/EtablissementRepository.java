package com.smile.backend.repository;

import com.smile.backend.model.EtablissementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtablissementRepository extends JpaRepository<EtablissementEntity, Long> {
    List<EtablissementEntity> findByPaysEtablissement_Id(long paysEtablissement_id);
}
