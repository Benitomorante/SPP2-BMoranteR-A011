/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.a11;
import java.awt.*;
/**
 *
 * @author Benito Mv
 */
public class window3 extends Frame{
    //Atributos: 3 botones.
    private final Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public window3 (){
        super("Ventana 3");
        setLayout(new GridLayout());
        
        b1 = new Button("1");
        add (b1);
        b2 = new Button("2");
        add (b2);
        b3 = new Button("3");
        add (b3);
        b4 = new Button("4");
        add (b4);
        b5 = new Button("5");
        add (b5);
        b6 = new Button("6");
        add (b6);
        b7 = new Button("7");
        add (b7);
        b8 = new Button("8");
        add (b8);
        b9 = new Button("9");
        add (b9);
        
        
        setSize(600,400);
        setVisible(true);
    
    }
}
