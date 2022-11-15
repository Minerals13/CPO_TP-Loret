/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author emili
 */
public class Arme {
    
    String nom;
    int nivAttaque;
    
    public Arme(String n, int i){
        nom=n;
        nivAttaque=i;
    }
    
    @Override
    public String toString() {
        String outil;
        outil = "Nom de l'arme: "+nom+"\n Niveau d'attaque : "+nivAttaque ; 
        return outil;
    }
    
}

