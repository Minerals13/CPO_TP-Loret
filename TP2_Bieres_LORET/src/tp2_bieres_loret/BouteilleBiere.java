/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_loret;

/**
 *
 * @author emili
 */
//ATTENTION : CHANGER TOUS LES FLOAT PAR DES DOUBLE PAR RAPPORT AU SUJET SINON ERREUR

public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    public void lireEtiquette() {
System.out.println("Bouteille de " + nom +" (" + degreAlcool +
" degres) \nBrasserie : " + brasserie ) ;

}
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean uneOuverture) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = uneOuverture;
}

    public boolean Décapsuler(){
        if (ouverte==false) {         
            return ouverte=true;
        }else {
            System.out.println("Erreur bouteille déjà ouverte");
            return false;
        }
                      
}
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
            else chaine_a_retourner += "non" ;
            return chaine_a_retourner ; }

    
}