/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * AUTHOR: SOFIA NOVAK
 * DATE: 26/09/17
 */
package figurasgeometricas2d;

/**
 *
 * @author P02
 */
public class Circulo implements Planos{
    //Atributos
    private double radio;
    
    //Constructor
    public Circulo (double radio){
        this.radio=radio;
    }
    public Circulo(){
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI* (radio*radio);
    }
    @Override
    public double calcularPerimetro(){
        return 2*(Math.PI* radio);
    }
    
}
