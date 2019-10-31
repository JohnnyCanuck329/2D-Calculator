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
public class Circle implements Shape {
    
    final private double a;
    
    public Circle(double a) {
        
        this.a = a;
        
    }

    @Override
    public double getArea() {
        return Math.PI*(a*a);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*a*2;
    }
    
}
