package com.smile.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYS")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PaysEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name="ZONEGEOGRAPHIQUEFK")
    private ZoneGeographiqueEntity zoneGeographique;

    @OneToMany(mappedBy = "paysEtablissement")
    @JsonIgnore
    private final List<EtablissementEntity> etablissements = new ArrayList<>();
}
