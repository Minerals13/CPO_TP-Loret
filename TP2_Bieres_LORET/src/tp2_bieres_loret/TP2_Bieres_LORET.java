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
        BouteilleBiere uneBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        BouteilleBiere deuxBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        BouteilleBiere troisBiere = new BouteilleBiere ("1664", 6.0, "1664 Corp");
        BouteilleBiere quatreBiere = new BouteilleBiere ("8.6", 8.6, "8.6 Corp");
        
        uneBiere.lireEtiquette() ;
        deuxBiere.lireEtiquette ();
        troisBiere.lireEtiquette ();
        quatreBiere.lireEtiquette ();
        
        uneBiere.Décapsuler();
        
    
        
        
        
        
                
        
    }
}
    
