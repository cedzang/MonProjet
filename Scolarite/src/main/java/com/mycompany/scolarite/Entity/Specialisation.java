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
public class Specialisation {
    private String titre;
    
    public Specialisation(){
    
    }

    public Specialisation(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.titre);
        return hash;
    }

    @Override
    public String toString() {
        return "Specialisation{" + "titre=" + titre + '}';
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
        final Specialisation other = (Specialisation) obj;
        return true;
    }
    
}
