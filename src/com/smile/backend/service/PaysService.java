package com.smile.backend.service;

import com.smile.backend.model.PaysEntity;
import com.smile.backend.repository.PaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysService {

    @Autowired
    PaysRepository paysRepository;

    public List<PaysEntity> findByZoneGeographique(long idZoneGeographique){
        return paysRepository.findByZoneGeographique_Id(idZoneGeographique);
    }
}
