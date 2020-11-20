package com.smile.backend.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ETABLISSEMENT")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class EtablissementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name="PAYSFK")
    private PaysEntity paysEtablissement;

}
