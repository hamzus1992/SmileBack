package com.smile.backend.Controller;

import com.smile.backend.model.EtablissementEntity;
import com.smile.backend.model.PaysEntity;
import com.smile.backend.model.ZoneGeographiqueEntity;
import com.smile.backend.service.EtablissementService;
import com.smile.backend.service.PaysService;
import com.smile.backend.service.ZoneGeographiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SmileController {
    @Autowired
    EtablissementService etablissementService;

    @Autowired
    PaysService paysService;

    @Autowired
    ZoneGeographiqueService zoneGeographiqueService;

    @GetMapping(value = "/zonegeographique/")
    public List<ZoneGeographiqueEntity> findAllZoneGeographique(){
        return zoneGeographiqueService.findAll();
    }

    @GetMapping(value = "/pays/{idzonegeo}")
    public List<PaysEntity> findPaysByZoneGeo(@PathVariable("idzonegeo") long idzonegeo){
        return paysService.findByZoneGeographique(idzonegeo);
    }

    @GetMapping(value = "/etablissement/{idpays}")
    public List<EtablissementEntity> findEtablissementByPays(@PathVariable("idpays") long idpays){
        return etablissementService.findByPaysId(idpays);
    }



}
