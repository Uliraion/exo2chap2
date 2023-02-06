/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exochap2;

/**
 *
 * @author troll
 */
public class Jouet {
    private String nom;
    private String matiere;
    private int prix;
    public int categorie;
    public Jouet(String unNom, String uneMatiere, int unPrix, int uneCategorie) {
// constructeur
        this.nom = unNom;
        this.matiere = uneMatiere;
        this.prix = unPrix;
        this.categorie = uneCategorie;
    }
        public void setCategorie(int uneCategorie){
            this.categorie=uneCategorie;
        }
                
        public int getCategorie(){
            return(this.categorie);
        }
         public void setPrix (int unPrix){
         this.prix= unPrix;
         }
         public int getPrix(){
         return(this.prix);
         }
         public void newCat (int nouvCat){
         this.categorie = nouvCat;  
         }
        
    public void affiche(){
    System.out.println (this.nom + this.matiere + this.prix + this.categorie);
}
    
    }
