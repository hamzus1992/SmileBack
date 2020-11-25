package com.smile.backend.dto;

import java.util.Date;

public class PasswordDto {

    private Long idUser;

    private Date dateOfBirth;

    private  String token;

    private Long idZoneGeographique;

    private Long idPays;

    private Long idEtablissement;

    private String newPassword;

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdZoneGeographique() {
        return idZoneGeographique;
    }

    public void setIdZoneGeographique(Long idZoneGeographique) {
        this.idZoneGeographique = idZoneGeographique;
    }

    public Long getIdPays() {
        return idPays;
    }

    public void setIdPays(Long idPays) {
        this.idPays = idPays;
    }

    public Long getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(Long idEtablissement) {
        this.idEtablissement = idEtablissement;
    }
}
