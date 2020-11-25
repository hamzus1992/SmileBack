package com.smile.backend.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "USER")
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    @Column(length = 60)
    private String password;

    @OneToOne
    ZoneGeographiqueEntity zoneGeographiqueEntity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ZoneGeographiqueEntity getZoneGeographiqueEntity() {
        return zoneGeographiqueEntity;
    }

    public void setZoneGeographiqueEntity(ZoneGeographiqueEntity zoneGeographiqueEntity) {
        this.zoneGeographiqueEntity = zoneGeographiqueEntity;
    }
}
