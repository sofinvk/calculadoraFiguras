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
 * @author zf
 */
public class Rectangulo implements Planos{
    //Atributo
    private double base;
    private double altura;
    
    //Métodos
    public Rectangulo(){
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
  
    @Override
    public double calcularPerimetro() {
        return (base+altura)*2;
    }
    
    @Override
    public double calcularArea(){
        return base*altura;
    }
}