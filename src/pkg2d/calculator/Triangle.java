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
public class Triangle implements Shape {
    
    final private double a;
    final private double b;
    final private double c;
    
    public Triangle (double a, double b, double c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double s1;
        s1 = (a+b+c)/2.0d;
        return Math.sqrt(s1*(s1-a)*(s1-b)*(s1-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
    
}
