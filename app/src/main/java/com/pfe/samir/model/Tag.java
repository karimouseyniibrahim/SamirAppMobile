package com.pfe.samir.model;

/**
 * Created by Etudiant RSD on 08/06/2019.
 */
public class Tag {
    String code, numero,description;

    public Tag(String code, String numero, String description) {
        this.code = code;
        this.numero = numero;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
