import javax.swing.*;

public class Formulario extends JFrame{

    public Formulario(){
        setLayout(null);
    }

    public static void main(String args[]){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 400, 550);// X, Y, Ancho, Alto 
        formulario1.setVisible(true);// Para lograr ver la interfaz
        formulario1.setLocationRelativeTo(null);// En el centro sin importar Bounds
        formulario1.setResizable(true);// Permiso de modificar tamanio
    }
}