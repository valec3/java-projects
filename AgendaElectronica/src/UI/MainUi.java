package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUi extends JFrame {
    private JPanel contenedor;
    private JPanel formulario;
    private JPanel Inputs;
    private JPanel Labels;
    private JPanel RightForm;
    private JPanel LeftForm;
    private JTextField labelDni;
    private JTextField labelName;
    private JTextField labelLastname;
    private JButton btnBack;
    private JButton btnNext;
    private JButton guardarButton;
    private JTextField indice_label;
    private JTextField labelAddress;
    private JTextField labelTelephone;
    private JTextField labelDateBirthday;


    String dnis[]=new String[10];
    String names[]=new String[10];
    String lastnames[]=new String[10];
    String addresses[]=new String[10];
    String dateNac[]=new String[10];
    String telephones[]=new String[10];
    public void updateLabelsForm(int idx){
        labelDni.setText(dnis[idx]);
        labelAddress.setText(addresses[idx]);
        labelDateBirthday.setText(dateNac[idx]);
        labelName.setText(names[idx]);
        labelLastname.setText(lastnames[idx]);
        labelTelephone.setText(telephones[idx]);
    }

    public MainUi(){
        setTitle("AGENDA");
        setContentPane(contenedor);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indice = indice_label.getText();
                Integer indiceNum = Integer.parseInt(indice);
                if (indiceNum<1){
                    return;
                }
                indiceNum=indiceNum-1;
                indice = String.valueOf(indiceNum);
                indice_label.setText(indice);
                updateLabelsForm(indiceNum);
            }
        });
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indice = indice_label.getText();
                Integer indiceNum = Integer.parseInt(indice);
                if (indiceNum>8){
                    return;
                }
                indiceNum=indiceNum+1;
                indice = String.valueOf(indiceNum);
                indice_label.setText(indice);
                updateLabelsForm(indiceNum);
            }
        });
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indice = indice_label.getText();
                Integer indiceNum = Integer.parseInt(indice);

                dnis[indiceNum] = labelDni.getText();
                names[indiceNum] = labelName.getText();
                lastnames[indiceNum] = labelLastname.getText();
                addresses[indiceNum] = labelAddress.getText();
                telephones[indiceNum] = labelTelephone.getText();
                dateNac[indiceNum] = labelDateBirthday.getText();

            }
        });


    }

}
