/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_relation_loret;

import Armes.Arme;
import Armes.baton;
import Armes.épée;
import java.util.ArrayList;

/**
 *
 * @author emili
 */
public class TP3_Relation_LORET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        épée Exca = new épée("Excalibur", 7, 5);
        épée Dura = new épée("Durandal", 4, 7);
        
        baton Che = new baton("Chêne", 4, 7);
        baton Cha = new baton("Charme", 5, 6);
        
        ArrayList<Arme> recapArme = new ArrayList();
        recapArme.add(Exca);
        recapArme.add(Dura);
        recapArme.add(Cha);
        recapArme.add(Che);
        
        
        int tailleArme;
        tailleArme = recapArme.size();
        //tailleArme = tailleArme-1;
        
        for (int i=0;i<tailleArme;i++) {
            
            System.out.println(recapArme.get(i));
            
        }
        Magicien Mas = new Magicien ("Masdak", 50, true)
        Magicien Dumb = new Magicien ("Dumbledore", 15, false)
                
        Guerrier John = new Guerrier ("John Snow", 60, true)
        Guerrier Ary = new Guerrier ("Arya Stark",20, false)
                
        
    }
    
}
