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
public class TrianguloRectangulo implements Planos{
    //Atributos
    private double catMay;
    private double catMen;
    private double hipotenusa;
    
    //Métodos
    public TrianguloRectangulo(double catMay, double catMen, double hipotenusa) {
        this.catMay = catMay;
        this.catMen = catMen;
        this.hipotenusa = hipotenusa;
    }

    TrianguloRectangulo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void validarTriangulo(){
        
    }
    public double getCatMay() {
        return catMay;
    }
    public void setCatMay(double catMay) {
        this.catMay = catMay;
    }
    public double getCatMen() {
        return catMen;
    }
    public void setCatMen(double catMen) {
        this.catMen = catMen;
    }
    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    
    @Override
    public double calcularArea(){
        return (catMay*catMen)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return catMay+catMen+hipotenusa;
    }
    
}
