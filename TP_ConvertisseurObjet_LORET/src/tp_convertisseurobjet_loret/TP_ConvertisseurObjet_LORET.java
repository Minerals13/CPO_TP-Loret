/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_convertisseurobjet_loret;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class TP_ConvertisseurObjet_LORET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conversion = new Convertisseur ();
        
        
        double temp; {
        //temp=conversion.CelviusVersFarenheit(20);
        //}
        
        
        //System.out.println(temp);
        //System.out.println(conversion);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle conversion voulez-vous faire ? F->C (1) / C->F (2) / K->C (3) / C->K (4) / K->F (5) / F->K (6) // F,C,K étant respectueusement Farenheit, Celsius, Kelvin");
        int choix = scanner.nextInt();
        System.out.println("Quelle température voulez-vous convertir ?");
        int tempI = scanner.nextInt ();
        
        if (choix ==1) {
            temp=conversion.FarenheitVersCelsius(tempI);
            System.out.println(temp);
        }else if(choix==2) {
            temp=conversion.CelsiusVersFarenheit(tempI);
            System.out.println(temp);   
        }else if(choix==3) {
            temp=conversion.KelvinVersCelsius(tempI);
            System.out.println(temp);
        }else if(choix==4) {
            temp=conversion.CelsiusVersKelvin(tempI);
            System.out.println(temp);
        }else if (choix==5) {
            temp=conversion.KelvinVersFarenheit(tempI);
            System.out.println(temp);
        }else if (choix==6) {
            temp=conversion.FarenheinVersKelvin(tempI);
            System.out.println(temp);
        }
        
        
    
    
    
    }
    
}
