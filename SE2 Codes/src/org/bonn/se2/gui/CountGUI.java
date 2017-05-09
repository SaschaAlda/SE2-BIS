package org.bonn.se2.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CountGUI implements ActionListener {
    
    JFrame frame = new JFrame("CountExample");
    JButton button = new JButton("Button");
    JTextField field = new JTextField("0" , 5);
    JLabel label = new JLabel("Counter");
    
 
    /*
    Methode wird nach dem Druecken des Buttons aufgerufen!
    */
    public void actionPerformed(ActionEvent e) {
        // aktualisiere den Titel des Buttons
    	String str = field.getText();
    	int currentZahl = new Integer( str ).intValue();
    	currentZahl++;
        field.setText( currentZahl + "" ); 
    }
   
    public void show() {
        button.setText("Add 1");
        // Registriere dieses Frame (= this!) als Listener des Buttons!
        button.addActionListener(this);
        
        // Setze den LayoutManager
        frame.setLayout(new FlowLayout());
        
        // Fuege GUI-Elemente dem Frame hinzu
        frame.add( label );
        frame.add( field );
        frame.add ( button );
        
        
        // Mache das Frame sichtbar
        frame.setSize(250, 100);
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        CountGUI gui = new CountGUI();
        gui.show();
    }
  
}
