import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

    JButton boton1;
    public Formulario(){
        setLayout(null); //crear o poner componentes a travez de coordenadas
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this); //espera a que el boton se precione
    }

    public void actionPerformed(ActionEvent e){ //captura el evento. boton precionado.
    if(e.getSource() == boton1){ //se guarda en la letra 'e' que se declario en ActionEvent.
        System.exit(0); //accion de: cerrar interfaz grafica.
        }
    }
//      -----------VISUAL-----------
    public static void main(String args[]){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }   
}