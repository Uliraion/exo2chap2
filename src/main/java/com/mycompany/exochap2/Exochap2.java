/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exochap2;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Exochap2 {

    public static void main(String[] args) {
        Jouet poupéeBarbie = new Jouet ("Poupée Barbie", "Plastique", 15, 2);
        Jouet echecLum = new Jouet ("Echecs Lumineux", "verre", 45, 1);
        
        Scanner input = new Scanner(System.in);
        int choix = -1;
        while(choix != 3){
        System.out.print("Saisir chiffre :");
        choix = Integer.parseInt(input.next());  
        switch(choix)
        {
            case 0 -> {
                poupéeBarbie.affiche();
                echecLum.affiche();
                break;
            }
            
            case 1 -> {
                System.out.print("Saisir pourcentage :");
                int prct = Integer.parseInt(input.next());
                poupéeBarbie.setPrix((int)(poupéeBarbie.getPrix()*(1+prct/100)));
                echecLum.setPrix((int)(echecLum.getPrix()*(1+prct/100)));
                poupéeBarbie.affiche();
                echecLum.affiche();
                break;
            }
            case 2 -> {
                poupéeBarbie.setCategorie(echecLum.getCategorie());
                echecLum.setCategorie(poupéeBarbie.getCategorie());
                poupéeBarbie.affiche();
                echecLum.affiche();
                break;          
}
}
    }
}
}
