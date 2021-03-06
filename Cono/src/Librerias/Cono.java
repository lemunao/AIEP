/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias;

import java.text.DecimalFormat;

/**
 *
 * @author Bellavista_Lab305
 */
public class Cono {
    private float radio;
    private float altura;
    private float generatriz;
    
    public Cono(){
        this.radio=0;
        this.altura=0;
        this.generatriz=0;
    }
    public Cono(float radio, float altura, float generatriz){
        this.radio=radio;
        this.altura=altura;
        this.generatriz=generatriz;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the generatriz
     */
    public float getGeneratriz() {
        return generatriz;
    }

    /**
     * @param generatriz the generatriz to set
     */
    public void setGeneratriz(float generatriz) {
        this.generatriz = generatriz;
    }
    
    public float obtenerArea(){        
        return (float) Math.PI*radio*generatriz+(float)Math.PI+(radio * radio);
    }
    
    public float obtenerVolumen(){
        return (float) (Math.PI/3)*(radio* radio)*altura;
    }
    
    public String obtenerDatos(){
        StringBuilder sb = new StringBuilder();
        DecimalFormat formatoNumerico = new DecimalFormat("##,###,###.##");
        sb.append("Radio        :").append(formatoNumerico.format(radio)).append("\n");
        sb.append("Altura       :").append(formatoNumerico.format(altura)).append("\n");
        sb.append("Generatriz   :").append(formatoNumerico.format(generatriz)).append("\n");
        sb.append("Área         :").append(formatoNumerico.format(obtenerArea())).append("\n");
        sb.append("Volumen      :").append(formatoNumerico.format(obtenerVolumen())).append("\n");
        return sb.toString();
    }
}
