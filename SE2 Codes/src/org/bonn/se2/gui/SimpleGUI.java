package org.bonn.se2.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SimpleGUI implements ActionListener {
    
    JFrame frame = new JFrame("GuiExample");
    JButton button = new JButton("Button");
    int number = 1;
    
 
    /*
    Methode wird nach dem Druecken des Buttons aufgerufen!!
    */
    public void actionPerformed(ActionEvent e) {
        // aktualisiere den Titel des Buttons
        button.setText("Clicked # " + number++ ); 
    }
   
    public void show() {
        button.setText("Clicked # 0");
        // Registriere dieses Frame (= this!) als Listener des Buttons!
        button.addActionListener(this);
        
        // Fuege Button dem Frame hinzu
        frame.add ( button );
        
        // Mache das Frame sichtbar
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
     
    public static void main(String[] args) {
        SimpleGUI gui = new SimpleGUI();
        gui.show();
    }
  
}
