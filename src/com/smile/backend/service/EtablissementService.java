package com.smile.backend.service;

import com.smile.backend.model.EtablissementEntity;
import com.smile.backend.repository.EtablissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtablissementService {

    @Autowired
    EtablissementRepository etablissementRepository;

    public List<EtablissementEntity> findByPaysId(long idPays){
        return etablissementRepository.findByPaysEtablissement_Id(idPays);
    }
}
