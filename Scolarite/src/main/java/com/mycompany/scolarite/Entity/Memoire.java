/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.scolarite.Entity;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author root
 */
public class Memoire {
    private String titre;
    private String datePublication;
    private String resume;
    private String abstracts;
    private String document;
    private List<String> motCles;
    
    public Memoire(){
    
    }

    public Memoire(String titre, String datePublication, String resume, String abstracts, String document, List<String> motCles) {
        this.titre = titre;
        this.datePublication = datePublication;
        this.resume = resume;
        this.abstracts = abstracts;
        this.document = document;
        this.motCles = motCles;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<String> getMotCles() {
        return motCles;
    }

    public void setMotCles(List<String> motCles) {
        this.motCles = motCles;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.titre);
        hash = 73 * hash + Objects.hashCode(this.datePublication);
        hash = 73 * hash + Objects.hashCode(this.resume);
        hash = 73 * hash + Objects.hashCode(this.abstracts);
        hash = 73 * hash + Objects.hashCode(this.document);
        hash = 73 * hash + Objects.hashCode(this.motCles);
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
        final Memoire other = (Memoire) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Mmoire{" + "titre=" + titre + ", datePublication=" + datePublication + ", resume=" + resume + ", abstracts=" + abstracts + ", document=" + document + ", motCles=" + motCles + '}';
    }
    
    
    
}
