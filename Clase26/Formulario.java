import javax.swing.*;

public class Formulario extends JFrame{

    private JLabel lavel1;
    private JLabel lavel2;

    public Formulario(){
        setLayout(null);
        lavel1 = new JLabel("Interfaz grafica.");
        lavel1.setBounds(10, 20, 300, 30);
        add(lavel1);
        lavel2 = new JLabel("Version 1.0");
        lavel2.setBounds(10, 100, 100, 30);
        add(lavel2); 
    }

    public static void main(String args[]){
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0, 0, 300, 200);
    formulario1.setResizable(false);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
    }

}