/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d.calculator;

/**
 *
 * @author jon
 */
public class Rectangle implements Shape {
    
    
    final private double a;
    final private double b;
    
    public Rectangle (double a, double b){
        
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return a*2+b*2;
    }
    
}
