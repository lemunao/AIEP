/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cono;

import Librerias.Cono;

/**
 *
 * @author Bellavista_Lab305
 */
public class gestionCono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float radio=19;
        float altura=12;
        float generatriz=16;
        Cono c = new Cono();
        c.setAltura(altura);
        c.setRadio(radio);
        c.setGeneratriz(generatriz);  
        
        obtenerDatos(c);
        
        Formc6 form = new Formc6();
        
    }
    
    public static void obtenerDatos(Cono c){
        System.out.println(c.obtenerDatos());
    }
}
