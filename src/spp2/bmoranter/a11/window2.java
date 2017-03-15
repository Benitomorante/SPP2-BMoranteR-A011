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
public class window2 extends Frame {
   //Atributos: 3 botones.
    private final Button bNorte, bSur, bEste, bOeste,bCentro;
    
    //Constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public window2 (){
        super("window 2");
        setLayout(new BorderLayout());
        
        bNorte = new Button("Soy el botón norte");
        add (bNorte, BorderLayout.NORTH);
        
        bSur = new Button("Soy el botón sur");
        add (bSur, BorderLayout.SOUTH);
        
        bEste = new Button("Soy el botón este");
        add (bEste, BorderLayout.EAST);
        
        bOeste = new Button("Soy el botón oeste");
        add (bOeste, BorderLayout.WEST);
        
        bCentro = new Button("Soy el botón centro");
        add (bCentro, BorderLayout.CENTER);
        
        setSize(600,400);
        setVisible(true);
    
    }   
}


