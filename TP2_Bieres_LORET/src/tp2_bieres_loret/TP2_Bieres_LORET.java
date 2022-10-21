/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_loret;

/**
 *
 * @author emili
 */
public class TP2_Bieres_LORET {

//ATTENTION : CHANGER TOUS LES FLOAT PAR DES DOUBLE PAR RAPPORT AU SUJET SINON ERREUR
//ATTENTION : CHANGER TOUS LES FLOAT PAR DES DOUBLE PAR RAPPORT AU SUJET SINON ERREUR
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxbieres = new BouteilleBiere() ;
        deuxbieres.nom="Leffe";
        deuxbieres.degreAlcool=6.6;
        deuxbieres.brasserie="Abbaye de Leffe";
        deuxbieres.lireEtiquette();
                
        
    }
    
}
