package UI;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel contenedor;
    private JPanel formulario;
    private JPanel labelDni;
    private JTextField ingreseSuDniTextField;
    public Main(){
        setTitle("AGENDA");
        setContentPane(contenedor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Main();
    }
}
