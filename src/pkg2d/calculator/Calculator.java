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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public ShapeSelection data = new ShapeSelection();
    
    public static void main(String[] args) {
        Calculator app = new Calculator ();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new ShapeSelection().setVisible(true);
            }
        });
    }
    
}

