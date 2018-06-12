import javax.swing.*;

public class Formulario extends JFrame{
    private JLabel lavel1;

    public Formulario(){
        setLayout(null);
        lavel1 = new JLabel("Mariela tiene dos gatos Pampam Y Minu.");
        lavel1.setBounds(10,20,500,500);
        add(lavel1);
    }

    public static void main(String args[]){
        Formulario Formulario1 = new Formulario();
        Formulario1.setBounds(0,0,600,600);
        Formulario1.setVisible(false);
        Formulario1.setLocationRelativeTo(null);
    }
}