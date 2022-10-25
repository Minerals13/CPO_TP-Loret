/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_loret;

/**
 *
 * @author emili
 */
public class TP2_manip_LORET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        Tartiflette assiette3 = assiette2;  // 2 tartiflettes ont été créées. Assiette 2 et 3 référencent la même
        assiette2 = assiette1; 
        assiette1 = assiette3;
        //On inverse les valeurs des assiettes 1 et 2 en utilisant une variable intermédiaire 3
        System.out.println("nb de calories de Assiette 1 : "
                + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        
        
        //Moussaka assiette666 = assiette1 ;
        //Moussaka assiette667 = new Tartiflette(); 
        //Aucune n'est bonne, si le type d'objet n'est pas le même on ne peut pas référencer l'un des 2 objets avec la référence de l'autre
    }
}
