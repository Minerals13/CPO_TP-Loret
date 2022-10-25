/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_convertisseurobjet_loret;

/**
 *
 * @author emili
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
        nbConversions =0;
    }
    
    //CONVERTISSEUR DE L'EX 2 Du TP 1
    
    public double CelsiusVersKelvin (double tCelsius) {
        tCelsius=tCelsius+275.13;
        nbConversions++; 
        return tCelsius;
    }
    
    public double KelvinVersCelsius (double tKelvin) {
        tKelvin=tKelvin-275.13;
        nbConversions++;
        return tKelvin;
    }
    
    public double FarenheitVersCelsius (double tFarenheit) {
        tFarenheit=(tFarenheit-32)/1.8;
        nbConversions++;
        return tFarenheit;
    }
    public double CelsiusVersFarenheit (double tCelsius) {
        tCelsius=(tCelsius*1.8)+32; 
        nbConversions++;
        return tCelsius;
    }
    
    public double KelvinVersFarenheit (double tKelvin) {
        tKelvin=(tKelvin-32)/1.8+275.13;
        nbConversions++;
        return tKelvin;
    }
    
    public double FarenheinVersKelvin (double tFarenheit){
        tFarenheit=(tFarenheit-275.13)*1.8+32;
        nbConversions++;
        return tFarenheit;
    }
    
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
}
