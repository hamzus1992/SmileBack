package com.smile.backend.service;

import com.smile.backend.model.ZoneGeographiqueEntity;
import com.smile.backend.repository.ZoneGeographiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneGeographiqueService {

    @Autowired
    ZoneGeographiqueRepository zoneGeographiqueRepository;

    public List<ZoneGeographiqueEntity> findAll(){
        return zoneGeographiqueRepository.findAll();
    }
}
