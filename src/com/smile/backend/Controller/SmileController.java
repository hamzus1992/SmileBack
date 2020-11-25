package com.smile.backend.Controller;

import com.smile.backend.model.EtablissementEntity;
import com.smile.backend.model.PasswordResetTokenEntity;
import com.smile.backend.model.PaysEntity;
import com.smile.backend.model.ZoneGeographiqueEntity;
import com.smile.backend.service.EtablissementService;
import com.smile.backend.service.PaysService;
import com.smile.backend.service.UserService;
import com.smile.backend.service.ZoneGeographiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SmileController {
    @Autowired
    EtablissementService etablissementService;

    @Autowired
    PaysService paysService;

    @Autowired
    ZoneGeographiqueService zoneGeographiqueService;

    @Autowired
    UserService userService;

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

    @GetMapping(value = "/user/token/{id}")
    public PasswordResetTokenEntity findTokenByUser(@PathVariable("id") long idUser){
        return userService.findTokenByUser(idUser);
    }



}
