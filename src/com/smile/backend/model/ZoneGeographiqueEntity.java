package com.smile.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ZONEGEOGRAPHIQUE")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ZoneGeographiqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @OneToMany(mappedBy = "zoneGeographique")
    @JsonIgnore
    private final List<PaysEntity> paysEntities = new ArrayList<>();
}
