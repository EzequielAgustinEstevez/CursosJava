import javax.swing.*;

public class Formulario extends JFrame{

    private JTextField textField1;
    private JScrollPane scrollPane1;// declare barras de scroll
    private JTextArea textarea1;

    public Formulario(){
        setLayout(null);
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);
        add(textField1);

        textarea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textarea1); // barras de scroll
        scrollPane1.setBounds(10,50,400,300);
        add(scrollPane1);
    }

    public static void main(String arg[]){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}