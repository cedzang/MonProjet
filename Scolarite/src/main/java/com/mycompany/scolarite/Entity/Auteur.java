/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite.Entity;

import java.util.Objects;

/**
 *
 * @author root
 */
public class Auteur {
    private String nom;
    private String matricule;
    private String email;
    private long telephone;
    
    public Auteur(){
    
    }

    public Auteur(String nom, String matricule, String email, long telephone) {
        this.nom = nom;
        this.matricule = matricule;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Auteur{" + "nom=" + nom + ", matricule=" + matricule + ", email=" + email + ", telephone=" + telephone + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nom);
        hash = 89 * hash + Objects.hashCode(this.matricule);
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + (int) (this.telephone ^ (this.telephone >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auteur other = (Auteur) obj;
        return true;
    }
    
    
    
}
